package ch04;

import java.io.*;

/* 5.30 */
public class CharBufferedKeyboardConsole {

    public static void main(String[] args) {

        /* InputStreamReader 는 System.in(InputStream) 을 기반으로 한다.
        BufferedReader 는 InputStreamReader 를 래핑 wrap 해서 사용한다.

         기능의 확장!
         상속(수직적)과는 달리 수평적으로 확장되고 있다.
         이런 구조를 데코레이션 패턴이라고 한다. */

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter(System.out);
             BufferedWriter bw = new BufferedWriter(pw)) {

            System.out.println("텍스트를 입력하세요(종료 빈줄 입력)");

            /* readLine() 메서드는 문자열의 한 줄을 그대로 읽는다
            null 은 입력의 끝을 의미한다
            혹시 인텔리제이에서 종료가 안될때는
            Ctr D 또는 Ctr Z를 누르면 된다. */

            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                bw.write(line.replace("자바","java"));
                bw.newLine();
                bw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("스트림 사용중 오류 발생:" + e.getMessage());
        }

    }//main
}//class
