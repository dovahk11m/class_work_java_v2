package com.inheritance;
/**
 * 4.21 2강 상속개념 4
 */
public class CMainTest1 {
    //main = 코드의 진입점
    public static void main(String[] args) {

        //A와 C는 상속관계
        C c = new C();
        c.name = "C클래스입니다";
        c.height = 100;
        c.weight = 20;
        c.age = 10;

        c.level = 1;
        c.nickName = "자식 C클래스";

    }//end of main
}//end of class
