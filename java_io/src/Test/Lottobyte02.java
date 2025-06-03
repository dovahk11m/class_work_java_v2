package Test;
import java.io.FileOutputStream;
import java.util.*;

public class Lottobyte02 {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<>();
        String filePath = "test.txt";
        Random random = new Random();
        try (FileOutputStream fos = new FileOutputStream(filePath)){
            while (lotto.size() < 6) {
                int num = random.nextInt(45) + 1;
                lotto.add(num);
            }
            List<Integer> sortedLotto = new ArrayList<>(lotto);
            Collections.sort(sortedLotto);
            for (int number : sortedLotto) {
                fos.write((number + " ").getBytes());
            }
            fos.write("\n".getBytes());
            System.out.println(sortedLotto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//main
}//class
