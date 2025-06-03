package ch04;
import java.io.*;
public class StreamTest {
    public static void main(String[] args) {
        String destinationFilePath = "test.txt";
        System.out.println("문자열을 입력해주세요");
        try (
//             InputStreamReader isr = new InputStreamReader(System.in);
//             BufferedReader br = new BufferedReader(isr);
//             FileWriter writer = new FileWriter(destinationFilePath, true);
//             BufferedWriter bw = new BufferedWriter(writer)

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFilePath, true))
        ) {
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                bw.write(line);
                bw.newLine();
            }//while
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//try-catch
    }//main
}//class
