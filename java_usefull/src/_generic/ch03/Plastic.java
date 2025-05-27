package _generic.ch03;
public class Plastic extends Material {
    @Override
    public String toString() {
        return "재료는 플라스틱 입니다.";
    }
    @Override
    public void doPrining() {
        System.out.println("플라스틱을 사용해서 프린팅..");
    }
}//Plastic
