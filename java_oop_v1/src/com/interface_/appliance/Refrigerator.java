package com.interface_.appliance;
/**
 * 4.23 인터페이스 2강
 */
public class Refrigerator extends HomeAppliances
        implements RemoteController, SoundEffect { // 인터페이스는 다중 구현이 가능하다.

    @Override
    public void turnOn() {
        System.out.println("냉장고 전원을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고 전원을 끈다");
    }

    @Override
    public void soundOn() {
        System.out.println("냉장고 문이 열렸다고 경고한다");
    }
}//end of Refrige
