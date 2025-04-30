package _string;
/**
 * 4.24
 * String 연습
 */
public class StringTest1 {

    //변수
    //생성자
    //메서드

    //main
    public static void main(String[] args) {

        String str1 = "문자열"; //Heap => StringPool에 저장

        String str2 = new String("abc"); //Heap에 저장
        String str3 = new String("abc");
        //Heap에 올라가면 주소값이 생성된다.
        /*
        참조 비교
        주소 == 주소
        각각 객체의 주소값을 비교한다.
         */
        System.out.println("str2 == str3: " + (str2 == str3));

        //문자열을 리터럴 방식으로 만들어보자
        String str4 = "abc";
        String str5 = "abc";
        String str6 = "abc";

        System.out.println("str4 == str5: " + (str4 == str5));
        /*
        문자열은 아주 많이 사용되는 데이터 타입이다.
        모든 문자열이 객체로 저장된다면
        메모리 효율이 떨어지게 된다.

        상수풀에 문자열을 저장한 뒤
        이를 참조해서 재사용하면 메모리를 아낄 수 있다.

        그래서 str1 = "abc" = str4,str5 인 것이다.
         */

        String str7 = str6 + " 안녕"; //"abc 안녕"이라는 새로운 녀석이 상수풀에 올라갔다.
        System.out.println(str7);

    }//end of main
}//end of class
