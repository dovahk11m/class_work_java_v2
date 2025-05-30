package ch02;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/** 5.28 */
public class MyFileIOSystem2 {

    public static void main(String[] args) {

        int readData;
        String data = "in a galaxy far far away\n";
        byte[] dataBytes = data.getBytes();

        try(FileInputStream fis = new FileInputStream("my1.txt");
            FileOutputStream fos = new FileOutputStream("my2.txt", true)) {

            while((readData = fis.read()) != -1 ) {
                fos.write(readData);
            }
            fos.write(dataBytes);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }//try-catch

    }//main
}//class
