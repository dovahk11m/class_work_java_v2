package com.association;
/**
 * 4.22 2교시 연관관계
 */
public class MainTest1 {
    //main
    public static void main(String[] args) {

        Student student = new Student("홍길동");

        Course java = new Course("자바");
        Course db = new Course("데이터베이스");

        student.showCourse(); //상태
        System.out.println();

        student.enroll(java); //강의등록
        student.showCourse(); //상태
        System.out.println();

        student.end(java); //수강취소
        student.showCourse(); //상태

    }//end of main
}//end of class
