package com.inheritance;
/**
 * 4.21 2강 상속개념 3
 *
 * 선임이 작성한 코드를 따라쓴다고 가정한다
 *
 * 만약 상속이란 개념을 이해한다면
 * 기존 클래스의 속성과 메서드를 상속받아 작업할 수 있다.
 */
public class C extends A {
    /*
    ⭐C extends A
    C가 A에 선언된 필드를 물려받겠다는 뜻이다.

    이때 A클래스는 부모클래스가 되고
    C클래스는 자식클래스가 된다.

    💀단, 자바에서는 단일상속만 인정된다.
    충돌을 방지하기 위해서다.
     */
    int level;
    String nickName;

}//end of C
