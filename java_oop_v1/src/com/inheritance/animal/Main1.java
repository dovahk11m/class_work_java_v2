package com.inheritance.animal;
/**
 * 4.22 1교시 상속 심화
 * xxx.java 파일에는 public을 가진 클래스는 오직 하나만 존재할 수 있다.
 */
//부모 클래스
class Animal {
    /*
    protected
    접근제어지시자의 한 종류
    자식클래스에서만 접근 가능하게 된다.
     */
    protected String name;

    void bark() {
        System.out.println(name + " 짖는 중");
    }

    void eat() {
        System.out.println(name + " 먹이 먹는 중");
    }
}//end of Animal

//자식 클래스1
class Dog extends Animal {

//    void bark() {
//        System.out.println(name + " 멍멍 짖는 중");
//    }

    @Override // 어노테이션 = 주석+힌트 : 부모클래스의 메서드 eat 오버라이드
    void eat() {
        // super.eat(); 기존 필드.. 필요하다면 사용
        // 강아지 전용 코드 작성
        System.out.println(name + "사료 먹는 중");
    }
}//end of Dog

//자식 클래스2
class Cat extends Animal {

//    void bark() {
//        System.out.println(name + " 야옹 하는 중");
//    }

    @Override
    void eat() {
        // super.eat();
        //고양이 먹는 모습 구현
    }
}//end of Cat

public class Main1 {
    //main
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "바둑이";

        dog.eat(); // 부모클래스 메서드 호출
        dog.bark(); // 자식클래스 메서드 호출

    }//end of main
}//end of class

/**
 * 보다 일반적인 개념이 부모클래스가 된다. 동물 <= 개
 */
