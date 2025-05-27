package com.interface_.animal;
/**
 * 4.23 인터페이스
 */
public class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("새가 모이를 먹는다");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 난다");
    }

}//end of Bird
