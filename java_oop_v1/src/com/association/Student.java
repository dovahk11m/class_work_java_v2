package com.association;
/**
 * 4.22 2교시 연관관계
 *
 * 학생과 과목 클래스의 연관관계를 만들어본다
 */
public class Student {
    //member
    private String name;

    private Course course; //연관관계

    //constructor
    public Student(String name) {
        this.name = name;
        course = null; //수강 없음
    }

    //method
    /*
    1.강의를 듣는 메서드를 만든다.
    과목에 대한 정보는 Course에 있다.

    2.학생의 현재 수강상태를 보여주는 기능

    3.수강 종료 기능을 만들어보시오
     */

//    public void takeCourse(Course course) {
//        System.out.println(this.name + "의 수강 과목");
//        course.display();
//    }

    public void enroll(Course course) {
        this.course = course;
        System.out.println(name + ", " + course.getName() + " 과목 등록" );
    }

    public void showCourse() {
        if (this.course != null) {
            System.out.println(this.course.getName() + " 과목을 수강중입니다.");
        } else {
            System.out.println("수강중인 과목 없음");
        }
    }

    public void end(Course course) {
        if (course == null) {
            System.out.println("수강중이 아닙니다");
        } else {
            System.out.println(course.getName() + " 수강 취소");
            this.course = null;
        }
    }

}//end of Student
