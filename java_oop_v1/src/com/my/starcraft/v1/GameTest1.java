package com.my.starcraft.v1;

import java.util.Scanner;

public class GameTest1 {

    // 메인함수
    public static void main(String[] args) {

        // 스캐너 호출
        Scanner sc = new Scanner(System.in);

        // 객체 선언
        Zealot zealot1 = new Zealot("질럿1");
        Zergling zergling1 = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");



/*
TODO 행동선택으로 되돌아 오는 방법?
TODO 유닛 사망처리?
TODO 치명타 구현
TODO 치명타 적중시 50% 흡혈
 */
        int killCountZ =0; //저글링 킬수 기록
        int killCountM =0; //마린 킬수 기록

        while (true) {

            int zealot1hp = zealot1.getHp(); // 질럿클래스의 체력 변수를 미리 호출
            int zerg1hp = zergling1.getHp();
            int marine1hp = marine1.getHp();

            int random1; // 난수 변수 선언

            if (zealot1hp <= 0) { // 체력이 없으면 메뉴로 진입하지 않고 게임 종료
                System.out.println("질럿이 사망했습니다. 게임 종료");
                break;
            } else if (zerg1hp <= 0) {
                System.out.println("저글링을 잡았습니다. 새로운 저글링이 스폰됩니다.");
                killCountZ ++;
                System.out.print("잡은 저글링 수: ");

                for (int i = 0; i < killCountZ; i++) {
                    System.out.print("💀");
                }
                System.out.println();

                zergling1 = new Zergling("저글링1");
                System.out.println("파워업");
                zealot1.healHp();
                zealot1.powerUp();
                zealot1.showInfo();

            } else if (marine1hp <= 0) {
                System.out.println("마린을 잡았습니다. 새로운 마린이 스폰됩니다.");
                killCountM ++;
                System.out.println("잡은 마린 수: ");

                for (int i = 0; i < killCountM; i++) {
                    System.out.print("💀");
                }
                System.out.println();

                marine1 = new Marine("마린1");
                System.out.println("파워업");
                zealot1.healHp();
                zealot1.powerUp();
                zealot1.showInfo();
            }

                System.out.println("===== 행동 선택 =====");
                System.out.println("1.저글링 공격 2. 마린공격");
                int zealChoice = sc.nextInt();

                if (zealChoice == 1) { // 저글링 공격
                    random1 = (int) (Math.random() * 6) + 1;

                    if (random1 == 6) {
                        System.out.println("===== ⭐치명타⭐ =====");
                        zealot1.crit(zergling1);
                        zealot1.healHp();
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else if (random1 == 0) {
                        System.out.println("===== ⭐저글링의 치명적 반격⭐ =====");
                        zergling1.crit(zealot1);
                        zergling1.healHp(zergling1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else {
                        zealot1.attack(zergling1);
                        if (zergling1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 저글링의 반격 =====");
                        zergling1.attack(zealot1);
                        zergling1.showInfo();
                        zealot1.showInfo();
                    }
                } else if (zealChoice == 2) { // 마린공격
                    random1 = (int) (Math.random() * 6) + 1;

                    if (random1 == 6) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        zealot1.crit(marine1);
                        marine1.showInfo();
                        zealot1.showInfo();
                    } else if (random1 == 1) {
                        System.out.println("===== ⭐마린의 치명적 반격⭐ =====");
                        marine1.crit(zealot1);
                        zealot1.showInfo();
                        marine1.showInfo();
                    } else {
                        zealot1.attack(marine1);
                        if (marine1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 마린의 반격 =====");
                        marine1.attack(zealot1);
                        marine1.showInfo();
                        zealot1.showInfo();
                    }

                } else { // 질럿 잘못된 공격 행동 선택
                    System.out.println("정확한 번호를 입력해주세요");
                    System.out.println("유닛 선택창으로 돌아갑니다.");
                }

        }// end of while

    }//end of main
}
