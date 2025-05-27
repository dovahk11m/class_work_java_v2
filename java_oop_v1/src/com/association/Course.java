package com.association;
/**
 * 4.22 2교시 연관관계
 *
 * 학생과 과목 클래스의 연관관계를 만들어본다
 */
public class Course {
    //member
    private String name;

    //constructor
    public Course(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + "강의");
    }

}//end of Course
