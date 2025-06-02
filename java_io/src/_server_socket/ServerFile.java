package _server_socket;
/* 6.2
 서버측 코드
 간단한 네트워크를 통한 서버측 프로그래밍 준비물
 1. 서버소켓
 2. ip와 포트번호 (0~ 65535 까지 설정 가능, 컴퓨터마다)
 3. 사전 기반지식 - 잘 알려진 포트 번호
 주로 시스템 레벨에서 선점한 포트 번호 (0~1023 까지)
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

    public static void main(String[] args) {

        /* 소켓통신을 하기 위해서 (서버측)
        1. 서버소켓이 필요 (서버측만 준비) */

        ServerSocket serverSocket = null; //서버소켓 선언

        try {
            /* 객체 선언
            내가 만든 서버 소켓 프로그래밍에
            포트번호 5000번을 할당했다. (중복이라면 에러) */
            serverSocket = new ServerSocket(5001);

            System.out.println("서버를 시작합니다(포트번호 5000)");

            /* 이제 클라이언트 측 연결을 기다린다
            이때 내부적으로 while 문이 돌아가고 있다.
            client가 연결 요청을 할 때까지.. */
            Socket clientSocket = serverSocket.accept();

            /* 클라이언트와 연결이 되면
            서로 서버 측 Socket이 생성되고
            클라이언트 Socket이 연결된다. */

            System.out.println(">>클라이언트 연결<<");

            /* 클라이언트에서 보낸 데이터를 읽기 위한 입력스트림 필요
            getInputStream() 바이트 단위로 데이터 읽기 가능
            문자 기반 스트림으로 확장 + 보조 스트림
            클라이언트가 보낸 데이터 한 줄 기반으로 읽기 */

//            InputStream input = clientSocket.getInputStream();
//            String message = reader.readLine();
//            System.out.println("클라이언트 메시지:" + message);

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            System.out.println("클라이언트 메시지:" + message);

            // 클라이언트 소켓 닫기
            clientSocket.close();

        } catch (IOException e) {
            // 포트 충돌, 클라이언트 연결 실패 등의 예외 처리
            System.out.println("에러 발생: 포트가 이미 사용 중이거나 클라이언트 연결에 실패했습니다.");
        } finally {
            // 자원해제: 서버 소켓 닫기
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    //추적 및 시간 출력 가능 => 파일 생성, 로그 기록
                    e.printStackTrace();
                }
            }
        }//tcf
    }//main
}//class
