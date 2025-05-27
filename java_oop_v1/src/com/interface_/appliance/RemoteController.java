package com.interface_.appliance;
/**
 * 4.23 인터페이스 2강
 *
 * 인터페이스 개념정리
 */
public interface RemoteController {

    /*
    ⭐인터페이스란

    구현된 것이 아무것도 없는
    밑 그림만 있는 기본 설계도다.

    모든 변수는 상수가 된다.
    public static final int N;

    모든 메서드는 추상메서드가 된다.
    심지어 abstract 키워드도 필요 없다.

    추상클래스보다 추상화 수준이 더 높다.

    ⭐Why
    인터페이스는
    동작 중심의 클래스를 선언해야 할 때 사용한다.

    인터페이스는 동작 중심이다.

    인터페이스는 표준이다.

    또는 강제성 있는 규약이다.
     */

    //오직 static final 상수만을 가질 수 있다.
    public static final int SERIAL_NUMBER = 100;

    //오직 abstract 추상 메서드만을 가질 수 있다.
    public abstract void turnOn();
    public void turnOff();

}//end of RemoteController
