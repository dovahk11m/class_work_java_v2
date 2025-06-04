package _client_socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadClient {

    public static void main(String[] args) {
        System.out.println("## 클라이언트 실행 ##");

        Socket socket = null;

        try {
            socket = new Socket("192.168.0.132", 5000);
            System.out.println("## 서버에 연결 시도 ##");

            //서버와 통신을 위한 스트림 준비

            //출력스트림 (데이터를 보낸다)
            PrintWriter writerStream = new PrintWriter(socket.getOutputStream(), true);

            //입력스트림 (데이터를 받는다)
            BufferedReader readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //키보드 입력스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            //서버로 부터 데이터를 읽는 작업자
            Thread readThread = new Thread(() -> {

                try {

                    String serverMessage;
                    while ((serverMessage = readerStream.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            System.out.println("## 서버측이 채팅을 종료했음 ##");
                        }
                        System.out.println("섭:" + serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("## 서버측에서 채팅 종료 ##");
                }
            });

            //서버에게 데이터를 보내는 작업자
            Thread writeThread = new Thread(() -> {

                try {
                    String clientMessage;
                    while ((clientMessage = keyboardReader.readLine()) != null) {
                        writerStream.println(clientMessage);//write + \n
                        writerStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("## 메시지 전송 오류 ##");
                }
            });

            //4. 쓰레드 작업 명령
            readThread.start();
            writeThread.start();

            //4.1 쓰레드 사용시 메인쓰레드 종료 대기
            readThread.join();
            writeThread.join();


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("## 오류 발생.. ##");
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("## 자원해제중 오류 발생 ##");
            }
        }//finally
    }//main
}//class
