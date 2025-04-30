package com.polymorphism.fruits;
/**
 * 4.22 3_1교시 다형성
 *
 * 업캐스팅
 * 다운캐스팅
 */
public class FruitTest1 {
    //main
    public static void main(String[] args) {

        Fruit fruit1 = new Peach(); //업캐스팅된 상태
        Fruit fruit2 = new Banana();

        fruit1.showInfo();
        fruit2.showInfo();

        System.out.println();
        /*
        바나나의 원산지 정보를 출력하시오

        이 문제는
        컴파일 시점과 런타임 시점을 이해해야 한다.

        업캐스팅된 상태에서는
        컴파일 시점에 부모에 있는 변수나 메서드만 이해 가능
         */
        //fruit2.orign

        String reultOrigin = ((Banana)fruit2).ogrin; // 다운캐스팅
        System.out.println("바나나 원산지: " + reultOrigin);

        System.out.println();
        /*
        인스턴스오브 연산자
        instanceof
        ↳예약어

        다운캐스팅 관련 활용가능한 기능
         */

        if (fruit2 instanceof Banana) { // true
            System.out.println("바나나인가? true");
        }
        if (fruit2 instanceof Peach) { // false
            System.out.println("복숭아인가? true");
        }

        System.out.println();
        /*
        fruit2에 saleBanana() 메서드를 호출하시오
         */

        ((Banana)fruit2).saleBanana(); //다운캐스팅
        fruit2.showInfo();

    }//end of main
}//end of class
