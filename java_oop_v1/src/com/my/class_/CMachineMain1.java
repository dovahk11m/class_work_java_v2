package com.my.class_;
import java.util.Scanner;
public class CMachineMain1 {
    // main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체 생성 = 인스턴스화
        CMachine1 machine1 = new CMachine1(300, 10);
        int coffeeCount = 1;

        while (true) {
            System.out.println("1.커피내리기 2.물채우기 3.원두채우기 0.종료");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(coffeeCount + "차 커피 주문");
                System.out.println(machine1.makeCoffee());
                coffeeCount++;

                System.out.println("===== =====");
            } else if (choice == 0) {
                System.out.println("...프로그램 종료");
                break;
            } else if (choice == 2) {
                machine1.refillWater(100);
                System.out.println("===== =====");
            } else if (choice == 3) {
                machine1.refillCoffee(10);
                System.out.println("===== =====");
            }
        } // end of while
    } // end of main
} // end of class

