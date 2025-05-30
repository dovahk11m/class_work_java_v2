package ch03;

import java.io.*;

public class KeyboardConsoleStream2 {
    public static void main(String[] args) {

        try(InputStreamReader reader = new InputStreamReader(System.in);
            PrintWriter writer =new PrintWriter(System.out, true)
        ) {
            System.out.println("텍스트를 입력하세요 종료하려면 (ctrl + D)");

//           int charCode = reader.read();
//            System.out.println("--------------------------------------");
//            System.out.println((char)charCode);
            int charCode;
            while ( (charCode = reader.read()) != -1 ){
                // System.out.println((char) charCode);
                writer.print((char) charCode);
            }

            writer.flush(); // 즉시 출력
        } catch (IOException e) {

            System.out.println("입출력중 오류 발생");
        }

    } // end of main
}