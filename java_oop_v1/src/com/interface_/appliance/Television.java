package com.interface_.appliance;
/**
 * 4.23 인터페이스 2강
 */
public class Television extends HomeAppliances implements RemoteController {

//    //member
//    int width;
//    int height;
//    String color;
//
//    //method
//    public void turnOn() {
//        System.out.println("TV전원을 켠다");
//    }
//    public void turnOff() {
//        System.out.println("TV전원을 끈다");
//    }

    @Override
    public void turnOn() {
        System.out.println("티비 전원을 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("티비 전원을 끈다");
    }

}//end of TV
