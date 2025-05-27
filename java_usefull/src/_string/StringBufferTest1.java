package _string;
/**
 * 4.24
 * String Buffer 연습
 */
public class StringBufferTest1 {

    //main
    public static void main(String[] args) {

    String str1 = new String("Hello");
    String str2 = new String("World");

    //새로 배우는 데이터 타입 StringBuffer
    StringBuffer buffer1 = new StringBuffer(str1);

        System.out.println("buffer1: " + buffer1);
        System.out.println("수정전 System.identityHashCode(buffer1): " + System.identityHashCode(buffer1));

    //buffer1 값을 수정해보자 Replace
    buffer1.append(str2); //문자열 합치기
    buffer1.append("111");
    buffer1.append("222");

        System.out.println("buffer1: " + buffer1);
        System.out.println("수정후 System.identityHashCode(buffer1): " + System.identityHashCode(buffer1));

        /*
        hashCode()
        API7에서는 객체의 유일성 보장하는 정수값
        API8부터는 buffer1.toString() 해야 값을 확인 가능

        StringBuffer 데이터 타입을 String으로 형변환 하려면 toString()하면 됨
         */
        String result1 = buffer1.toString();
        System.out.println("buffer1.toString(): " + result1);

    }//end of main
}//end of class
