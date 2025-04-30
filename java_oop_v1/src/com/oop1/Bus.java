package com.oop1;

//Bus 클래스 설계
public class Bus {
    private int busNumber;
    private int count;
    private int money;

    // 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    //메서드 -  승객을 태운다
    public void take(int money) {
        this.money += money;
        count++;
    }

    //메서드 - 상태창
    public void showInfo() {
        System.out.println("버스번호:" + busNumber);
        System.out.println("버스승객수:" + count);
        System.out.println("버스총수익:" + money);
    }
}
