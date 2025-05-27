package _wrapper;
/**
 5.12
 기본데이터 타입을 문자열로 바꿔본다.
 int double boolean => String
 */
public class WrapperTest4 {
    public static void main(String[] args) {

        //가장 쉬운 방법
        System.out.println(10 + "asdf");
        String str1 = 10 + "asdf";
        System.out.println(str1);

        //String 클래스의 valueOf()
        int value = 5000;
        String strValue = String.valueOf(value);
        System.out.println("int => String:"+strValue); //5000

        Float value2 = 1.234F; //접미사
        Long value3 = 1000L;

        String strValue2 = String.valueOf(value2);
        System.out.println("Float => String:"+strValue2); //1.234

        String strValue3 = String.valueOf(value3);
        System.out.println("Long => String:"+strValue3); //1000

    }//main
}//class
