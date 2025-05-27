package com.inheritance.hero;

/**
 * 4.21 상속개념 6
 * 클래스 다이어그램 준수해야 한다.
 */
public class Hero {

    // 클래스 속성
    String name;
    int hp;

    //생성자
    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //메서드
    void attack() {
        System.out.println("대상을 공격합니다");
    }
}//end of class
