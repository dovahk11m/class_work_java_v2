package com.dot;
// C 클래스 설계 측
public class C {

    //기본 생성자 호출 됨 => Heap 메모리에 C 객체가 올라갔다.
    public void callFinal() {
        System.out.println("3단계 callFinal() 메서드 호출");
        System.out.println("===== ===== ===== ===== =====");
    }
    public void callC() {
        System.out.println("callC() 메서드 호출");
        System.out.println("===== ===== ===== ===== =====");
    }
}// end of class
