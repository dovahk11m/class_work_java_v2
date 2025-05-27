package _generic.ch02;
public class MainTest2 {

    public static void main(String[] args) {

        //재료 선언
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        //사용하는 시점에 T 대신 어떤 자료형을 사용할 지 지정해준다.
        GenericPrinter<Plastic> gPrinter1 = new GenericPrinter<>();
        gPrinter1.setMaterial(plastic1);
        System.out.println(gPrinter1.toString()); // "재료는 플라스틱 입니다."

        //재료꺼내기
        Plastic usePlastic = gPrinter1.getMaterial(); //형변환이 필요없다

        /*
        제네릭으로 만들면
        형변환이 필요없고
        좀 더 편하게 쓸 수 있다.

        또한 컴파일 시점에 오류를 알려줘
        안정적 코드작업을 돕는다.
         */
//        Powder usePowder = gPrinter1.getMaterial();

        Water water1 = new Water();
        GenericPrinter<Water> gPrinter2 = new GenericPrinter<>();
        gPrinter2.setMaterial(water1);
        System.out.println(gPrinter2.toString()); // "재료는 물 입니다."

    }//main
}//class
