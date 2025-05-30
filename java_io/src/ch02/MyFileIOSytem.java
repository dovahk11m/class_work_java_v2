package ch02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/** 5.28
 파일 입출력스트림 */
public class MyFileIOSytem {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("my1.txt");
            FileOutputStream fos = new FileOutputStream("my2.txt",true)){

            int readData;
            byte[] bytes;
            String writeData = "";

            while ((readData=fis.read()) != -1) {
                writeData = writeData.concat(String.valueOf((char) readData));
            }

            writeData = writeData.concat("문자열추가+");
            bytes = writeData.getBytes();
            fos.write(bytes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }//main
}//class
