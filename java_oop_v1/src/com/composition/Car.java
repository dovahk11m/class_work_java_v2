package com.composition;
/**
 * 4.21 포함개념 8
 */
public class Car {

    //멤버변수설계
    String name;
    int price;
    /*
    ⭐Car 클래스는 Engine 객체를 포함한다.
    포함관계(Compositoion)
     */
    Engine engine;

    //생성자
    public Car(String name, int price) {
        this.name = name;
        this.price = price;

        /*
        자동차 객체가 생성될 때 엔진 객체도 함께 생성된다.
        포함관계
        ⭐강한의존성
         */
        engine = new Engine();
    }

    //메서드
    void startCar() {

        //car 객체를 통해 engine의 start(); 메서드를 호출한다
        engine.start();
        System.out.println("startCar() 자동차가 움직입니다.");
    }

    void stopCar() {

        engine.stop();
        System.out.println("stopCar() 자동차가 멈춥니다.");
    }

    //테스트코드작성
    public static void main(String[] args) {

        /*
        ⭐컴포지션 관계란

        자동차 클래스 내부에서
        엔진 객체를 생성시켜야 컴포지션 관계다
         */

        Car car = new Car("소나타", 1000);
        car.startCar(); // 시동걸기

        System.out.println();
        car.stopCar(); // 시동끄기

    }//main

} // end of Car
