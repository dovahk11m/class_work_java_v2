package com.array;
public class ArrayTest1 {
    //메인
    public static void main(String[] args) {
        /*
        배열이란?
        연관된 데이터 타입을 한번에 모아서
        통으로 관리하기 위해 사용한다

        배열의 문법

        규칙1.
        먼저 몇개의 데이터가 들어갈지
        ⭐크기를 지정해야 사용할 수 있다.
         */

//        int[] numbers; //배열의 선언
//        numbers = new int[3]; // 크기 지정 - int(4byte) 공간 4개 초기화

        int[] numbers = new int[3]; // 👍 데이터 타입에 대괄호 [] 문법 허용
        int unBoxes[] = new int[5]; // 변수 뒤에 대괄호 [] 문법 허용

        /*
        [][][] <= 값이 안들어있는 상태
        배열 선언과 동시에 값을 초기화 해보자
        초기화하면 크기는 별도로 지정하지 않아도 된다.
         */
        int[] grades = new int[]{1, 2, 3}; // [1][2][3]
        int[] grades2 = {1, 2, 3, 4, 5, 6}; // 👍 [1][2][3][4][5][6]

        //5개 크기 double타입 배열 선언
//        double[] heights = {100.5, 82.75, 65, 67.81, 102};
        double[] doubles = new double[5];

        //공간에 값 채우기
        doubles[0] = 1.0;
        doubles[1] = 1.1;
        doubles[2] = 1.2;
        doubles[3] = 1.3;
        doubles[4] = 1.4;

        /*
        ⭐모든 프로그래밍 언어에서
        인덱스 번호는 0부터 시작한다
         */

        /*
        doubles 배열의 길이는 얼마일까? 5
        doubles 인덱스의 길이는 얼마일까? 4

        ⭐모든 인덱스의 길이는 n - 1이다.
         */
//        doubles[5] = 1.0;

        int[] array1 = new int[57]; // 배열의 길이는 57, 인덱스의 길이는 56
        int[] array2 = new int[123]; // 배열 123 인덱스 122

        String[] stringBox = new String[3];
        stringBox[0] = "가";
        stringBox[1] = "나";
        stringBox[2] = "다";
//        stringBox[3] = "라"; //인덱스의 길이 조심

        System.out.println(stringBox.length); // 3 = 배열의 길이

        System.out.print(stringBox[0]);
        System.out.print(stringBox[1]);
        System.out.print(stringBox[2]);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(stringBox[i]); // 가 나 다
        }
    }//end of main
}//end of class
