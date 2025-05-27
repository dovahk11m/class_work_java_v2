package com.polymorphism;
/**
 * 4.22 3교시 다형성
 */
public class Animal {

    public void move() {
        System.out.println("동물이 움직인다");
    }
    public void eat() {
        System.out.println("동물이 먹는다");
    }

}//end of Animal class

class Human extends Animal { // 상속 관계로 설정... 다형성

    @Override
    public void move() {
        System.out.println("사람이 걷는다");
    }
    @Override
    public void eat() {
        System.out.println("사람이 식사한다");
    }
    public void read() {
        System.out.println("사람이 읽는다");
    }

}//end of Human class

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 활보한다");
    }
    public void hunt() {
        System.out.println("호랑이가 사냥한다");
    }

}//end of Tiger class
