package _my.thread;
/**
 * 쓰레드 인터페이스 연습
 */
public class Worker2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.println(i + "\t");
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

    //main thread
    public static void main(String[] args) {

        Worker2 worker2 = new Worker2();

        Thread subThread2 = new Thread(worker2);

        subThread2.start();

    }//end of main
}//end of class
