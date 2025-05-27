package com.accesss;

/*
접근 제어 지시자 Access Modifier
public
default
private
 */
// Bank 클래스 설계 측
public class Bank {
    //속성 - 이름, 잔액

    public String name; // public - 이 변수는 어디서든 접근 가능

    int balance; // default - 이 변수는 동일 package 접근 가능

    private String number; // private - 이 변수는 동일 class 접근 가능

    //생성자
    //메서드

    public void ShowInfo() {
        System.out.println("현재 계좌 번호는 " + number + "입니다");
    }

} // end of class
