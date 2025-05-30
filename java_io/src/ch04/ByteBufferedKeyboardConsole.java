package ch04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/** 5.29 보조 기반 스트림
 기반 스트림이 있어야 사용할 수 있다
 InputStram, InputStreamReader.. */

public class ByteBufferedKeyboardConsole {
    public static void main(String[] args) {
        //바이트 기반 스트림 + 버퍼드 스트림
//        BufferedInputStream bis = new BufferedInputStream(System.in);
//        BufferedOutputStream bos = new BufferedOutputStream(System.out);

        try(BufferedInputStream bis = new BufferedInputStream(System.in);
            BufferedOutputStream bos = new BufferedOutputStream(System.out)){
            /*보조스트림을 활용해
            한번에 1024바이트 크기의 버퍼배열로 데이터를 읽자*/

            //버퍼 도구 준비
            byte[] buffer = new byte[1024];
            int bytesRead;
//            bis.read(); //한번에 1바이트씩 읽는다
//            bis.read(buffer);// 한번에 1024 크기만큼 읽는다

            while ((bytesRead = bis.read(buffer)) != -1) {
                //System.out.println()
                bos.write(buffer, 0, bytesRead);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }//main
}//class
