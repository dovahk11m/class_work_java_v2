package Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class LottoFunction {

    static void LottoWrite() {

        Random random = new Random();
        String destinationFilePath = "test.txt";
        int[] lotto = new int[6];

        try (FileOutputStream fos = new FileOutputStream(destinationFilePath, true)) {

            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (random.nextInt(45) + 1);
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }

                fos.write((String.valueOf(lotto[i]) + " ").getBytes());


            }
            fos.write(("\n").getBytes());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }//try-catch

    }

}//class
