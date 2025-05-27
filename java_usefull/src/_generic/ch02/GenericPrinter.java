package _generic.ch02;
/**
 5.8
 제네릭 프로그래밍을 사용해본다.

 클래스, 데이터타입, 메서드 등에서
 <T> 대체 문자열을 선언할 수 있다.
 */
public class GenericPrinter<T> {
    /*
    T(ype) 라는 대체 문자를 사용한다.
    E(lement), K(ey), V(alue).. 아무 문자나 넣어도 상관없다.
    이를 자료형 매개변수 (Type parameter) 라고 한다.

    제네릭을 쓴 클래스는
    사용하는 시점에 실제 사용될 자료형이 결정된다.
    */
    T material; // T 대체 문자형으로 변수를 선언할 수 있다.

    // get,set
    public T getMaterial() {
        return material;
    }
    public void setMaterial(T material) {
        this.material = material;
    }
    //method
    @Override
    public String toString() {
        return material.toString();
    }
}//class
