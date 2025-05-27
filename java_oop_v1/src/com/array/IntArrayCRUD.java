package com.array;
/**
 * 4.18 1강 배열 복습
**/
/*
배열이란?
연관된 데이터 타입의 요소들을
통으로 관리하기 위해 사용하는 자료구조
 */
public class IntArrayCRUD {
    //main
    public static void main(String[] args) {
        /*
        1. 생성(Create) - C

        배열은 반드시 크기(길이)를 지정해야 한다.
        인덱스 번호를 통해 각 요소를 찾을 수 있다.
        모든 인덱스 번호는 0 부터 시작한다.
         */
        int[] intArray = new int[5]; // [0][1][2][3][4] - 배열길이5, 인덱스길이4

        //배열은 반복문과 잘 사용된다.
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 65;
            System.out.print((char)intArray[i] + " ");
        }
        System.out.println();
        /*
        2. 조회 (Read) - R
         */
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.print(intArray[0] + " ");
        System.out.print(intArray[1] + " ");
        System.out.print(intArray[2] + " ");
        System.out.print(intArray[3] + " ");
        System.out.print(intArray[4] + " ");
        System.out.println();
        //System.out.print(intArray[5]); // Array idex out of bounds exepcion
        //TODO 방어적 코드 고려
        /*
        3. 수정 (Update) - U
         */
        intArray[2] = 90;
        System.out.println("⭐intArray[2] 수정 후:" + intArray[2]); // 90
        /*
        4. 삭제 (Delete) - D

        배열은 고정 길이 이므로
        특정 인덱스를 0으로 초기화
        (int 이기 때문에)
        논리적으로 삭제한다
         */
        intArray[2] = 0;
        System.out.println("⭐intArray[2] 수정 후:" + intArray[2]); // 0

        System.out.println("프로그램 종료");
    }//end of main
}//end of class
