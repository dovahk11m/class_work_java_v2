package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

//소켓, 출력, 입력, 수신, 송신

        Socket socket = null;

        try {
            socket = new Socket("localhost", 5000);

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));

            String response = reader.readLine();
            System.out.println("서버:"+ response);

            String line;
            while ((line = keyReader.readLine()) != null && !line.isEmpty()) {
                System.out.println("클라이언트:" + line);
                writer.write(line + "\n");
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
