package com.polymorphism;
/**
 * 4.22 3교시 다형성
 *
 * 다형성
 * 하나의 데이터 타입을 다양한 형태로 바라보는 것
 *
 * 한 메서드(클래스)가 여러 형태를 가질 수 있다.
 * 상속관계를 통해 다형성을 살펴본다.
 */
public class AnimalTest1 {
    //main
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.move();
        animal1.eat();
        System.out.println();
        /*
        다형성의 장점

        부모 타입으로 자식 클래스를 인스턴스화 할 수 있다.

        이는 자바의 굉장한 기능
         */
        Animal animal2 = new Tiger(); //? 다형성.. 업캐스팅
        animal2.move();
        animal2.eat();
        System.out.println();
        /*
        코드를 작성하는 컴파일 시점
        프로그램을 실행하는 런타임 시점
         */
        Animal animal3 = new Human();
        animal3.move();
        animal3.eat();

    }//end of main
}//end of class
