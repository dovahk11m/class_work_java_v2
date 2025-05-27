package _exception;
/**
 * 4.24
 * 예외처리 연습
 */
public class ArrayExceptionHandling {

    //main
    public static void main(String[] args) {

        //배열길이4, 인덱스길이5
        int[] arr = {1, 2, 3, 4, 5};

        /*
        예외처리

        try-catch
        try-catch-finally

        구문의 이해
         */
        try {
            // try 예외가 발생할 가능성이 있는 코드를 넣어준다
            for (int i = 0; i < 10; i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e1) { //배열 초과 예외 코드
            System.out.println("배열의 범위를 벗어났다");

        } catch (Exception e2) {
            System.out.println(e2.getClass());

            // catch 예외가 발생했다면 예외처리 코드를 넣어준다
//            System.out.println("예외처리 - " + e.getMessage());

        }//end of try-catch

        System.out.println("비정상 종료되지 않았습니다");

    }//end of main
}//end of AEH
