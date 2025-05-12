package _generic.ch04;
/**
 5.8
 제네릭 클래스 Box 설계
 */
public class GenericBoxDemo {

    public static void main(String[] args) {

        //String 타입 Box 선언 및 사용
        Box<String> stringBox = new Box<>("문자열");
        System.out.println(stringBox.toString());

        stringBox.setMaterial("변경된 문자열");
        System.out.println(stringBox.toString());

        //Integer 타입 Box 선언 및 사용
        Box<Integer> integerBox = new Box<>(1234);
        System.out.println(integerBox.toString());

        integerBox.setMaterial(4321);
        System.out.println(integerBox.toString());

        //Double 타입 박스 선언 및 사용
        Box<Double> doubleBox = new Box<>(0.1234);
        System.out.println(doubleBox.getMaterial());

        doubleBox.setMaterial(0.4321);
        doubleBox.toString();

    }//main
}//class
