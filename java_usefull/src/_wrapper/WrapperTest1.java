package _wrapper;
/**
 5.12
 박싱
 Boxing
 기본 데이터를 래퍼 클래스 객체로 변환하는 과정

 언박싱
 Unboxing
 래퍼 클래스 객체를 기본 타입 데이터로 변환하는 과정

 이들은 많이 사용되기에 자바 5부터 간소화 기능이 마련돼있다.
 자동박싱
 Auto-boxing
 자동언박싱
 Auto-unboxing
 */
public class WrapperTest1 {
    public static void main(String[] args) {
        //박싱
        int num = 10;
        Integer wrapperedNum = Integer.valueOf(num);

        System.out.println(wrapperedNum); // 10
        System.out.println(wrapperedNum.toString()); // toString 자동호출

        //언박싱
        Integer wrapperdNum2 = Integer.valueOf(30);
        int num2 = wrapperdNum2.intValue();
        System.out.println(num2);

        //자동박싱 - 기본 데이터 값이 래퍼 클래스 객체에 바로 들어간다.
        Integer autoBoxed = 20;

        //자동언박싱
        int autoUnboxed = autoBoxed;

    }//main
}//class
