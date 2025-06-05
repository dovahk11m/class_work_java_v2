package _client_socket.ch06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SimpleFileClient {
    //변수 선언
    private static final int PORT = 5000;
    private final String name;
    private Socket socket;
    private OutputStream out;
    private InputStream in;
    private final Scanner scanner = new Scanner(System.in);
    //생성자 (클라이언트 이름)
    public SimpleFileClient(String name) {
        this.name = name;
    }
    private void connectToServer() throws IOException {
        socket = new Socket("localhost", PORT);
        System.out.println("##서버와 연결됐음!##");
    }
    private void setupStreams() throws IOException {
        out = socket.getOutputStream();
        in = socket.getInputStream();
        System.out.println("##소켓과 연결된 바이트기반 스트림 준비!##");
    }
    //키보드에서 파일경로 입력받아 서버로 파일보내기
    private void uploadFile() throws IOException {
        System.out.println("##보내고 싶은 파일 경로를 입력 (예: C:/test.txt)##");
        String filePath = scanner.nextLine();
        //방어적 코드 작성 - 파일 확인
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) { //파일이 없거나 잘못된 경로
            System.out.println("##파일이 없습니다##");
            return;
        }
        /* 서버측과 약속
        서버측에서 먼저 in.read(100) 보내겠다고 해놨음
        이에 따라 클라이언트가 먼저 100을 보내줘야 함 */
        String fileName = file.getName();
        byte[] nameByte = fileName.getBytes();
        byte[] nameBuffer = new byte[100]; //100칸 고정
        //out.write(100);
        if (nameByte.length > 100) {
            System.out.println("==파일이름은 100글자 이내여야 합니다==");
            return;
        }
        //1바이트에 한 글짜씩 표현 가능
        for (int i = 0; i < nameByte.length; i++) {
            nameBuffer[i] = nameByte[i];
        }
        //서버측으로 파일 이름부터 보내기
        out.write(nameBuffer);
        out.flush(); //바로보내기
        //파일 내용 바이트로 변환해서 보내기
        try(FileInputStream fis = new FileInputStream(file)){
            byte[] buffer = new byte[4096]; //4KB씩
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1) { //EOF
                out.write(buffer,0,byteRead); //읽은만큼
            }
            out.flush(); //다보냈음
            socket.shutdownOutput(); // 전송 끝을 서버에 알림
            //서버측에서 바이트를 다 받으면 메시지를 보내기로 함
            byte[] responseBuffer = new byte[1024];
            int responseLength = in.read(responseBuffer);
            String response = new String(responseBuffer,0,responseLength);
            System.out.println("서버측 응답:"+response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//uploadFile
    private void cleanup() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//
    //실행의 흐름
    public void fileSendRun() {
        try {
            connectToServer();
            setupStreams();
            uploadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            cleanup();
        }
    }//
    public static void main(String[] args) {
        SimpleFileClient fileClient = new SimpleFileClient("조충희");
        fileClient.fileSendRun();
    }//main
}//class
