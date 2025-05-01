package _lotto.ch01;

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

    //변수

    //생성자

    //메서드
    public int[] creatNumber() { //6개의 숫자묶음을 만들기 위해 배열 활용

        int[] lottoWinNum = new int[LOTTO_NUMBER_COUNT];

        Random random = new Random();

        //for문이 돌아간 횟수 확인해보자
        int forCount = 0;

        for (int i = 0; i < lottoWinNum.length; i++) {

            lottoWinNum[i] = random.nextInt(45) + 1;

            /*
            outer for 1회차 순회
                j < i, 0 < 0 반복문이 수행되지 않는다.
             */
            for (int j = 0; j < i; j++) {
                /*
                최초 outer for 가 2회차 수행될 때
                inner for는 1회차 수행된다.
                 */
                if (lottoWinNum[j] == lottoWinNum[i]) {
                    i--;
                    /*
                    값이 중복된 상태라면
                    outer for 의 i 값을 내려
                    한 번 더 반복문을 수행하도록 한다.
                     */
                }

                forCount++; // for문이 돌아간 횟수 계산

            }//inner for 끝

            /*
            중복을 없애보자

            0번과 1번이 같은가?
            0번과 2번이 같은가?
            0번과 3번이 같은가?
                만약 같다면 다시 번호 생성!
            0번과 4번이 같은가?
            0번과 5번이 같은가?

            2중 for문?
             */

        }//outer for

//        lottoWinNum[0] = random.nextInt(45) + 1;
//        lottoWinNum[1] = random.nextInt(45) + 1;
//        lottoWinNum[2] = random.nextInt(45) + 1;
//        lottoWinNum[3] = random.nextInt(45) + 1;
//        lottoWinNum[4] = random.nextInt(45) + 1;
//        lottoWinNum[5] = random.nextInt(45) + 1;

        System.out.println("for문이 돌아간 횟수는: " + forCount);

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
