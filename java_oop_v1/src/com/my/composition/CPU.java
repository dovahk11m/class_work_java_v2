package com.my.composition;
/**
 * 4.21 포함관계 연습
 */
public class CPU {

    //member
    private String name;
    private int elecUse;

    //constructor
    CPU(String name) {
        this.name = name;
        elecUse = 100;
    }

    //getter
    public int getElecUse() {
        return elecUse;
    }

    //method
    void startCpu() {
        System.out.print(this.name + " CPU를 가동합니다");
        System.out.println(", 전력: " + this.elecUse);
    }

}
