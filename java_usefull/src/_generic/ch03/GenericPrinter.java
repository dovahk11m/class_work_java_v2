package _generic.ch03;
/**
 5.8
 제네릭 프로그래밍을 사용하자
 <T> 다음은 <T extends Object>

 개나소나 들어오는 문제를 방지해야 한다.

 Material 을 상속받은 자식 클래스만
 대체 문자열에 들어올 수 있다.

 */
public class GenericPrinter<T extends Material> {

    T material;

    //get set
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

}
