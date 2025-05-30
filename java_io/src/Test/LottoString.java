package Test;

import java.io.*;
import java.util.Random; // 랜덤

public class LottoString {

    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];
        String lottoStr;


        String destinationFilePath = "test.txt";

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
        }

        try (BufferedWriter bw = new BufferedWriter(new PrintWriter(destinationFilePath));
        ) {

            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }

                bw.write(String.valueOf(lotto[i])+ " ");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//try-catch

    }//end of main
}//end of class

