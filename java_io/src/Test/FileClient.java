package Test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

    private static final String IP = "localhost";
    private static final int PORT = 5000;
    private final String name;
    private final Scanner scanner = new Scanner(System.in);

    public FileClient(String name) {
        this.name = name;
    }

    public void run() {
        try (Socket socket = new Socket(IP, PORT);
             OutputStream out = socket.getOutputStream();
             InputStream in = socket.getInputStream()) {

            System.out.println("서버에 연결됨");

            System.out.println("보낼 파일 경로 입력:");
            String path = scanner.nextLine();
            File file = new File(path);

            if (!file.exists() || !file.isFile()) {
                System.out.println("파일이 존재하지 않음");
                return;
            }
            String fileName = file.getName();

            byte[] nameByte = fileName.getBytes();
            byte[] nameBuffer = new byte[100];

            System.arraycopy(nameByte, 0, nameBuffer, 0, nameByte.length);
            out.write(nameBuffer);
            out.flush();

            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[4096];
                int byteRead;
                while ((byteRead = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, byteRead);
                }
                out.flush();
                socket.shutdownOutput();

                byte[] responseBuffer = new byte[1024];
                int length = in.read(responseBuffer);
                String response = new String(responseBuffer, 0, length);
                System.out.println("서버 응답:" + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new FileClient("조충희").run();

    }//main
}//class
