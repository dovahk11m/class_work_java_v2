package com.function;
/*
함수란
데이터를 받아서 처리하고
결과를 돌려주는 코드 블록이다.

static 을 사용하면
객체 없이 바로 호출 가능
 */
public class CalculatorMain {
    // main
    public static void main(String[] args) {
        //코드 테스트

        int num1 = 10;
        int num2 = 0;
        int testNumber = 11;

        int resultAdd = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultAdd);

        int resultSub = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultSub);

        int resultMul = multifly(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultMul);

        double resultDiv = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + resultDiv);

        boolean resultEven = isEven(testNumber);
        System.out.println(testNumber + ", 짝수인가? " + resultEven);

        boolean reusltOdd = isOdd(testNumber);
        System.out.println(testNumber + ", 홀수인가? " + reusltOdd);

    } // end of main

    // 두 숫자를 더하는 함수

    static int add(int a, int b) { // 함수의 선언부
        return a + b; // 입력받은 a와 b를 더하고 반환
    } // 함수의 바디

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b; // 입력받은 a에서 b를 빼고 반환
    }

    // 두 숫자를 곱하는 함수
    static int multifly(int a, int b) {
        return a * b; // 입력받으 a와 b를 곱하고 반환
    }

    // 두 숫자를 나누는 함수
    static double divide(int a, int b) {
    /*
    방어적 코드를 잘 작성해야 한다.
     */
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        return (double) a / b;
    }

    // 짝수인지 판별하는 함수
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 홀수인지 판별하는 함수
    static boolean isOdd(int number) {
        return number % 2 != 0;
        // System.out.println("a");
    }
} // end of class
