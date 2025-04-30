package _exception;
/**
 * 4.24
 * 사용자정의 예외클래스 만들기
 */
public class ExceptionTest1 {
    //main
    public static void main(String[] args) {
        /*
        사용자정의 예외클래스 사용해보기
         */
        int result = 0;

        Calc2 calc2 = new Calc2();
        try {
            calc2.divide(10, 0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }

    }//end of main
}//end of class

class Calc2 {

    public int divide(int n1, int n2) throws DivideByZeroException {
        int result = 0;

        try {
            result = n1/ n2;

        } catch (Exception e) {
            //사용자정의 예외클래스 사용해보기
            throw new DivideByZeroException("0으로 나누지 마시오");
        }
        return result;
    }

}// end of Calc2
