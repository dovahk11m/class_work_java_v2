package com.abstract_.computer;
/**
 * 4.22 5_1교시 추상클래스
 *
 * 추상클래스 상속
 * 메서드 오버라이드
 *
 * Computer
 * 부모클래스
 * 추상클래스
 */
public abstract class Computer {

    abstract void display();
    abstract void typing();

    void turnOn() { System.out.println("컴퓨터를 켭니다"); }
    void turnOff() { System.out.println("컴퓨터를 끕니다"); }

}//end of Computer
