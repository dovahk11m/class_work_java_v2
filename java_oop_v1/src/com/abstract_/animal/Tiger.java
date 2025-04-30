package com.abstract_.animal;
/**
 * 4.22 5교시 추상클래스
 *
 * 추상클래스를 사용하는 이유
 *
 * 단 하나라도 추상메서드가 있으면 추상클래스다.
 */
public class Tiger extends Animal {

    @Override //오버라이드 하자 오류가 없어졌다
    public void hunt() {
        System.out.println("호랑이가 사냥을 한다");
    }

    @Override
    public void move() {
        System.out.println("호랑이가 살금살금 이동한다");
    }

}//end of Tiger
