package ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

    public static void main(String[] args) {

        //파일경로를 지정
        String sourceFilePath = "tool.zip";
        String destinationFilePath = "tool_copy.zip";

        //소요시간 측정 시작
        long startTime = System.nanoTime();

        //바이트 기반 스트림으로 데이터를 다룰 수 있다.
        try(FileInputStream fis = new FileInputStream(sourceFilePath);
            FileOutputStream fos = new FileOutputStream(destinationFilePath)){
            /*한 바이트씩 읽어서
            한 바이트씩 쓴다 */

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("입력스트림 -> 출력스트림, 파일 복사 완료");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //소요시간 측정
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        //소요시간 출력
        double seconds = duration / 1_000_000_000.0;
        System.out.println("나노초:"+duration);
        System.out.println("초값:"+seconds);


    }//main
}//class
