package ch02;

import java.io.FileInputStream;
import java.io.IOException;

/** 5.28
 파일 입력스트림 */
public class MyFileInputStream2 {

    public static void main(String[] args) {

        /* a.txt 파일로부터
        바이트 단위로 데이터를 읽어
        콘솔창에 출력해보자

        주의점
        한글은 3바이트 기반이라
        1바이트씩 읽으면 깨짐 현상이 발생할 수 있다. */

        try (FileInputStream in = new FileInputStream("a.txt")) {

            /* 사전 기반 지식
            파일에서 바이트 단위로 데이터를 읽을 때
            더 이상 읽을 데이터가 없으면
            정수값 -1을 반환한다. */

            int readData;
            while ((readData=in.read()) != -1) {
                System.out.print((char)readData);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//main
}//class