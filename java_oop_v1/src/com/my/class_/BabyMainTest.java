package com.my.class_;
import java.util.Scanner;
public class BabyMainTest {
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Baby1 baby1 = new Baby1("민준", 100, 100, 50);

        while (true) {

            int outerBSleepy = baby1.getSleepy();
            int outerBHunger = baby1.getHunger();
            int outerBThirst = baby1.getThirst();

            if (outerBSleepy > 100) {
                System.out.println("게임오버");
                break;
            }
            if (outerBHunger <= 0 && outerBThirst <= 0) {
                System.out.println("아기는 행복합니다");
                break;
            }

            System.out.println("1.물주기 2.밥주기 3.재우기 0.종료");
            int choice = sc.nextInt();
            if (choice == 1) {
                baby1.drinkWater(20);
            } else if (choice == 2) {
                baby1.eatFood(20);
            } else if (choice == 3) {
                baby1.goToSleep(50);
            } else if (choice == 0) {
                System.out.println("게임오버");
                break;
            }
        }
    }//end of main
}//end of class
