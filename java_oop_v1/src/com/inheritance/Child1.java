package com.inheritance;

public class Child1 extends Super1{

    int age;

    /*
    상속관계에 있어서
    부모가 존재해야 자식이 존재할 수 있다.
     */
    public Child1(String name, int age) {
        super(name); // 부모가 먼저
        this.age = age; // 나식은 나중
    }
}//end of class
