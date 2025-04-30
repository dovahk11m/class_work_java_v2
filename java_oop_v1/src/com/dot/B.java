package com.dot;
// B 클래스 설계 측
public class B {

    C c;

    // 생성자
    public B() {
        System.out.println("2단계 B 생성자 호출");
        c = new C(); // C 객체 생성
    }
    public void callB() {
        System.out.println("2단계 callB() 메서드 호출");
        System.out.println("===== ===== ===== ===== =====");
    }
}//end of class
