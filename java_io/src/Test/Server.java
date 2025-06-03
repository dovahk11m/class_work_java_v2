package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("== 서버 실행 ==");
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(5000);
            clientSocket = serverSocket.accept();
            System.out.println("== 클라이언트 연결 ==");

            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter streamwriter = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Thread keyThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = keyReader.readLine()) != null) {
                        streamwriter.println(message);
                        streamwriter.flush();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("== 메시지 전송중 오류 발생 ==");
                }
            } );
            Thread readThread = new Thread(() -> {
                System.out.println("== readThread 시작 ==");
                try {
                  String message;
                    while ((message = streamReader.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(message)) {
                            System.out.println("== 클라이언트 채팅 종료 ==");
                            break;
                        }
                        System.out.println("클:"+message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("== 데이터 읽는중 클라이언트 연결 종료==");
                }
            } );
            keyThread.start();
            readThread.start();
            System.out.println("== 쓰레드 시작 ==");

            keyThread.join();
            readThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("== 서버 실행 오류: 포트 사용여부 확인 ==");

        }finally {
            try {
                if (clientSocket != null) clientSocket.close();
                if( serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("== 자원해제 중 오류 발생 ==");

            }
        }//finally
    }//main
}//class
