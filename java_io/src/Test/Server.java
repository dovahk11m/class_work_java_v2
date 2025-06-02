package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        //서버소켓, 출력, 입력, 송신, 수신

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(5000);

            Socket clientSocket = serverSocket.accept();
            System.out.println("클라이언트 연결");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);

            writer.println("서버: 연결됨 반갑습니다");
            writer.flush();

            String message;
            while ((message = reader.readLine()) != null && !message.isEmpty()) {
                System.out.println("클라이언트:" + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }//tcf
    }//main
}//class
