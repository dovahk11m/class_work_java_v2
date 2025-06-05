package _server_socket.ch06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* 6.5
일대일 소켓 통신을 활용해
파일을 전송받는 서버를 구축해보자 */
public class SimpleFileServer {
    //변수선언
    private static final int PORT = 5000; //포트번호
    private static final String UPLOAD_DIR = "Uploads/"; //저장경로
    //함수화
    private static void handleClient(Socket socket) {
        //바이트 기반 스트림 만들기
        try (InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream()) {
            //동작흐름 고민.. 파일이름 + 바이트덩어리
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
            }
            System.out.println("==서버 컴퓨터에 파일 저장 완료==");
            out.write("파일 업로드 완료:".getBytes());
            out.write(fileName.getBytes());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT);) {
            System.out.println("==클라이언트 연결요청 대기==");
            try (Socket connectedClientSocket = serverSocket.accept();) {
                System.out.println("==클라이언트 연결됨!==");
                handleClient(connectedClientSocket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//main
}//class
