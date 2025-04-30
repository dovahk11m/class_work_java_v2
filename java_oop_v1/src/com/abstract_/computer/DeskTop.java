package com.abstract_.computer;
/**
 * 4.22 5_1교시 추상클래스
 * 구현클래스
 * Computer의 자식클래스
 */
public class DeskTop extends Computer {

    void display() { System.out.println("데스크탑 화면을 띄웁니다"); }
    void typing() { System.out.println("데스크탑에 문자를 입력합니다"); }

}//end of DeskTop
