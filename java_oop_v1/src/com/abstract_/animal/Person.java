package com.abstract_.animal;
/**
 * 4.22 5교시 추상클래스
 */
public class Person extends Human{

    //구현 메서드로 만들어주면 된다.
    @Override
    public void hunt() {
        System.out.println("총으로 동물을 사냥한다");
    }
}//end of Person
