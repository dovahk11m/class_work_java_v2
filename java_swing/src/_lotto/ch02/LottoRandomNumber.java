package _lotto.ch02;

import java.util.Arrays;
import java.util.Random;

/**
 * 4.29
 * 난수를 만들어주는 프로그램을 따로 만들어본다.
 * <p>
 * 단일 책임 원칙
 * SRP
 * Single Responsibility Principle
 * 클래스를 설계할 때의 원칙
 * 클래스는 가능한 단 하나의 책임을 가지는 것이 좋다.
 */
public class LottoRandomNumber {

    //상수
    final int LOTTO_NUMBER_COUNT = 6;

    //메서드
    public int[] creatNumber() { //6개의 숫자묶음을 만들기 위해 배열 활용

        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];

        Random random = new Random();

        for (int i = 0; i < lottoWinNum.length; i++) {

            lottoWinNum[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {

                if (lottoWinNum[j] == lottoWinNum[i]) {
                    i--;

                }

            }//inner for 끝

        }//outer for

        //오름차순 정렬
        Arrays.sort(lottoWinNum);

        return lottoWinNum;
    }

    //메인
    public static void main(String[] args) {

        LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
        int[] result = lottoRandomNumber.creatNumber();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }//end of main
}//end of class
