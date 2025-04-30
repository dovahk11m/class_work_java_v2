package com.interface_.appliance;
/**
 * 4.23 인터페이스 2강
 *
 * 지금처럼 장난감 로봇이 가전을 상속받는다면 혼동이 올 수 있다.
 *
 * 추상클래스보다
 * 더 유연한 설계기법이 필요하다.
 *
 * 그것이 인터페이스 Interface 다.
 */
public class ToyRobot implements RemoteController, SoundEffect {

    String name;

    @Override
    public void turnOn() {
        System.out.println("장난감 로봇을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("장난감 로봇을 끈다");
    }

    @Override
    public void soundOn() {
        System.out.println("장난감 로봇이 소리를 낸다");
    }

}//end of TR
