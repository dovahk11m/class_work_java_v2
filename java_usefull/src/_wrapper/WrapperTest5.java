package _wrapper;
import java.util.ArrayList;
/**
 5.12
 컬렉션 프레임워크에서
 래퍼 클래스 사용해보기

 래퍼클래스는 컬렉션 프레임워크에서 많이 사용된다.

 컬렉션에는 객체만 저장할 수 있다.
 래퍼클래스 사용이 강제된다.
 Integer Double Boolean
 */
public class WrapperTest5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //정수값만

        numbers.add(Integer.valueOf(10));
        numbers.add(20); //자동박싱 (int > Integer)

        int sum = numbers.get(0) + numbers.get(1); //자동언박싱 (Integer > int)
        System.out.println("합:" + sum);

    }//main
}//class
