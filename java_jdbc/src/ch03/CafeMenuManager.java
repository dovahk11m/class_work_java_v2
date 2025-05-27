package ch03;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 5.15
 jdbc를 활용해
 간단한 CRUD문 만들어보기
 */
public class CafeMenuManager {

    //mysql 서버 접근 필수요소 - 주소, 계정, 비번
    private static final String URL = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PWD = "asd1234";

    //TODO 스태틱 메서드로 기능을 분리해서 만들어보자
    //insertMenu - 메뉴 추가
    public static void insertMenu(String name, int price, String category) {
        //sql 쿼리를 여기에 넣어보자
        //insert into menu(name, price, category)values
        //('아메리카노', 2000, '커피');

        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {

            String sql = "insert into menu(name, price, category)values (?, ?, ?) ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, price);
            stmt.setString(3, category);

            //쿼리실행(insert, update, delete)
            int rowsInsertedCount = stmt.executeUpdate();
            System.out.println(rowsInsertedCount + "개의 메뉴가 추가됨");


        } catch (Exception e) {
            System.out.println("메뉴 추가 중 오류:" + e.getMessage());
        }
    }//insertMenu

    //updateMenuPrice - 메뉴 가격 변경
    //update menu set price = 3000 where name = "아메리카노";
    public static void updateMenuPrice(int price, String name) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {

            String sql = "update menu set price = ? where name = ? ";

            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1, price);
            psmt.setString(2, name);

            int rowsUpdatedCount = psmt.executeUpdate();

            System.out.println(rowsUpdatedCount);

        } catch (Exception e) {
            System.err.println("메뉴 가격 수정 오류:" + e.getMessage());
            e.printStackTrace();
        }
    }//updateMenuPrice

    //deleteMenu - 메뉴 삭제
    public static void deleteMenu(String name) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {

            String sql = "delete from menu where name = ? ";

            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);

            int rowsUpdatedCount = psmt.executeUpdate();

            System.out.println(rowsUpdatedCount);

        } catch (Exception e) {
            System.err.println("메뉴 삭제 오류:" + e.getMessage());
            e.printStackTrace();
        }
    }//deleteMenu

    //showMenu
    public static void showMenu(String name) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {

            String sql = "select*from menu where name = ? ";

            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);

            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                String showName = rs.getString("name");
                int showPirce = rs.getInt("price");

                System.out.println("제품명:" + showName + ", 가격:" + showPirce);
            }


        } catch (Exception e) {
            System.err.println("메뉴 삭제 오류:" + e.getMessage());
            e.printStackTrace();
        }
    }//showMenu

    // 모든 메뉴 조회 메서드
    public static void selectAllMenu() {
        // 1. 반드시 쿼리를 확인하고 복사 붙여 넣기
        // 2. 메서드의 파라미터 결정
        // 3. 필요한 코드를 구현 , 테스트 까지 (DB 에서도 확인)
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "SELECT * FROM menu";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            System.out.println("\n현재 메뉴 목록:");
            while (resultSet.next()) {
                System.out.println("[" + resultSet.getString("category") + "] " +
                        resultSet.getString("name") + " - " + resultSet.getInt("price") + "원");
            }
        } catch (Exception e) {
            System.err.println("메뉴 조회 중 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //main
    public static void main(String[] args) {

//        insertMenu("아메리카노", 2000, "커피류");
//        updateMenuPrice(2500, "아메리카노");
//        deleteMenu("아메리카노");
//        showMenu("아메리카노");
//        showMenu("아샷추");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 카페 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 가격 수정");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 메뉴 목록 조회");
            System.out.println("5. 종료");
            System.out.print("선택 (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // switch 사용해서 동작 흐름 만들어 보기
            switch (choice) {
                case 1:
                    System.out.println("메뉴이름:");
                    String name = scanner.nextLine();
                    System.out.println("메뉴가격:");
                    int price = scanner.nextInt();

                    //버그발생우려(정수값을 받았으므로)
                    scanner.nextLine(); //버퍼지우기

                    System.out.println("카테고리:");
                    String category = scanner.nextLine();

                    insertMenu(name,price,category);
                    break;
                case 2:
                    System.out.println("수정할 메뉴이름:");
                    String newName = scanner.nextLine();
                    System.out.println("수정할 메뉴가격:");
                    int newPrice = scanner.nextInt();

                    updateMenuPrice(newPrice, newName);
                    break;
                case 3:
                    System.out.println("삭제할 메뉴이름:");
                    String delName = scanner.nextLine();

                    deleteMenu(delName);
                    break;
                case 4:
                    selectAllMenu();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("1~5 숫자를 입력하시오");
            }//switch
        }//while

    }//main
}//class
