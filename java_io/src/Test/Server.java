package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

    private static final int PORT = 5000;
    private static Vector<PrintWriter> printWriterVector = new Vector<>();
    public static int connectedCounter;

    public static class ClientHandler extends Thread {
        private Socket socket;
        BufferedReader in;
        PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                printWriterVector.add(out);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("수신:" + message);

                    for (PrintWriter writer : printWriterVector) {
                            writer.println("방송:" + message);
                    }
                }//while

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("소켓 연결중 오류 발생");
            } finally {
                try {
                    if (socket != null) socket.close();
                    printWriterVector.remove(out);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("소켓 자원해제중 오류 발생");
                }
            }//tcf
        }//run
    }//ClientHandler

    public static void main(String[] args) {
        System.out.println("== 서버 시작 ==");

        try (ServerSocket serverSocket = new ServerSocket(PORT)){

            while (true) {
                new ClientHandler(serverSocket.accept()).start();
                connectedCounter++;
                System.out.println("클라이언트 연결됨"+connectedCounter);
            }//while

        } catch (IOException e) {
            e.printStackTrace();
        }//twr
    }//main
}//class
