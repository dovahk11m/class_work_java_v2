package com.array;
import java.util.Random;
public class ArrayTest3 {
    public static void main(String[] args) {
        /*
        난수 발생 기능
        랜덤한 숫자 하나를 만들어주는 도구

        Random
         */
        Random random = new Random();

        random.nextInt(); // ± 22억 범위 난수 생성

        int ranInt1 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자
        int ranInt2 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자
        int ranInt3 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자
        int ranInt4 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자
        int ranInt5 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자
        int ranInt6 = random.nextInt(45) + 1; // 1~45까지 랜덤숫자

        // 배열과 for문을 활용해 써보기

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = (random.nextInt(45) + 1);
        }

        for (int i = 0; i < 6; i++) {
            System.out.print("[" + lotto[i] + "] ");
        }
    }//end of main
}//end of for
