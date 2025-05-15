package ch03;
import java.sql.*;
/**
 5.15
 jdbc 연습
 */
public class JdbcExample3 {
    public static void main(String[] args) throws SQLException {
        //mysql 서버 접근 필수요소 - 주소, 계정, 비번
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pass = "asd1234";

        //java => mysql 접근 필수요소
        /*
        jdbc 인터페이스에 맞춰 구현된 jdbc 구현클래스가 필요
        이용자는 sql 제품별 library 를 연결하면 된다.
         */

        Connection conn = null;
        //url user pass 를 입력해서 논리적 연결요청

        //Statement stmt = null;
        //SQL 쿼리를 실행하기 위한 인터페이스
        //ststement 보다 더 우수한 인터페이스가 있다.
        PreparedStatement pstmt = null;

        ResultSet rsts = null;
        //쿼리 실행 결과로 반환되는 데이터를 저장


        try {
            //Driver 입력 (안해도 됨 Driver가 자동 로드)
            //Class.forName("com.mysql.cj.jdbc.Driver");

            //1.db 연결 요청
            conn = DriverManager.getConnection(url, user, pass);

            //2.stmt 객체 생성
            //stmt = conn.createStatement();

            //2.PreparedStatement생성 (미리 쿼리 구문 일부를 만들어 둔다.)
            pstmt = conn.prepareStatement("select*from tb_student where no = ? and age = ?");

            //pstmt.set.. // ? 순서 기준으로 해당 데이터 타입을 명시한다.
            pstmt.setString(1, "20170001");
            pstmt.setInt(2,25);

            //3.쿼리를 만들고 실행 요청 (수행후 ResultSet 객체 생성됨)
            //rsts = stmt.executeQuery("select*from tb_student"); //뒷줄공백추가

            //3.쿼리실행
            rsts = pstmt.executeQuery();


            //4. 결과 (응용해서 프로그래밍 처리)
            /*
            결과 추출하는 기법
            Set 자료 구조에서
             */
            while (rsts.next()) { //다음에 어떤 요소가 있는가? true 라면 실행
                String no = rsts.getString("no");
                String name = rsts.getString("name");
                int age = rsts.getInt("age");

                System.out.println("no:" + no + ", name:" + name + ", age:" + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rsts != null) rsts.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

    }//main
}//class
