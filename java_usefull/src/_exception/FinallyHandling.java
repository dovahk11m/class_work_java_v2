package _exception;
/**
 * 4.24
 * 예외처리 연습
 */
import java.util.Scanner;

public class FinallyHandling {

    //main
    public static void main(String[] args) {

        /*
        try-catch-finally

         */
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자를 입력해주세요");
            int result = scanner.nextInt();
            System.out.println("입력한 숫자: " + result);

//            return;

        } catch (Exception e) {
            System.out.println("입력 오류 !!!");
        } finally {
            /*
            finally 반드시 수행돼야 하는 코드를 입력한다.
            심지어 return 키워드를 넣어도 finally 수행이 된다.
             */
            scanner.close(); //스트림을, 자원을 해제한다.
            System.out.println("자원을 해제했다");
        }

        System.out.println("프로그램이 비정상적으로 종료되지 않았음");

    }//end of main
}
