package _exception;
/**
 * 4.24
 * 사용자정의 예외클래스 만들기
 */
public class DivideByZeroException extends Exception { //예외 클래스 상속

    private String message;

    public DivideByZeroException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}//end of class
