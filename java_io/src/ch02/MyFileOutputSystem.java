package ch02;

import java.io.FileOutputStream;

/** 5.28
 파일 출력스트림
 데이터를 보내보자 */
public class MyFileOutputSystem {

    public static void main(String[] args) {
        String data = "Hello, Java FileOutputSystem 안녕 반가워";

        /* new FileOutputStream 은 파일이 없으면 새로 생성해서 데이터를 입력한다
        Append 모드 활성화 처리 (2번째 인자값 true) */
        try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
            //문자열 data의 값을 byte 배열로 변환한다
            byte[] dataBytes = data.getBytes();

            //[72, 101, 108..]

            // byte 단위로 파일에 데이터를 입력한다
            fos.write(dataBytes);

            System.out.println("파일 출력 완료: output.txt");
            
            /* output.txt 파일을 열때
            텍스트로 보이는 이유는
            에디터가 바이트 데이터를
            문자열로 해석해서 보여줬기 때문이다. */

        } catch (Exception e) {
            throw new RuntimeException(e);
        }//try-catch


    }//main
}//class
