package _client_socket.ch03;

import java.io.*;
import java.net.Socket;

/* 6.2 클라이언트측 코드
양방향 통신 구현 (1:1 채팅)
키보드에서 값을 받아보자 */
public class ClientFile03 {

    public static void main(String[] args) {

        /* 준비물
        1. ip주소와 포트번호 5000
        2. 소켓
        3. 출력스트림 - 데이터 전송
        4. 입력스트림 - 메시지 수신 */

        Socket socket = null;

        try {

            //소켓 준비
            socket = new Socket("localhost", 5000);

            //출력스트림 준비
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            //입력스트림 준비
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            //키보드 입력스트림
            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

            //서버로부터 데이터 응답 수신
            String response = reader.readLine();
            System.out.println("서버:"+ response);

            //메시지 송신
            System.out.println("메시지를 입력하시오");
            String line;
            while ((line = keyReader.readLine()) != null && !line.isEmpty()) {
                System.out.println("클라이언트:" + line);
                writer.write(line + "\n");
                writer.flush();
            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("클라이언트 소켓 종료 오류");
                    e.printStackTrace();
                }
            }
        }

    }//main
}//class
