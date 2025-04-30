package com.inheritance.hero;
/**
 * 4.21 상속개념 6_3
 * 클래스 다이어그램 준수해야 한다.
 */
public class Wizard extends Hero {

    Wizard(String name, int hp) {
        super(name, hp);
    }
    //메서드
    void freezing() {
        System.out.println("대상에게 freezing을 시전합니다");
    }
}//end of class
