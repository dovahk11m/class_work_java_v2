package _thread;
/**
 * 4.25
 * 쓰레드 2강
 * <p>
 * 2.인터페이스를 이용해 쓰레드 만들기 (작업자 만들기)
 */
public class Worker2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

}//end of class
