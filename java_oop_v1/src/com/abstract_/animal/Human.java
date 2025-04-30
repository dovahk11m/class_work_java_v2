package com.abstract_.animal;
/**
 * 4.22 5교시 추상클래스
 */
public abstract class Human extends Animal{


    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷는다");
    }
}//end of Human
