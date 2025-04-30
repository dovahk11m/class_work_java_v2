package com.array;
import java.util.Random; // 랜덤 도구 호출
public class ArrayTest5 {
    //main
    public static void main(String[] args) {
        // 문자열 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println(fruits.length); // 배열길이 4

        System.out.print(fruits[0] + " "); // 사과
        System.out.print(fruits[1] + " "); // 바나나
        System.out.print(fruits[2] + " "); // 오렌지
        System.out.println(fruits[3]); // 망고

        //랜덤 숫자를 뽑아 해당 번호 과일 출력
        Random random = new Random();

        // 0, 1, 2, 3
        System.out.println(fruits[random.nextInt(4)]); // 랜덤 과일

        int choice = random.nextInt(4);
        System.out.println(fruits[choice]); // 랜덤 과일
    }//end of main
}//end of class
