package com.inheritance.hero;
/**
 * 4.21 상속개념 6_1
 * 클래스 다이어그램 준수해야 한다.
 */
public class Warrior extends Hero{

    Warrior(String name, int hp) {
        /*
        this();
        부모 사용자정의생성자가 기존재한다면
        super(); 키워드를 생성하여
        부모 생성자를 호출하여야 한다.
         */
        super(name, hp);
    }
    //메서드
    void comboAttack() {
        System.out.println("대상에게 comboAttack을 시전합니다");
    }
    //메서드 오버라이드
    //어노테이션 주석 + 힌트
    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }
    //
}//end of class
