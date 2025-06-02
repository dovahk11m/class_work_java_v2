package _server_socket.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/* 6.2 서버측 코드
양방향 통신 구현 (1:1 채팅) */
public class ServerFile02 {

    public static void main(String[] args) {
        
        /* 준비물
        1. 서버소캣 포트번호 5000
        2. 입력스트림 - 메시지 수신
        3. 출력스트림 - 데이터 전송 */

        //1. 서버소켓 생성
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(5000);

            //2. 클라이언트 연결을 기다림
            Socket clientSocket = serverSocket.accept();
            System.out.println();

            //3. 데이터를 입력받을 스트림 준비
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            //reader <= 데이터를 마구 읽을 수 있다

            //4. 클라이언트 측과 연결된 소켓에서 출력 스트림을 받고
            //문자 기반 스트림으로 확장했다.
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);

            //writer <= 데이터를 클라이언트로 마구 보낼 수 있다

            //데이터 수신해보기
            String message = reader.readLine();
            System.out.println("클라이언트로부터 온 메시지:" + message);
            
            //데이터 송신해보기
            writer.println("난 서버야, 클라이언트야 반가워");
//            clientSocket.close();
            writer.flush(); //물내려


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("소켓 close() 오류");
                    e.printStackTrace();
                }
            }
        }//tcf
    }//main
}//class
