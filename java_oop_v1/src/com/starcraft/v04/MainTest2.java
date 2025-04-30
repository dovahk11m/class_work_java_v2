package com.starcraft.v04;
/**
 * @author 조충희
 * 4.22 스타크래프트 만들기
 * 추상클래스
 */
import java.util.Random;
import java.util.Scanner;

public class MainTest2 {
    //main
    public static void main(String[] args) {

        //스캐너
        Scanner scanner = new Scanner(System.in);

        //랜덤
        Random random = new Random();

        //배열
        Unit[] units = new Unit[3];

        //샘플
        units[0] = new Zealot("질럿");
        units[1] = new Zergling("저글링");
        units[2] = new Marine("마린");

        //제어문
        boolean flag = true;

        //반복문
        while (flag) {

            for (int i = 0; i < units.length; i++) {
                if (units[i].hp <= 0) {
                    System.out.println("💀" + units[i].name + "이 죽었습니다. 게임 종료");
                    flag = false;
                }
            }

            System.out.println();
            System.out.print("유닛선택: 1.질럿 2.저글링 3.마린 0.종료");
            int uChoice = scanner.nextInt();

            if (uChoice == 1) {
                System.out.println("질럿을 선택했습니다");
                System.out.println();
                System.out.print("공격선택: 1.저글링 2.마린");
                int bChoice = scanner.nextInt();

                if (bChoice == 1) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[1].crit(units[2]);
                        units[2].showInfo();
                    }

                    if (ran1 == 1) {
                        units[2].crit(units[1]);
                        units[1].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[1].attack(units[2]);
                        units[2].attack(units[1]);
                        units[1].showInfo();
                        units[2].showInfo();
                    }

                } else if (bChoice == 2) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[1].crit(units[3]);
                        units[3].showInfo();
                    }

                    if (ran1 == 1) {
                        units[3].crit(units[1]);
                        units[1].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[1].attack(units[3]);
                        units[3].attack(units[1]);
                        units[1].showInfo();
                        units[3].showInfo();
                    }

                } else {
                    System.out.println("잘못된 입력");
                }

            } else if (uChoice == 2) {
                System.out.println("저글링을 선택했습니다");
                System.out.println();
                System.out.print("공격선택: 1.질럿 2.마린");
                int bChoice = scanner.nextInt();

                if (bChoice == 1) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[2].crit(units[1]);
                        units[1].showInfo();
                    }

                    if (ran1 == 1) {
                        units[1].crit(units[2]);
                        units[2].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[2].attack(units[1]);
                        units[1].attack(units[2]);
                        units[2].showInfo();
                        units[1].showInfo();
                    }

                } else if (bChoice == 2) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[2].crit(units[3]);
                        units[3].showInfo();
                    }

                    if (ran1 == 1) {
                        units[3].crit(units[2]);
                        units[2].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[2].attack(units[3]);
                        units[3].attack(units[2]);
                        units[2].showInfo();
                        units[3].showInfo();
                    }

                } else {
                    System.out.println("잘못된 입력");
                }

            } else if (uChoice == 3) {
                System.out.println("마린을 선택했습니다");
                System.out.println();
                System.out.print("공격선택: 1.질럿 2.저글링");
                int bChoice = scanner.nextInt();

                if (bChoice == 1) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[3].crit(units[1]);
                        units[1].showInfo();
                    }

                    if (ran1 == 1) {
                        units[1].crit(units[3]);
                        units[3].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[3].attack(units[1]);
                        units[1].attack(units[3]);
                        units[3].showInfo();
                        units[1].showInfo();
                    }

                } else if (bChoice == 2) {
                    int ran1 = random.nextInt(6) + 1;
                    System.out.println("🎲주사위가 " + ran1+ " 나왔습니다. ");

                    if (ran1 == 6) {
                        units[3].crit(units[2]);
                        units[2].showInfo();
                    }

                    if (ran1 == 1) {
                        units[2].crit(units[3]);
                        units[3].showInfo();
                    }

                    if (ran1 > 1 || ran1 < 6) {
                        units[3].attack(units[2]);
                        units[2].attack(units[3]);
                        units[3].showInfo();
                        units[2].showInfo();
                    }

                } else {
                    System.out.println("잘못된 입력");
                }

            } else if (uChoice == 0) {
                System.out.println("게임 종료");
                flag = false;

            } else {
                System.out.println("잘못된 입력");
            }//end of if

        }//end of while

    }//end of main

}//end of class
