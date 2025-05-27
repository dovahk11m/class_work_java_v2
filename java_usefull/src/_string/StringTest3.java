package _string;
/**
 * 4.24
 * String 연습
 */
public class StringTest3 {

    //main
    public static void main(String[] args) {

        String str1 = "ABCD";
        int countStr1 = str1.length(); //문자열 길이
        System.out.println("countStr1: " + countStr1);

        /*
        replace 메서드는
        문자열 내 특정 문자열을
        다른 문자나 문자열로 교체할 때 사용한다
        ex 비속어

        World 를 Java로 대체해보자
         */
        String str2 = "HelloWorld";
        String str3 = str2.replace("World", "Java");

        System.out.println("str2: " + str2); // HelloWorld
        System.out.println("str3: " + str3); // HelloJava

        /*
        substring 메서드는
        문자열 일부분을 추출하여
        새로운 문자열로 반환한다.

        두가지 오버로딩 메서드를 제공한다.
        startindex~
        startindex~ endIndex
        index는 0부터 시작한다.
         */
        String result1 = str2.substring(0, 5);
        System.out.println("HelloWorld의 1~5번째 글자: " + result1);

    }//end of main
}//end of class
