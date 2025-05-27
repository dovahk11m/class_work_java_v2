package com.inheritance;
/**
 * 4.21 2강 상속개념 5
 *
 *선임이 작성한 코드라고 가정한다
 */
public class Cal {
    //메서드를 만들어보자
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

}//end of Cal

/**
 *  xxx.java 파일 하나에
 *  여러 클래스를 선언할 수 있다.
 *  단 스코프는 분명히 구분된다.
 *
 *  또한 단 하나의 자바파일에
 *  public 클래스는 오직 하나만 존재할 수 있다.
 *
 *  요청사항
 *  마이너스 기능을 추가하라
 *  곱하기 기능에서 n1과 n2에 0이 들어온다면
 *  0을 입력하지 말라는 문구를 추가하라
 */

class ChildCal extends Cal { //자식 클래스는 접근제어코드 public을 붙일 수 없다

    //마이너스 기능 추가
    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    /*
    상속을 사용했을때

    메서드 오버라이드라는 개념이 있다.
    Method Override

    부모클래스의 메서드를 재정의 하는 것이다.

    문법
    부모클래스의 메서드 이름과 매개변수 개수 및 타입
    즉, 모양이 동일해야 한다.
     */

    //곱셈 기능 수정
    public int multiply(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            System.out.println("0을 입력하지 마시오");
        }
        return n1 * n2;
    }
    /*
    부모 클래스의 메서드를 자식 클래스에서 수정했다면
    메서드 오버라이드라고 한다.
     */
}//end of ChildCal
