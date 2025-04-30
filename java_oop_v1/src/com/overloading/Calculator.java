package com.overloading;
/**
 * 4.21 1강 메서드 오버로딩
 *
 *  * 메서드 오버로딩이란?
 * 같은 이름의 메서드를 여러개 정의하는 것
 */
public class Calculator {
    //덧셈 메서드 만들기
    public int add(int a, int b) {
        return a + b;
    }

    //매개변수의 데이터 타입이 다르다면 컴파일러가 구분할 수 있다.
    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    //main = 코드의 진입점
    public static void main(String[] args) {

        //println 안에 어떤 매개변수를 넣느냐에 따라 다르게 쓸 수 있다.
        // => 메서드 오버로딩
        System.out.println();

    }//end of main

}//end of class
