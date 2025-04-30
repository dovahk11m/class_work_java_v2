package com.composition;
/**
 * 4.21 포함개념 8
 */
public class Engine {

    //멤버변수설계
    String name;
    int price;

    //메서드
    void start() {
        System.out.println("start() 엔진을 구동합니다.");
    }

    void stop() {
        System.out.println("stop() 엔진을 정지합니다.");
    }

}// end of Engine

/**
객체지향 패러다임 고민

Q 차와 엔진을 상속관계에 둬도 될까?

A 안된다 💀
 */