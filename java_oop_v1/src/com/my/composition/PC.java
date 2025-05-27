package com.my.composition;

import java.util.Scanner;

/**
 * 4.21 포함관계 연습
 */
public class PC {

    //member
    private String name;
    private int elecUse;
    CPU[] cpus;

    static int totalElecUse =0;

    //constructor

    public PC(String name) {
        this.name = name;
        elecUse = 200;
        this.cpus = new CPU[3];

        cpus[0] = new CPU("1번");
        cpus[1] = new CPU("2번");
        cpus[2] = new CPU("3번");
    }

    //method
    void startPC() {
        System.out.print(name + "컴퓨터 가동");
        System.out.println(", 전력: " + this.elecUse);
        totalElecUse += this.elecUse;

        for (int i = 0; i < cpus.length; i++) {
            if (cpus[i] != null) {
                cpus[i].startCpu();
                totalElecUse += cpus[i].getElecUse();
            }
        }

        System.out.println("총 전력량: " + totalElecUse);
    }


    //main
    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        PC[] pcs = new PC[3];

        //sample
        pcs[0] = new PC("삼보");
        pcs[1] = new PC("현대");
        pcs[2] = new PC("세진");

        final String SAMBO = "1";
        final String HYUNDAE = "2";
        final String SEJIN = "3";


        //while
        while (true) {
            System.out.print("기종선택: 0.삼보 1.현대 2.세진");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("삼보컴퓨터를 가동합니다");
                pcs[0].startPC();
            }
            break;
        }

    }



}//PC
