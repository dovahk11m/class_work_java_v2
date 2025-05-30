package ch01;
import java.io.IOException;
/** 5.28 표준입출력이란
 자바에서
 표준입출력은
 프로그램과 사용자 사이에서
 기본적 데이터 교환 방법을 제공한다 */
public class MySystemIn {
    public static void main(String[] args) {

        /* 표준 입출력에 대해 살펴본다
        키보드, 모니터
        System.in
        System.out
        System.err */

        //키보드 입력
        System.out.println("알파벳 하나를 쓰고 엔터키를 누르시오");
        int i; //입력된 바이트를 저장할 변수
        try {
            /* System.in.read() 는 키보드에서 1바이트를 읽어
            ASCII 코드로 반환해준다.
            단, 한글은 3바이트라 안된다
            입력하면 깨진문자나 의미없는 정수값을 출력한다 */
            i = System.in.read();

            //읽은 바이트의 정수값을 출력하라
            System.out.println(i);

            //형변환
            System.out.println((char)i);


        } catch (IOException e) {
            //입력중 오류발생시 스택 트레이스 출력
            e.printStackTrace();
            throw new RuntimeException(e);
        }//try-catch

    }//main
}//class
