package ch02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/** 5.28
 파일 출력스트림
 데이터를 보내보자 */
public class MyFileIOSystem3 {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("my1.txt")){
            int i;
            String data = "in a galaxy far far away\n";
            byte[] dataBytes = data.getBytes();

            FileOutputStream fos = new FileOutputStream("my2.txt",true);
            while ((i = fis.read()) != -1){
                fos.write(i);
                System.out.print((char)i);
            }
            fos.write(dataBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }//main
}//class
