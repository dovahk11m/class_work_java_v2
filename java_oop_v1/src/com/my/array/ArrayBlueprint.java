package com.my.array;

import java.util.Scanner;

public class ArrayBlueprint {

    /// BookStore 클래스 설계

    //멤버변수 선언
    private String title;

    //static 변수 선언
    static int currentBookIndex = 0;

    //생성자
    public ArrayBlueprint(String title) {
        this.title = title;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    /// 함수 설계

    //생성
    public static void save() {
    }

    //조회
    public static void read() {
    }

    //수정
    public static void update() {
    }

    //삭제
    public static void delete() {
    }

    /// 메인 함수
    public static void main(String[] args) {

        //스캐너 호출
        Scanner scanner = new Scanner(System.in);

        //배열 선언
        ArrayBlueprint[] book = new ArrayBlueprint[100];

        //샘플 데이터
        book[0] = new ArrayBlueprint("토지");

        //상수선언
        final String SAVE = "1";

        //흐름제어변수
        boolean flag = true;

        //반복문
        while (flag) {
            break;
        } // end of while

    }//end of main

}//end of class
