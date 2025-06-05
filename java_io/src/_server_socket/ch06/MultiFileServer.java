package _server_socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/* 6.5
일대다 소켓 통신을 활용해
파일을 전송받는 서버를 구축해보자 */
public class MultiFileServer {
    //이번에는 객체지향 코딩으로 짜보자

    private static final int PORT = 5000;
    public static int connectedCounter;
    private static final String UPLOAD_DIR = "Uploads/"; //저장경로

    /* List 계열 자료구조
    사용 방법 거의 동일하고
    멀티 쓰레드 환경에서도 안정적이다 */

    //innerClass
    public static class ClientHandler extends Thread {
        private Socket socket;
        private OutputStream out;
        private InputStream in;

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
                in = socket.getInputStream();
                out = socket.getOutputStream();
                //스트림 준비 완료

                /* 1대1에서는
                out.println("message").. 와 같은 식으로 출력한다.
                자료구조에 서버-클라이언트 연결된 출력스트림을 저장할 수 있다. */

                byte[] nameBuffer = new byte[100];
                in.read(nameBuffer);
                String fileName = new String(nameBuffer).trim();
                System.out.println("파일 이름 수신:" + fileName);
                //파일을 만드는 방법.. 메모리상에 new file(경로+ 이름 명시) 객체 생성
                File file = new File(UPLOAD_DIR + fileName); //파일 객체 생성
                FileOutputStream fos = new FileOutputStream(file);
                //파일 내용을 읽고 쓰기 위한 버퍼 (4KB 단위로)
                byte[] buffer = new byte[4096];

                int byteRead;
                while ((byteRead = in.read(buffer)) != -1) { //EOF를 -1로 표현함
                    fos.write(buffer, 0, byteRead);
                    System.out.println(byteRead);
                }
                System.out.println("==서버 컴퓨터에 파일 저장 완료==");
                out.write("파일 업로드 완료:".getBytes());
                out.write(fileName.getBytes());
                out.flush();


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결중 오류 발생");
            } finally {

                try {
                    if (socket != null) socket.close();

                    //static 자료구조에 저장된 출력스트림 제거


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
                new MultiFileServer.ClientHandler(serverSocket.accept()).start();
                connectedCounter++;
                System.out.println("클라이언트 연결됨:" + connectedCounter);
            }//while


        } catch (Exception e) {
            e.printStackTrace();
        }//twr
    }//main
}//class
