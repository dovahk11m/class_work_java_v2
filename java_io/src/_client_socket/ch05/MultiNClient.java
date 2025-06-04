package _client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* 6.4
서버와 양뱡향 통신하는 클라이언트 측 코드*/
public class MultiNClient {

    private final String name;
    private Socket socket;
    private PrintWriter writerSteam;
    private BufferedReader readerStream;
    private BufferedReader keyReaderStream;

    //생성자
    public MultiNClient(String name) {
        this.name = name;
    }//


    //행위
    //1. connectToServer - 서버 5000번 포트에 연결 처리
    private void connectToServer() throws IOException {

        socket = new Socket("192.168.0.156", 5000);
        System.out.println("## 서버 연결 완료 ##");

    }//connectToServer

    //2. setupStream - 입출력 스트림 설정 처리
    private void setupStream() throws IOException {

        writerSteam = new PrintWriter(socket.getOutputStream(), true);
        readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyReaderStream = new BufferedReader(new InputStreamReader(System.in));

    }//setupStream

    //createdRead - 서버로부터 온 메시지를 화면 출력
    private Thread createRead() {
        return new Thread(() -> {

            //여기는 run()메서드 안이다
            try {
                String serverMessage;
                while ((serverMessage = readerStream.readLine()) != null) {
                    System.out.println("서버:" + serverMessage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }//createdRead

    //createWrite - 키보드에서 입력을 받아 서버로 메시지 전송
    private Thread createWrite() {
        return new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    String keyboardMessage;
                    while ((keyboardMessage = keyReaderStream.readLine()) != null) {
                        writerSteam.println("[" + name + "]" + keyboardMessage);
                        //writerSteam.flush();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }//createWrite

    //4.cleanUp -  자원을 정리하고 소켓 종료
    private void cleanUp() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//cleanUp

    //3. startCommunication - 쓰레드 생성 및 start().. 양방향 통신 시작
    private void startCommunication() throws InterruptedException {
        Thread readThread = createRead();
        Thread wirteThread = createWrite();

        readThread.start();
        wirteThread.start();

        readThread.join();
        wirteThread.join();
    }//startCommunication

    //chatRun - chatStart()
    public void chatRun() {

        try {
            connectToServer();
            setupStream();
            startCommunication();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
            cleanUp();
        }


    }//chatRun

    //main - 메인함수
    public static void main(String[] args) {

        System.out.println("## 클라이언트 프로그램 시작 ##");
        MultiNClient nClient = new MultiNClient("조충희");
        nClient.chatRun();

    }//main
}//class
