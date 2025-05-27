package com.polymorphism.fruits;
/**
 * 4.22 3_1교시 다형성
 */
public class Fruit {

    String name;
    int price;

    public Fruit() {
        name = "춘식이복숭아";
        price = 5000;

    }
    public void showInfo() {
        System.out.print("상품명: ");
        System.out.print(name + " ");
        System.out.print("가격: ");
        System.out.println(price + "원");
    }
}//end of Fruits
