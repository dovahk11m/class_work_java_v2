package com.polymorphism.fruits;
/**
 * 4.22 3_1교시 다형성
 *
 * 업캐스팅
 * 다운캐스팅
 */
public class EMart {
    //main
    public static void main(String[] args) {

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        /*
        배열
        배열을 사용할 때는
        반드시 크기를 먼저 지정한다.

        배열의 길이와
        요소의 길이는 항상 동일한 것은 아니다.
         */
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();

        System.out.println();
        /*
        다형성
        다형성을 이해한다면
        유연한 코드를 작성할 수 있다.
         */
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();
        /*
        문제
        배열 안에 들어있는 각각의 객체 showInfo 호출

        데이터타입이 바나나면
        원산지 정보와 세일 메서드를 호출하라
         */
        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i] != null) {

                if (fruits[i] instanceof Banana) {
                    System.out.print((i + 1) + "번 ");
                    fruits[i].showInfo();
                    System.out.println("원산지: " + ((Banana) fruits[i]).ogrin);
                    ((Banana) fruits[i]).saleBanana();
                    System.out.println("===== ===== =====");
                } else {
                    System.out.print((i + 1) + "번 ");
                    fruits[i].showInfo();
                    System.out.println("===== ===== =====");
                }//end of if

            }//defensive

        }//end of for

    }//end of main

}//end of class
