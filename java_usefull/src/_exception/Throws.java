package _exception;
/**
 * 4.24
 * 예외처리 throws
 * 예외처리 던지기(미루기)
 */
public class Throws {

    //main
    public static void main(String[] args) {

        Calc calc = new Calc();

//        try {
//            int result = calc.divide(10, 0);
//            System.out.println("result: " + result);
//
//        } catch (Exception e) {
//            System.out.println(e.getClass());
//            System.out.println("에러발생");
//        }

        try {
            calc.divide(10, 0);
        } catch (Exception e) {
            System.out.println("인수로 0을 넣지 마시오");
        }


    }//end of main
}//end of class

class Calc {

    /*
    예외가 발생할 수 있는 코드에서
    직접 예외처리를 할 수 도 있지만

    사용하는 시점에
    알아서 적절하게 예외처리를 던질 수 있다.
     */
    public int divide(int n1, int n2) throws ArithmeticException, Exception {
        //이렇게 throws를 여러개 던질 수도 있다 - 강제성

        return n1 / n2;
    }

}//end of Calc