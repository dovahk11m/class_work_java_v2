package _server_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* 6.2 서버측 코드
양방향 통신 구현 (1:1 채팅)
키보드에서 값을 받아보자 */
public class ServerFile03 {

    public static void main(String[] args) {
        
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

            //4. 소켓에서 출력 스트림 수신, 문자 기반 스트림으로 확장
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);

            //메시지 송신해보기
            writer.println("난 서버야, 클라이언트야 반가워");
            writer.flush(); //물내려

            //데이터 수신해보기
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("클라이언트 메시지:" + message);
            }

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
