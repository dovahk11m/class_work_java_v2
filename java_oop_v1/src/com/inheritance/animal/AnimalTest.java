package com.inheritance.animal;
/**
 * 4.22 1교시 상속 심화
 */
public class AnimalTest {
    //main
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "멍멍이";
        dog.bark();

        Cat cat = new Cat();
        cat.name = "야옹이";
        cat.bark();

    }//end of main
}//end of class
