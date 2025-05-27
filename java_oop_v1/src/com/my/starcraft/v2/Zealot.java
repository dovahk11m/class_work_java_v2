package com.my.starcraft.v2;

/**
 * @author 조충희
 * 4.22 스타크래프트 만들기
 * 추상클래스
 */
public class Zealot extends Unit {

    //constructor
    public Zealot(String name) {
        super.name = name;
        super.power = 10; // 기본값을 만들어 줄 수 있다.
        super.hp = 80;
    }
}//end of class
