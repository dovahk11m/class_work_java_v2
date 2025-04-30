package com.starcraft.v02;

import java.util.Scanner; // 스캐너 호출

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

        while (true) {

            int zealot1hp = zealot1.getHp(); // 질럿클래스의 체력 변수를 미리 호출
            int zerg1hp = zergling1.getHp();
            int marine1hp = marine1.getHp();

            int random1; // 난수 변수 선언

            if (zealot1hp <= 0) { // 체력이 없으면 메뉴로 진입하지 않고 게임 종료
                System.out.println("질럿이 사망했습니다. 게임 종료");
                break;
            } else if (zerg1hp <= 0) {
                System.out.println("저글링이 사망했습니다. 게임 종료");
                break;
            } else if (marine1hp <= 0) {
                System.out.println("마린이 사망했습니다. 게임 종료");
                break;
            }

            System.out.println("===== 유닛 선택 =====");
            System.out.println("1.질럿 2.저글링 3.마린 4.게임종료");
            int Choice = sc.nextInt();

            if (Choice == 1) { // 질럿 선택
                System.out.println("질럿을 선택");
                zealot1.showInfo();
                System.out.println("===== 행동 선택 =====");
                System.out.println("1.저글링 공격 2. 마린공격");
                int zealChoice = sc.nextInt();

                if (zealChoice == 1) { // 저글링 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타⭐ =====");
                        zealot1.crit(zergling1);
                        zealot1.healHp(zealot1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else if (random1 == 2) {
                        zealot1.attack(zergling1);
                        if (zergling1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 저글링의 반격 =====");
                        zergling1.attack(zealot1);
                        zergling1.showInfo();
                        zealot1.showInfo();
                    } else {
                        System.out.println("===== ⭐저글링의 치명적 반격⭐ =====");
                        zergling1.crit(zealot1);
                        zergling1.healHp(zergling1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    }
                } else if (zealChoice == 2) { // 마린공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        zealot1.crit(marine1);
                        marine1.showInfo();
                        zealot1.showInfo();
                    } else if (random1 == 2) {
                        zealot1.attack(marine1);
                        if (marine1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 마린의 반격 =====");
                        marine1.attack(zealot1);
                        marine1.showInfo();
                        zealot1.showInfo();
                    } else {
                        System.out.println("===== ⭐마린의 치명적 반격⭐ =====");
                        marine1.crit(zealot1);
                        zealot1.showInfo();
                        marine1.showInfo();
                    }

                } else { // 질럿 잘못된 공격 행동 선택
                    System.out.println("정확한 번호를 입력해주세요");
                    System.out.println("유닛 선택창으로 돌아갑니다.");
                }
            } else if (Choice == 2) { // 저글링 선택
                System.out.println("저글링을 선택");
                zergling1.showInfo();
                System.out.println("===== 행동 선택 =====");
                System.out.println("1.질럿 공격 2. 마린공격");
                int zergChoice = sc.nextInt();

                if (zergChoice == 1) { // 질럿 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        zergling1.crit(zealot1);
                        zergling1.healHp(zergling1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else if (random1 == 2) {
                        zergling1.attack(zealot1);
                        if (marine1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 질럿의 반격 =====");
                        zealot1.attack(zergling1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else {
                        System.out.println("===== ⭐질럿의 치명적 반격⭐ =====");
                        zealot1.crit(zergling1);
                        zealot1.healHp(zealot1);
                        zergling1.showInfo();
                        zealot1.showInfo();
                    }
                } else if (zergChoice == 2) { // 마린 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        zergling1.ctit(marine1);
                        zergling1.healHp(zergling1);
                        marine1.showInfo();
                        zergling1.showInfo();
                    } else if (random1 == 2) {
                        zergling1.attack(marine1);
                        marine1.showInfo();
                        if (marine1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 마린의 반격 =====");
                        marine1.attack(zergling1);
                        zergling1.showInfo();
                    } else {
                        System.out.println("===== ⭐마린의 치명적 반격⭐ =====");
                        marine1.ctit(zergling1);
                        marine1.healHp(marine1);
                        zergling1.showInfo();
                        marine1.showInfo();
                    }
                } else { // 저글링 잘못된 공격 행동 선택
                    System.out.println("정확한 번호를 입력해주세요");
                    System.out.println("유닛 선택창으로 돌아갑니다.");
                }
            } else if (Choice == 3) { // 마린 선택
                System.out.println("마린을 선택");
                marine1.showInfo();
                System.out.println("===== 행동 선택 =====");
                System.out.println("1.질럿 공격 2. 저글링공격");
                int marichoice = sc.nextInt();

                if (marichoice == 1) { // 질럿 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        marine1.crit(zealot1);
                        marine1.healHp(marine1);
                        zealot1.showInfo();
                        marine1.showInfo();
                    } else if (random1 == 2) {
                        marine1.attack(zealot1);
                        zealot1.showInfo();
                        if (zealot1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 질럿의 반격 =====");
                        zealot1.attack(marine1);
                        marine1.showInfo();
                    } else {
                        System.out.println("===== ⭐질럿의 치명적 반격⭐ =====");
                        zealot1.attack(marine1);
                        zealot1.healHp(zealot1);
                        marine1.showInfo();
                        zealot1.showInfo();
                    }
                } else if (marichoice == 2) { // 저글링 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타 적중⭐ =====");
                        marine1.ctit(zergling1);
                        marine1.healHp(marine1);
                        zergling1.showInfo();
                        marine1.showInfo();
                    } else if (random1 == 2) {
                        marine1.attack(zergling1);
                        zergling1.showInfo();
                        if (zergling1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 저글링의 반격 =====");
                        zergling1.attack(marine1);
                        marine1.showInfo();
                    } else {
                        System.out.println("===== ⭐저글링의 치명적 반격⭐ =====");
                        zergling1.ctit(marine1);
                        zergling1.healHp(zergling1);
                        marine1.showInfo();
                        zergling1.showInfo();
                    }

                } else { // 마린 잘못된 공격 행동 선택
                    System.out.println("정확한 번호를 입력해주세요");
                    System.out.println("유닛 선택창으로 돌아갑니다.");
                }
            } else if (Choice == 4) { // 게임종료
                System.out.println("===== 게임 종료 =====");
                System.out.println("수고하셨습니다");
                break;
            } else {
                System.out.println("정확한 번호를 입력해주세요");
                System.out.println("유닛 선택창으로 돌아갑니다.");
            }

            // end of if
        }// end of while

    }//end of main
}
