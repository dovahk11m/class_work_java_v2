package Test;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Random;

public class LottoBytes03 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        String filePath = "test.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            for (int i = 0; i < lotto.length; ) {
                int num = random.nextInt(45) + 1;
                boolean isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (lotto[j] == num) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    lotto[i] = num;
                    i++;
                }
            }
            Arrays.sort(lotto);

            System.out.print("로또 번호: ");
            for (int num : lotto) {
                fos.write((num + " ").getBytes());
                System.out.print(num + " ");
            }
            fos.write("\n".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
}//class
