package _wrapper;
public class WrapperTest2 {
    public static void main(String[] args) {

        //double 데이터 타입을 래퍼 클래스로 변환
        double doubles = 1.234;
        Double doubleWrap = Double.valueOf(doubles);
        System.out.println("박싱:"+doubleWrap);
        System.out.println("박싱:"+doubleWrap.toString());

        Double doubleWrap2 = Double.valueOf(4.321);
        double doubles2 = doubleWrap2.doubleValue();
        System.out.println("언박싱:"+doubles2);
        System.out.println("===== ===== ");

        //자동 박싱 언박싱 예제코드
        Double doubleWrap3 = 3.333;
        System.out.println("자동박싱:"+doubleWrap3);

        double doubles3 = doubleWrap3;
        System.out.println("자동언박싱:"+doubles3);

    }//main
}//class
