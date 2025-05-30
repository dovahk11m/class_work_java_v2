package ch03;

import java.io.FileWriter;
import java.io.InputStreamReader;

/** 5.29 문자 기반 스트림
 1.키보드에서 값을 받아 쓰기
 2. 파일을 읽는 함수를 만들어 실행하기
 */
public class FileStreamUserInput {

    public static void main(String[] args) {

        writeUserInputToFile("user_input.txt");

    }//main

    //키보드에서 입력을 받아 파일에 쓰는 함수를 만드시오
    public static void writeUserInputToFile(String fileName) {

        try(InputStreamReader reader = new InputStreamReader(System.in);
            //append 모드 활성화
            FileWriter writer = new FileWriter(fileName, true)){

            System.out.println("콘솔에서 텍스트를 입력");

            //한 문자씩 읽고 유니코드 정수값을 반환
            int charCode;
            while ((charCode = reader.read()) != -1) {
                writer.write(charCode);
                writer.flush(); //문자 하나 받고 물내리기
            }
            System.out.print(fileName+".txt 파일에 입력 성공");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }//writeUserInputToFile

    //파일에서 텍스트를 읽는 함수를 만드시오


}//class
