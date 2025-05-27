package _my;
import java.sql.*;
public class MyJdbcTest {
    public static void main(String[] args) {

        //접근주소
        String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul";
        String user = "root";
        String pass = "asd1234";

        //클래스
        Connection conn = null;
        Statement stmt = null;
        ResultSet rsts = null;

        //실행
        try {
            //1.커넥션
            conn = DriverManager.getConnection(url, user, pass);
            //2.스테이트먼트
            stmt = conn.createStatement();
            //3.리절트셋
            rsts = stmt.executeQuery("select e.emp_no, e.first_name, e.last_name, s.salary" +
                    " from employees as e" +
                    " join salaries as s on e.emp_no = s.emp_no" +
                    " where (e.hire_date - e.birth_date) < 210000 and s.to_date = '9999-01-01'");

            //결과 실행
            while (rsts.next()) {
                int emp_no = rsts.getInt("e.emp_no");
                String first_name = rsts.getString("e.first_name");
                String last_name = rsts.getString("e.last_name");
                int salary = rsts.getInt("s.salary");
                System.out.print(emp_no +"\t");
                System.out.print(first_name +"\t");
                System.out.print(last_name +"\t");
                System.out.print(salary +"\t");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //자원 해제 - 역순으로
            try {
                rsts.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("자원해제 중 오류:" + e.getMessage());
            }
        }

    }//main
}//class
