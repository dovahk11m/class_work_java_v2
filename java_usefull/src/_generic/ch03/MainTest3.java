package _generic.ch03;
public class MainTest3 {
    public static void main(String[] args) {

        //재료 선언
        Powder powder1 = new Powder();
        Plastic plastic1 = new Plastic();
        Water water1 = new Water();

        GenericPrinter<Powder> gPinter1 = new GenericPrinter<>();
        gPinter1.setMaterial(powder1);
        /*
        제네릭 프로그래밍을 하면
        타입의 안정성과
        T extends Object
        타입에 제한을 둘 수 있다.
         */

        //Water를 사용해보자 - 컴파일 시점 오류 발생
//        GenericPrinter<Water> gPrinter2 = new GenericPrinter<Water>();

    }//main
}//class
