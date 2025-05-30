package ch01;

import java.io.IOException;

/** 5.28 입력스트림
 키보드에서 프로그램으로 데이터가 들어오는 것

 기능을 확장해보자
 */
public class MySystemIn2 {

    public static void main(String[] args) {

        System.out.println("알파벳을 여러개쓰고 Enter!");

        int i;

        try {
            // 키보드에서 Enter는 \n 으로 표현된다.
            while ((i = System.in.read()) != '\n') {
                //읽은 바이트의 정수값을 출력
                System.out.print("i:"+i);
                System.out.println("="+(char)i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//try-catch

    }//main
}//class
