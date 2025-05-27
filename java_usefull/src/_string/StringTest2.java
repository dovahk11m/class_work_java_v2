package _string;
/**
 * 4.24
 * String 연습
 */
public class StringTest2 {

    //main
    public static void main(String[] args) {

        //객체
        String str1 = new String("Hello");
        String str2 = new String("World");

        /*
        String 객체는 불변 immutable 이다.

        원래 객체 주소가 생성됐고
        내부 변수 값이 변경된다면
        String 클래스는 수정되지 않고 불변이다.

        만약 수정을 하게되면
        새로운 String 객체를 만드는 동작이 실행된다.
         */

        System.out.println("고유주소확인: " + System.identityHashCode(str1));

        //문자열 연결 기능 호출
        str1 = str1.concat(str2);

        System.out.println("수정주소확인: " + System.identityHashCode(str1));

    }//end of main
}//end of class
