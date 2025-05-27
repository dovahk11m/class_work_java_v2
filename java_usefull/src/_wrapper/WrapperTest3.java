package _wrapper;
/**
 5.12
 래퍼 클래스의 활용
 String => 기본데이터

 래퍼클래스를 활용할때 NumberFormatException이 발생할 수 있다.
 예외처리코드를 작성해주는 것이 좋다.
 */
public class WrapperTest3 {

    public static void main(String[] args) {

        //String => 기본데이터
        String strNum = "123";
        String strDouble = "45.67";
        String strBool = "true";
        String badStr = "a123";

        int num = Integer.parseInt(strNum);
        System.out.println(num); //123

        double dNum = Double.parseDouble(strDouble);
        System.out.println(dNum); //45.67

        boolean bool = Boolean.parseBoolean(strBool);
        System.out.println(bool); //true

        //a123 => int 변환
        try {
            int intNum = Integer.parseInt(badStr);
        } catch (NumberFormatException e) {
            System.out.println(badStr + "변수를 정수값으로 변경할 수 없습니다.");
        }
        //가능하다면 예외처리코드를 작성해주는 것이 좋다.

    }//main
}//class
