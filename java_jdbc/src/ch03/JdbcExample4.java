package ch03;
import java.sql.*;
/**
 5.15
 try with resource 구문 소개
 개발자들이 finally에 리소스 해제 구문 쓰는걸 까먹어서
 try with resource 구문이 탄생했다.
 아직은 좀 불안정한듯
 */
public class JdbcExample4 {
    public static void main(String[] args) throws SQLException {
        //mysql 서버 접근 필수요소 - 주소, 계정, 비번
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        //try{} catch(){};
        //try(){} catch(){};
        //try with resource 구문을 사용하면 finally 뒤에 자원해제 안해줘도 된다.
        try (
                Connection conn = DriverManager.getConnection(url, user, pwd);
                PreparedStatement stmt = conn.prepareStatement("select*from tb_student");
                ResultSet rs = stmt.executeQuery()
        ) {
            System.out.println("db 연결 성공");
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
}//class
