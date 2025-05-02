package _bubble.test05;

/**
 5.2
 캐릭터의 동작을
 인터페이스로 정의한다.

 인터페이스의 모든 메서드는 추상메서드여야 한다.
 단, Default Method를 제외하고..

 디폴트 메서드로
 안쓰는데 억지로 구현해야 하는 경우를 방지할 수 있다.
 */
public interface Movable {

    //public abstract 생략 가능
    public abstract void left();

    void right();

    void up();

    default void down() {};

//    default void aaa() {};

}
