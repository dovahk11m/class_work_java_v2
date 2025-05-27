package com.dot;
// A 클래스 설계 측
public class A {

    B b;

    // 생성자  - 인스턴스화할때 수행하는 코드
    public A() {
        System.out.println("1단계 A 생성자 호출");
        b = new B(); // B 객체 생성
    }
    public void callA() {
        System.out.println("1단계 callA() 메서드 호출");
        System.out.println("===== ===== ===== ===== =====");
    }
}//end of class
