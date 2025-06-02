package _client_socket.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* 6.2 클라이언트측 코드
양방향 통신 구현 (1:1 채팅) */
public class ClientFile02 {

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

            //writer 준비 완료

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            //reader 준비 완료

            //실행의 흐름

            //서버에 메시지 전송

            writer.write("안녕서버야 \n");
            writer.flush();//물내려

            //서버로부터 데이터 응답 수신

            String responseStr = reader.readLine();
            System.out.println("서버에서 온 메시지:" + responseStr);


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
