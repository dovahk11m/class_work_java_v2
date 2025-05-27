package _generic;
/**
 5.8
 */
public class MainTest1 {

    //main
    public static void main(String[] args) {

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();


        ThreeDPrinter1 dPrinter1 = new ThreeDPrinter1();

        //재료를 주입한다.
        dPrinter1.setMaterial(plastic1);

        /*
        위 코드의 한계점
        재료가 플라스틱에 종속돼 있기 때문에

        만약 재료가 플라스틱에서 파우더로 바뀌면
        ThreeDPrinter2처럼
        새로운 클래스를 생성하거나
        코드를 수정해야 하는 번거로움이 발생한다.
         */

        ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
        dPrinter2.setMaterial(powder1);

        System.out.println("===== ===== ===== ===== ===== ");

        ThreeDPrinter3 dPrinter3 = new ThreeDPrinter3();
        dPrinter3.setMaterial(plastic1);

        //재료 꺼내기
        Plastic usePlastic = (Plastic) dPrinter3.getMaterial(); //다운캐스팅
        System.out.println(usePlastic.toString());

        //재료 교체
        dPrinter3.setMaterial(powder1);
        Powder usePower = (Powder) dPrinter3.getMaterial(); //다운캐스팅
        System.out.println(usePower.toString());

        /*
        Object 타입으로 설계하면
        모든 데이터 타입을 담을 수 있다.

        하지만..
        사용하는 측에서
        매번 원시코드를 확인해야 하는 불편함이 발생한다.
         */




    }//main
}//class
