package com.oop1;

public class MainTest1 {

    public static void main(String[] args) {

        Student s1 = new Student("티모", 10000);
        Bus bus1 = new Bus(100);
        Bus bus2 = new Bus(133);

        s1.takeBus(bus2);

        s1.showInfo(); // 학생 상태창
        bus2.showInfo(); // 버스 상태창

    }
}
