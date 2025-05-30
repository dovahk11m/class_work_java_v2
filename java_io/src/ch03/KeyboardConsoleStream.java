package ch03;

import java.io.*;
/** 5.29 문자열 기반 스트림 */
public class KeyboardConsoleStream {

    /* ⭐바이트 기반 스트림의 이름 형태
    inputStream(System.in), OutputStream(System.out)

    바이트 기반은 형변환에 유니코드에.. 불편하기 짝이 없다.
    이에 문자 기반 스트림을 알아본다.

    ⭐문자 기반 스트림의 네이밍 형식
    xxxReder, xxxWriter

    InputStreamReader 의 read() 메서드는
    하나의 문자를 읽어서 그 문자의 유니코드 (utf-8,utf-16) 로 정수값을 반환한다.

    프로그램 목표
    키보드에서 문자기반 스트림을 사용해
    코드로 데이터를 읽어보자 */

    public static void main(String[] args) {

        try(InputStreamReader reader = new InputStreamReader(System.in);
        PrintWriter writer = new PrintWriter(System.out, true)){
            System.out.println("텍스트를 입력하세요(종료:Ctr+D)");

//            int charCode = reader.read();
//            System.out.println("===== ===== =====");
//            System.out.println((char)charCode);

            int charCode;
            while ((charCode = reader.read()) != -1) {
                //System.out.println((char)charCode);
                writer.println((char) charCode);
            }
            // 입력된 문자를 콘솔에 출력하고 버퍼를 즉시 비운다

            writer.flush();//즉시출력

        } catch (IOException e) {
            /* ex) 키보드 입력오류
            콘솔 출력 오류 등이 여기서 catch 된다. */
            System.out.println("입출력중 오류 발생");
        }//try-catch

    }//main
}//class
