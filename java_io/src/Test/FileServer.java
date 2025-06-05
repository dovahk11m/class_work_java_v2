package Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

    private static final int PORT = 5000;
    private static final String DIR = "UPloads/";

    public static class ClientHandler extends Thread {
        private Socket socket;
        private OutputStream out;
        private InputStream in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                in = socket.getInputStream();
                out = socket.getOutputStream();

                byte[] nameBuffer = new byte[100];
                in.read(nameBuffer);
                String fileName = new String(nameBuffer).trim();
                System.out.println("파일이름수신:" + fileName);

                File file = new File(DIR + fileName);
                FileOutputStream fos = new FileOutputStream(file);

                byte[] buffer = new byte[4096];

                int byteRead;
                while ((byteRead = in.read(buffer)) != -1) {
                    fos.write(buffer, 0, byteRead);
                    System.out.println(byteRead);
                }
                System.out.println("서버 컴퓨터에 파일 저장 완료");
                out.write("파일업로드완료:".getBytes());
                out.write(fileName.getBytes());
                out.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (socket != null) socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("서버시작");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                new ClientHandler(serverSocket.accept()).start();
                System.out.println("클라이언트 연결됨");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//main
}//class
