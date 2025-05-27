package com.inheritance.hero;
/**
 * 4.21 상속개념 6_2
 * 클래스 다이어그램 준수해야 한다.
 */
public class Archer extends Hero {

    Archer(String name, int hp) {
        super(name, hp);
    }
    //메서드
    void fireArrow() {
        System.out.println("대상에게 fireArrow를 시전합니다");
    }
}//end of class
