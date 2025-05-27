package com.method;
public class CoffeeMachineMain {
    // main
    public static void main(String[] args) {
        // 객체 생성 = 인스턴스화
        CoffeeMachine machine1 = new CoffeeMachine(300, 10);

        // 재료 채우기 동작
        machine1.refillWater(100); // 물 채우기
        machine1.refillCoffee(10); // 물 채우기
        System.out.println("===== =====");

        // 커피 만들기 동작
        System.out.println("커피 주문");
        String result = machine1.makeCoffee();
        System.out.println(result);
        System.out.println("===== =====");

        System.out.println("2차 커피 주문");
        System.out.println(machine1.makeCoffee());
        System.out.println("===== =====");

        System.out.println("3차 커피 주문");
        System.out.println(machine1.makeCoffee());
        System.out.println("===== =====");

        machine1.refillWater(0); // 물 채우기
        machine1.refillCoffee(30); // 물 채우기
        System.out.println("===== =====");

        System.out.println("4차 커피 주문");
        System.out.println(machine1.makeCoffee());
        System.out.println("===== =====");

        System.out.println("5차 커피 주문");
        System.out.println(machine1.makeCoffee());
        System.out.println("===== =====");

        System.out.println("6차 커피 주문");
        System.out.println(machine1.makeCoffee());
        System.out.println("===== =====");

    } // end of main
} // end of class
