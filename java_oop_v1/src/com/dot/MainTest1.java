package com.dot;
    // 코드 실행측
public class MainTest1 {
    // main
    public static void main(String[] args) {
        System.out.println(" . 연산자의 여행!!! ");

        A a1 = new A(); // A 생성자 호출
        B b1 = new B(); // B 생성자 호출
        C c1 = new C(); // C 생성자 호출

        a1.b.c.callFinal(); // 3단계 callFinal() 메서드 호출
        b1.c.callFinal(); // 3단계 callFinal() 메서드 호출
        c1.callFinal(); // 3단계 callFinal() 메서드 호출

        a1.b.c.callC(); // callC() 메서드 호출
        a1.b.callB(); // callB() 메서드 호출
        a1.callA(); // 1단계 callA() 메서드 호출

    }//end of main
}//end of class
