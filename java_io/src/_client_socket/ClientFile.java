package _client_socket;

/* 6.2
 클라이언트 측 코드 준비물
 1. 서버측 컴퓨터 ip와 포트번호
 2. 소켓 (네트워크 통신 표준규약을 준수해야 한다)
 3. 서버측에 데이터를 전달하기 위한 출력스트림 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientFile {

    public static void main(String[] args) {

        Socket socket = null;
        /* 생성자
        연결하고자 하는 컴퓨터 ip와 포트번호 입력
        만약, 내 컴퓨터에 접근한다면 localhost 사용 가능 */
        try {
            socket = new Socket("192.168.0.88", 5001);

            /* 서버로 데이터를 보내기 위한 준비물
            출력스트림 준비 (문자 기반) */

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello, Server ~~~");

            writer.flush(); //물내리기

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }//tcf
    }//main
}//class
