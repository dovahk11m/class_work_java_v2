package _server_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/* 6.4
일대다 통신을 구현하는 서버
여러 클라이언트와 연결하여 메시지를 수신한다
또 모든 클라이언트에게 브로드캐스트 처리한다 */

public class MultiNServer {

    //이번에는 객체지향 코딩으로 짜보자

    private static final int PORT = 5000;
    private static Vector<PrintWriter> clientWriters = new Vector<>();
    public static int connectedCounter;

    /* List 계열 자료구조
    사용 방법 거의 동일하고
    멀티 쓰레드 환경에서도 안정적이다 */

    //innerClass
    public static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        /* 클라이언트와 통신을 처리한다
        메시지를수신하여 모든 클라이언트에게 브로드케스트
        연결종료시 자원을 정리한다 */

        @Override
        public void run() {
            //입력스트림, 출력스트림

            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                //스트림 준비 완료

                /* 1대1에서는
                out.println("message").. 와 같은 식으로 출력한다.
                자료구조에 서버-클라이언트 연결된 출력스트림을 저장할 수 있다. */

                clientWriters.add(out);

                //클라이언트로부터 메시지를 수신하고 방송할 예정
                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("수신받음:"+ message);

                    //순차적으로 모든 출력스트림에 메시지 출력
                    for (PrintWriter writer:clientWriters) {
                        writer.println("방송"+message);
                    }
                }




            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결중 오류 발생");
            } finally {

                try {
                    if (socket != null) socket.close();

                    //static 자료구조에 저장된 출력스트림 제거
                    clientWriters.remove(out);

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("소켓 자원해제중 오류 발생");
                }

            }//t-c-f
        }//run

    }//innerClass

    //main
    public static void main(String[] args) {

        System.out.println("== 서버가 시작됐습니다 ==");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            /* 메인쓰레드는 무한루프를 돌리면서
            클라이언트의 연결요청을 기다린다 */

            while (true) {

                /* 연결이 들어올 때마다 새로운 ClientHandler가 생성된다
                다른 작업자가 동작을 진행시킬 수 있다 */
                new ClientHandler(serverSocket.accept()).start();
                connectedCounter++;
                System.out.println("클라이언트 연결됨:" + connectedCounter);
            }//while


        } catch (Exception e) {
            e.printStackTrace();
        }//twr
    }//main
}//class
