package com.composition;
/**
 * 4.21 포함개념 8_1
 */
public class PC {

    //멤버변수
    private String name;
    private int id;

    //CPU 객체 선언
    CPU cpu;

    //생성자
    PC(String name, int id) {
        this.name = name;
        this.id = id;

        cpu = new CPU();
    }

    //메서드
    void startPC() {
        cpu.startCPU();
        System.out.println(this.name + " PC 가동");
    }
    void stopPC() {
        cpu.stopCPU();
        System.out.println(this.name + "PC 정지");
    }

    //main
    public static void main(String[] args) {

        PC pc1 = new PC("삼보", 1113);
        PC pc2 = new PC("현대", 4321);

        pc1.startPC();
        pc1.stopPC();

        System.out.println();

        pc2.startPC();
        pc2.stopPC();

    }//end of main

}//end of PC
