package _generic.ch04;
/**
 5.8
 제네릭 클래스 Box 설계
 */
public class Box<T> {

    //변수
    T material;

    //생성자
    public Box(T material) {
        this.material = material;
    }

    //get set
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    //출력
    @Override
    public String toString() {
        return material.toString();
    }
}
