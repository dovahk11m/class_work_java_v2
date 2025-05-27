package com.interface_.animal;
/**
 * 4.23 인터페이스
 *
 * How
 * Interface를 선언하면 된다.
 * 여기 안에 선언된 메서드는
 * 모두 추상메서드가 돼야 한다.
 *
 * Why?
 */
public interface Animal {

    //추상메서드 선언
    public abstract void eat(); // 메서드 선언부만 있고 바디가 없다.

    public void move(); // abstract 생략 가능

}//end of Animal
