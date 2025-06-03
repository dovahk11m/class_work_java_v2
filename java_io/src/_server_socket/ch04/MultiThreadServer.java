package _server_socket.ch04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/* 6.3 서버측 코드
 1:1 양방향 통신
 멀티 쓰레드 서버 */
public class MultiThreadServer {

    //메인 쓰레드
    public static void main(String[] args) {
        System.out.println("== 서버 실행 ==");

        //준비물
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(5000);

            //클라이언트 연결 대기..
            clientSocket = serverSocket.accept();
            System.out.println("== 클라이언트 연결 ==");

            /*준비물
             1.키보드에서 값을 받는 입력스트림
             2.클라이언트 측과 연결된 출력스트림 (데이터를 보낸다)
             3.클라이언트 측과 연결된 입력스트림 (데이터를 받는다) */

            //1. 키보드 입력스트림
            //바이트 => 문자 => 보조
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            //2. clientSocket 에서 출력스트림 뽑아내기 (데이터를 보낸다)
            //바이트 => 문자
            PrintWriter writerStream = new PrintWriter(clientSocket.getOutputStream(),true);

            //3. clentSocket 에서 입력스트림 뽑아내기 (데이터를 받는다)
            //바이트 => 문자 => 보조
            BufferedReader readerStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


            //1.1 키보드입력을 받는 작업자
            Thread keyboardThread = new Thread(() -> {

                try {
                    String serverKeyMessage;
                    while ((serverKeyMessage = keyboardReader.readLine()) != null) {

                        writerStream.println(serverKeyMessage); //write + \n
                        writerStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("== 메시지 전송중 오류 발생 ==");
                }
            });

            //3.1 클라이언트 측으로부터 계속 데이터를 받는 작업자
            Thread readThread = new Thread(() -> {
                System.out.println("== readThread 시작 ==");
                try {
                    String clientMessage;
                    while ((clientMessage = readerStream.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("== 클라이언트 채팅 종료 ==");
                            break;
                        }
                        System.out.println("클:" + clientMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("== 데이터 읽는중 클라이언트 연결 종료==");
                }
            });

            //4. 쓰레드 작업 명령
            keyboardThread.start();
            readThread.start();
            System.out.println("== 쓰레드 시작 ==");

            //4.1 쓰레드 사용시 join() 메서드
            keyboardThread.join(); //쓰레드가 종료될때까지 메인쓰레드도 종료하지마
            readThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("== 서버 실행 오류: 포트 사용여부 확인 ==");
        } finally {

            try {
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("== 자원해제 중 오류 발생 ==");
            }
        }//finally
    }//main
}//class
