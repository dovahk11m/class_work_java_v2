package com.starcraft.v01;

import java.util.Scanner;

public class GameTest {
    //main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UnitZealot zealot1 = new UnitZealot("질럿1");
        UnitZergling zergling1 = new UnitZergling("저글링1");
        UnitMarine marine1 = new UnitMarine("마린1");

        while (true) {
            System.out.println("===== ⭐유닛 선택⭐ =====");
            System.out.println("1.질럿 2.마린 3.저글링");
            int selected = sc.nextInt();

            if (selected == 1) {
                System.out.println("===== ⭐행동 선택⭐ =====");
                System.out.println("1.마린공격 2.저글링공격");
                int target = sc.nextInt();
                if (target == 1) {
                    zealot1.attackMarine(marine1);

                } else if (target == 2) {
                    zealot1.attackZergling(zergling1);
                }
            }

            break;
        }



    }//end of main
}//end of class
