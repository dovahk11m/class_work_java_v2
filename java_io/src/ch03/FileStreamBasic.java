package ch03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 5.29 문자열 기반 스트림 */
public class FileStreamBasic {

    public static void main(String[] args) {

        //함수호출
//        writeToFile("basic_output.txt");

        //파일에서 텍스트 읽기
        readFromFile("basic_output.txt");

    }//main

    /* 파일에 텍스트를 쓰는 함수, 문자 기반 스트림 사용 */
    public static void writeToFile(String fileName) {
        
        /* FileWriter는 문자 기반 스트림으로 텍스트를 파일에 기록할 수 있다 */
        try (FileWriter writer = new FileWriter(fileName)) {
            //파일에 기록할 텍스트 선언
            String text = "자바 문자 기반 스트림 예제\n";
            writer.write(text); //파일이 없다면 생성한 뒤 텍스트 입력
            writer.write("추가 문자열");

            //스트림 비우기
            writer.flush();

            System.out.println("텍스트를 성공적으로 기록했다");

        } catch (IOException e) {
            System.out.println("파일을 쓰던 중 오류 발생:" + e.getMessage());
        }//try-catch
    }//writeToFile

    public static void readFromFile(String FileName) {

        /* FileReader 는 문자기반스트림이다
        파일에서 텍스트를 읽는다 */
        try(FileReader reader = new FileReader(FileName)){
            /* read() 메서드는 한 문자씩 읽어
            유니코드로 정수값 반환한다 */

//            int charCode = reader.read();
//            System.out.println(charCode);
//            System.out.println((char)charCode);

            //파일에 모든 텍스트를 읽을 수 있도록 코딩
            int charCode;
            while ((charCode = reader.read()) != -1) {
                System.out.print((char)charCode);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }//readFromFile

}//class
