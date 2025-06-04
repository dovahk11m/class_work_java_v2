package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private final String name;
    private Socket socket;
    private PrintWriter writerStream;
    private BufferedReader readerStream;
    private BufferedReader keyboardStream;

    public Client(String name) {
        this.name = name;
    }

    private void connectToServer() throws IOException {
        socket = new Socket("localhost", 5000);
        System.out.println("## 서버연결 ###");
    }

    private void setupStream() throws IOException {
        writerStream = new PrintWriter(socket.getOutputStream(), true);
        readerStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private Thread createRead() {
        return new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = readerStream.readLine()) != null) {
                    System.out.println("서버:"+serverMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } );
    }

    private Thread createWrite() {
        return new Thread(() -> {
            try {
                String keyboardMessage;
                while ((keyboardMessage = keyboardStream.readLine()) != null) {
                    writerStream.println("["+name+"]"+ keyboardMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } );
    }

    private void cleanUp() {
        try {
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startCommunication() throws InterruptedException {
        Thread readThread = createRead();
        Thread wirteThread = createWrite();

        readThread.start();
        wirteThread.start();

        readThread.join();
        wirteThread.join();
    }

    public void chatRun() {
        try {
            connectToServer();
            setupStream();
            startCommunication();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
            cleanUp();
        }
    }

    public static void main(String[] args) {

        System.out.println("## 클라이언트 시작 ##");
        Client client = new Client("조충희");
        client.chatRun();

    }//main
}//class
