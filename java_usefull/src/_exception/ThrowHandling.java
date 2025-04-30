package _exception;
/**
 * 4.24
 * throw
 * 예외클래스 직접 생성해서 발생시키기
 */
public class ThrowHandling {

    //main
    public static void main(String[] args) {

        boolean flag = true;

        if (flag) {
            /*필요에 의해
            직접 미리만든 예외 클래스를 생성할 수도 있다.
            new ArithmeticException();
             */
            throw new ArithmeticException(); // 향후 많이 쓰게 될 것

        }//end of if

    }//end of main
}//end of class
