package _Inner;
/**
 * 4.25 inner 클래스 1강
 *
 * 정적 내부 클래스를 만들어보자
 * Static Inner Class
 */
public class Spaceship {

    private Engine innerEngine;
    // 우주선에서만 사용할 Engine 클래스를 만들고 싶어졌다.

    //method - 우주선 엔진 추가
    public void addengine(Engine engine) {
        innerEngine = engine;
    }

    //method - 우주선 출발
    public void startSpaceShip() {
        if (innerEngine == null) {
            System.out.println("엔진이 없습니다");
        } else {
            System.out.println("우주선이 출발합니다.");
        }
    }

    //정적 내부 클래스
    public static class Engine {

        public static int ENGINE_COUNT = 0;
        private int serialNumber;

        public Engine() {
            ENGINE_COUNT ++;
            this.serialNumber = ENGINE_COUNT;
        }

        public void start() {
            System.out.println("엔진 " + serialNumber + "번 가동");
        }

    }//end of inner class

}//end of outer class
