package ch02;
import java.sql.*;
/**
 5.14
 jdbc 활용
 */
public class JdbcExample {
    public static void main(String[] args) {

        //데이터베이스 접근 주소
        //String url = "jdbc:mysql://127.0.0.1";
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pass = "asd1234";

        //jdbc를 쓰기 위해 필요한 클래스(구성요소)
        Connection conn = null;
        Statement stmt = null;
        ResultSet rsts = null;

        //실행
        try {
            //1.데이터베이스 연결 요청
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("mysql db 연결 성공");

            //2.스테이트먼트 생성
            stmt = conn.createStatement();

            //2-1.쿼리 실행해보기
            //rsts = stmt.executeQuery("select * from tb_student where no = 20170001");
            rsts = stmt.executeQuery("select * from tb_student");

            //3.결과 실행
            while (rsts.next()) {
                String no = rsts.getString("no");
                String name = rsts.getString("name");
                String gender = rsts.getString("gender");
                int age = rsts.getInt("age");
                System.out.print("no:"+no +"\t");
                System.out.print("name:"+name +"\t");
                System.out.print("gender:"+gender +"\t");
                System.out.print("age:"+age +"\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //jdbc를 쓰면 db에서 자원을 얻기 위해 대기하는 문제가 생긴다.
            //4.자원 해제 - 역순으로
            try {
                //ResultSet 종료
                rsts.close();
                //Statement 종료
                stmt.close();
                //Connection 종료
                conn.close();

            } catch (SQLException e) {
                System.out.println("자원해제 중 오류:"+e.getMessage());
            }
        }

    }//main
}//class
