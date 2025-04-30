package com.starcraft.v01;

import java.util.Scanner;

public class GameTestV01 {
    //main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UnitZealot zealot1 = new UnitZealot("질럿1");
        UnitZergling zergling1 = new UnitZergling("저글링1");
        UnitMarine marine1 = new UnitMarine("마린1");

/*
TODO 행동선택으로 되돌아 오는 방법?
TODO 유닛 사망처리?
TODO 치명타 구현
TODO 치명타 적중시 50% 흡혈
 */

        while (true) {

            int zealot1hp = zealot1.getHp();
            int zerg1hp = zergling1.getHp();
            int marine1hp = marine1.getHp();

            int random1;

            if (zealot1hp <= 0) {
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
            int unitChoice = sc.nextInt();

            if (unitChoice == 1) { // 질럿 선택
                System.out.println("질럿을 선택");
                zealot1.showInfo();
                System.out.println("===== 행동 선택 =====");
                System.out.println("1.저글링 공격 2. 마린공격");
                int zealChoice = sc.nextInt();

                if (zealChoice == 1) { // 저글링 공격
                    random1 = (int) (Math.random() * 3) + 1;

                    if (random1 == 3) {
                        System.out.println("===== ⭐치명타⭐ =====");
                        zealot1.critZergling(zergling1);
                        zealot1.healHp(zealot1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    } else if (random1 == 2) {
                        zealot1.attackZergling(zergling1);
                        if (zergling1.getHp() <= 0) {
                            continue;
                        }
                        System.out.println("===== 저글링의 반격 =====");
                        zergling1.attackZealot(zealot1);
                        zergling1.showInfo();
                        zealot1.showInfo();
                    } else {
                        System.out.println("===== ⭐저글링의 치명적 반격⭐ =====");
                        zergling1.critZealot(zealot1);
                        zergling1.healHp(zergling1);
                        zealot1.showInfo();
                        zergling1.showInfo();
                    }
                    } else if (zealChoice == 2) { // 마린공격
                        random1 = (int) (Math.random() * 3) + 1;

                        if (random1 == 3) {
                            System.out.println("===== ⭐치명타 적중⭐ =====");
                            zealot1.critMarine(marine1);
                            marine1.showInfo();
                            zealot1.showInfo();
                        } else if (random1 == 2) {
                            zealot1.attackMarine(marine1);
                            if (marine1.getHp() <= 0) {
                                continue;
                            }
                            System.out.println("===== 마린의 반격 =====");
                            marine1.attackZealot(zealot1);
                            marine1.showInfo();
                            zealot1.showInfo();
                        } else {
                            System.out.println("===== ⭐마린의 치명적 반격⭐ =====");
                            marine1.critZealot(zealot1);
                            zealot1.showInfo();
                            marine1.showInfo();
                        }

                    } else { // 질럿 잘못된 공격 행동 선택
                        System.out.println("정확한 번호를 입력해주세요");
                        System.out.println("유닛 선택창으로 돌아갑니다.");
                    }
                } else if (unitChoice == 2) { // 저글링 선택
                    System.out.println("저글링을 선택");
                    zergling1.showInfo();
                    System.out.println("===== 행동 선택 =====");
                    System.out.println("1.질럿 공격 2. 마린공격");
                     int zergChoice = sc.nextInt();

                    if (zergChoice == 1) { // 질럿 공격
                        random1 = (int) (Math.random() * 3) + 1;

                        if (random1 == 3) {
                            System.out.println("===== ⭐치명타 적중⭐ =====");
                            zergling1.critZealot(zealot1);
                            zergling1.healHp(zergling1);
                            zealot1.showInfo();
                            zergling1.showInfo();
                        } else if (random1 == 2) {
                            zergling1.attackZealot(zealot1);
                            if (marine1.getHp() <= 0) {
                                continue;
                            }
                            System.out.println("===== 질럿의 반격 =====");
                            zealot1.attackZergling(zergling1);
                            zealot1.showInfo();
                            zergling1.showInfo();
                        } else {
                            System.out.println("===== ⭐질럿의 치명적 반격⭐ =====");
                            zealot1.critZergling(zergling1);
                            zealot1.healHp(zealot1);
                            zergling1.showInfo();
                            zealot1.showInfo();
                        }
                    } else if (zergChoice == 2) { // 마린 공격
                        random1 = (int) (Math.random() * 3) + 1;

                        if (random1 == 3) {
                            System.out.println("===== ⭐치명타 적중⭐ =====");
                            zergling1.ctitMarine(marine1);
                            zergling1.healHp(zergling1);
                            marine1.showInfo();
                            zergling1.showInfo();
                        } else if (random1 == 2) {
                            zergling1.attackMarine(marine1);
                            marine1.showInfo();
                            if (marine1.getHp() <= 0) {
                                continue;
                            }
                            System.out.println("===== 마린의 반격 =====");
                            marine1.attackZergling(zergling1);
                            zergling1.showInfo();
                        } else {
                            System.out.println("===== ⭐마린의 치명적 반격⭐ =====");
                            marine1.ctitZergling(zergling1);
                            marine1.healHp(marine1);
                            zergling1.showInfo();
                            marine1.showInfo();
                        }
                    } else { // 저글링 잘못된 공격 행동 선택
                        System.out.println("정확한 번호를 입력해주세요");
                        System.out.println("유닛 선택창으로 돌아갑니다.");
                    }
                } else if (unitChoice == 3) { // 마린 선택
                    System.out.println("마린을 선택");
                    marine1.showInfo();
                    System.out.println("===== 행동 선택 =====");
                    System.out.println("1.질럿 공격 2. 저글링공격");
                    int marichoice = sc.nextInt();

                    if (marichoice == 1) { // 질럿 공격
                        random1 = (int) (Math.random() * 3) + 1;

                        if (random1 == 3) {
                            System.out.println("===== ⭐치명타 적중⭐ =====");
                            marine1.critZealot(zealot1);
                            marine1.healHp(marine1);
                            zealot1.showInfo();
                            marine1.showInfo();
                        } else if (random1 == 2) {
                            marine1.attackZealot(zealot1);
                            zealot1.showInfo();
                            if (zealot1.getHp() <= 0) {
                                continue;
                            }
                            System.out.println("===== 질럿의 반격 =====");
                            zealot1.attackMarine(marine1);
                            marine1.showInfo();
                        } else {
                            System.out.println("===== ⭐질럿의 치명적 반격⭐ =====");
                            zealot1.attackMarine(marine1);
                            zealot1.healHp(zealot1);
                            marine1.showInfo();
                            zealot1.showInfo();
                        }
                    } else if (marichoice == 2) { // 저글링 공격
                        random1 = (int) (Math.random() * 3) + 1;

                        if (random1 == 3) {
                            System.out.println("===== ⭐치명타 적중⭐ =====");
                            marine1.ctitZergling(zergling1);
                            marine1.healHp(marine1);
                            zergling1.showInfo();
                            marine1.showInfo();
                        } else if (random1 == 2) {
                            marine1.attackZergling(zergling1);
                            zergling1.showInfo();
                            if (zergling1.getHp() <= 0) {
                                continue;
                            }
                            System.out.println("===== 저글링의 반격 =====");
                            zergling1.attackMarine(marine1);
                            marine1.showInfo();
                        } else {
                            System.out.println("===== ⭐저글링의 치명적 반격⭐ =====");
                            zergling1.ctitMarine(marine1);
                            zergling1.healHp(zergling1);
                            marine1.showInfo();
                            zergling1.showInfo();
                        }

                    } else { // 마린 잘못된 공격 행동 선택
                        System.out.println("정확한 번호를 입력해주세요");
                        System.out.println("유닛 선택창으로 돌아갑니다.");
                    }
                } else if (unitChoice == 4) { // 게임종료
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
    }//end of class
