package _my.lottery;

import java.util.Arrays;
import java.util.Random;

/**
 * 4.29
 * 난수생성연습
 */
public class RanNo01 {
    //상속 구현 없음

    Random random = new Random();

    //메서드 - 난수생성
    public int[] makeNo() {

        //배열선언
        int[] lottoNo = new int[6];

        //반복횟수 체크를 위한 변수
        int forCheck = 0;

        //반복문
        for (int i = 0; i < 6; i++) {

            lottoNo[i] = random.nextInt(45) + 1;

            //중복방지를 위한 inner for
            for (int j = 0; j < i; j++) {

                //중복체크 조건문
                if (lottoNo[i] == lottoNo[j]) {

                    //중복이라면 i값 소거
                    i--;
                }//if

                forCheck++;

            }//inner

        }//outer

        //반복회수 체크
        System.out.println("반복횟수: " + forCheck);

        //오름차순 정렬
        Arrays.sort(lottoNo);

        //리턴값
        return lottoNo;
    }

    //메인
    public static void main(String[] args) {

        RanNo01 ranNo01 = new RanNo01();
        int[] result = ranNo01.makeNo();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }//end of main
}//end of class
