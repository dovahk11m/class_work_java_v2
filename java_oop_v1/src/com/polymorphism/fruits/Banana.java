package com.polymorphism.fruits;
/**
 * 4.22 3_1교시 다형성
 */
public class Banana extends Fruit {

    String ogrin; // Banana만의 멤버변수

        public Banana() {
            name = "델몬트바나나";
            price = 3000;
            ogrin = "필리핀";
        }

    public void saleBanana() {
        System.out.println("지금은 할인 기간입니다");
        System.out.println("이 방송이 나간 뒤(메서드호출) 바나나 가격을 천원 할인");
        price -= 1000;
    }

}//end of Banana
