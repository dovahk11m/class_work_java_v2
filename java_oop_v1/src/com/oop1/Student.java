package com.oop1;

//
public class Student {
    private String name;
    private int money;

    //생성자
    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //버스와 상호작용
    public void takeBus(Bus bus) {
        bus.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println("학생이름" + name);
        System.out.println("학생소지금" + money);

    }
}//
