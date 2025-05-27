package com.composition;
/**
 * 4.21 포함개념 8_1
 */
public class CPU {

    //멤버변수
    private String name;
    private int id;

    //메서드

    void startCPU() {
        System.out.println(this.name + "CPU 가동");
    }

    void stopCPU() {
        System.out.println(this.name + "CPU 정지");
    }

}//end of CPU
