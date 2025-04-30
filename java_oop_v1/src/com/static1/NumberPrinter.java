package com.static1;
// 클래스 설계
public class NumberPrinter {
    /*
    static 변수, static 메서드는
    객체 생성 없이도
    클래스 이름으로 바로 접근 가능하다.

    왜?
    Heap 메모리에 들어가기 위해서는
    new 키워드와 생성자를 호출한 뒤 동작하지만

    Method area 영역은
    프로그램을 실행시키면
    바로 메모리를 할당받아 실행되는 영역이다.
     */

    //멤버 변수 - NumberPrinter에 소속된 변수
    private int id;
//    public int waitNumber;
    public static int waitNumber; // static 변수 선언 (클래스 변수)

    // waitNumber 는 멤버변수가 아니라 class area 영역에 소속된다.

    //생성자
    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    //번호표 출력 메서드
    public void printWaitNumber() {
        System.out.println(id + "의 대기순번은 " + waitNumber);
        waitNumber++;
    }
    //대기순번이 늘어나야 한다
}//end of class
