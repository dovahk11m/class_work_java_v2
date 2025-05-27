package com.abstract_.animal;
/**
 * 4.22 5교시 추상클래스
 * <p>
 * 추상클래스
 * abstract class
 * <p>
 * 하나 이상의 추상 메서드를 포함한 클래스
 * class 앞에 abstract가 뭍으면 추상클래스다.
 *
 * 강제적으로 타입으로만 설계하는 기법이다.
 *
 * abstract - 강제성
 */
public abstract class Animal { //추상클래스로 선언됐다.

    String name;

    public void move() {
        System.out.println("동물이 이동한다");
    }

    //추상메서드를 만들어보자
    public abstract void hunt();
    /*
    클래스 안에
    단 하나라도 추상 메서드를 가지고 있다면
    그 클래스는 반드시 추상 클래스가 돼야 한다.
     */

}//end of Animal
