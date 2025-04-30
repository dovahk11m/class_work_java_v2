package com.method;
/*
메서드란?
객체에 소속된 함수로
클래스의 상태(데이터)를 활용하거나
객체와 관련된 작업을 처리할때 사용한다.
 */
public class CoffeeMachine {
    //속성
    int water; //물의 양
    int coffee; //커피의 양

    //생성자

    //메서드
    public void refillWater(int amount) { // 물 채우기
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml 물을 채웠다");
            System.out.println("남은 물:" + water);
        } else {
            System.out.println("0보다 많은 양의 물을 채우시오");
        }
    }

    public void refillCoffee(int amount) { // 커피 채우기
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + "g 원두를 채웠다");
            System.out.println("남은 원두:" + coffee);
        } else {
            System.out.println("0보다 많은 양의 원두를 채우시오");
        }
    }

    public String makeCoffee() {
        /*
        커피 만들기
        커피 한 잔에 물 100ml, 원두 10g 필요
        방어적 코드도 잊지 말자!
         */
        if (water >= 100 && coffee >= 10) {
            water -= 100; // 물 사용
            coffee -= 10; // 커피 사용
            System.out.println("남은 물:" + water);
            System.out.println("남은 원두:" + coffee);
            return "맛 있는 커피 한 잔 완성";
        } else if (water < 100 && coffee >= 10) {
            System.out.println("남은 물:" + water);
            return "물이 부족해요";
        } else if (water >= 100 && coffee < 10) {
            System.out.println("남은 원두:" + coffee);
            return "원두가 부족해요";
        } else {
            return "물과 원두가 부족해요";
        }
    }
    /*
    사용자 정의 생성자를 만드시오
    멤버변수 water coffee 값이 초기화 될 수 있도록
     */
    public CoffeeMachine() {}

    public CoffeeMachine(int cowater, int cocoffee) {
        water = cowater;
        coffee = cocoffee;
    }
    //생성자가 여러개면 생성자 오버로딩!

} // end of class
