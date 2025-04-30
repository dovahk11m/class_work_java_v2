package com.interface_.animal;
/**
 * 4.23 인터페이스
 * <p>
 * 인터페이스는 상속이 아니라 구현받다, 구현하다 라고 말한다.
 * <p>
 * Animal 인터페이스를 구현받았다.
 */
public class Dog implements Animal {

    //추상메서드를 구현메서드로 재정의 해야 한다.
    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹는다");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달린다");
    }

    //main
    public static void main(String[] args) {

        //다형성 적용
        Animal dog = new Dog(); //업캐스팅 됐다
        Animal bird = new Bird();

        dog.eat();
        dog.move();
        System.out.println();
        bird.eat();
        bird.move();

    }//end of main

}//end of dog
