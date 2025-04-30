package com.my.array;
import java.util.Random; // 랜덤
public class ArrayLotto1 {

    public static void main(String[] args) {
        int[] intBoxes = new int[6];

        Random random = new Random();

        for (int i = 0; i < intBoxes.length; i++) {
            intBoxes[i] = random.nextInt(45) + 1;
            if (i == 0) {
                System.out.print("오늘의 번호는: ");
            }
            System.out.print(intBoxes[i] + "번 ");

            if (i == intBoxes.length - 1) {
                System.out.println("축하합니다!");
            }
        }

        char[] intBoxes2 = new char[26];

        for (int i = 0; i < intBoxes2.length; i++) {
            intBoxes2[i] = (char)(i + 65);
            System.out.print(intBoxes2[i] + " ");
        }

    }//end of main
}//end of class
