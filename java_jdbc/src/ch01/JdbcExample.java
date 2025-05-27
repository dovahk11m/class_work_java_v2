package ch01;
import java.sql.*;
/**
 5.11 자바로 db에 접근하는 방법을 배운다.
 DB 접근 기술
 MySQL 8 버전 기준

 DB 접근 기술은 정형화돼 있다.
 */
public class JdbcExample {
    public static void main(String[] args) {
//        String url = "jdbc:mysql://192.168.0.132:3306";
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "password";
        /*
        커넥션 객체를 힙 메모리에 올리기 위해서는
        미리 약속된 드라이버 매니저
        Driver Manager 가 필요하다.
         */
        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("데이터베이스에 성공적으로 연결됐어요");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스 연결에 실패했어요");
        }
    }//main
}//class
