package _bubble.game;
public interface Movable {

    //public abstract 생략 가능
    public abstract void left();

    void right();

    void up();

    default void down() {};

//    default void aaa() {};

}
