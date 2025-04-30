package com.array;
import java.util.Arrays; // 정렬
import java.util.Random; // 난수
public class ArrayMainTest4 {
    //메인
    public static void main(String[] args) {
        /*
        배열은 연관된 데이터 타입을
        통으로 관리하기 위해 사용될 수 있다.

        배열은 보통 for 반복문과 함께 많이 사용된다.

        배열을 사용해 랜덤 숫자 6개를 저장하고 출력해보자
        랜덤한 숫자를 뽑아주는 도구를 준비하자
         */
        Random random = new Random();

        int[] intBoxes = new int[6];

        for (int i = 0; i < intBoxes.length; i++) {
            // i = 0, intBoxes[0] = 랜덤 숫자 하나 저장
            // i = 2, intBoxes[1] = "
            // i = 3, intBoxes[2] = "
            // i = 4, intBoxes[3] = "
            // i = 5, intBoxes[4] = "
            // i = 6, intBoxes[5] = "
            intBoxes[i] = random.nextInt(45) + 1;
            System.out.print("[" + intBoxes[i] + "] ");
        }
        System.out.println();
        //TODO 중복 문제 해결...

        //자바 개발자들이 만들어준 정렬 기능이 있다. (배열)

        Arrays.sort(intBoxes); // 배열을 오름차순으로 정렬
        System.out.println(intBoxes);
        for (int i = 0; i < intBoxes.length; i++) {
            System.out.printf("[" + intBoxes[i] + "]\t"); // \t 탭간격의 의미
        }
    }//end of main
}//end of class
