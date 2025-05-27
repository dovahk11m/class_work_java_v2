package _my.thread;
/**
 * 쓰레드 상속 연습
 */
public class Worker extends Thread{

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.print(i + "\t");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("예외발생");
                e.printStackTrace();
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    //main thread
    public static void main(String[] args) {

        System.out.println("메인쓰레드 시작");
        System.out.println(Thread.currentThread());
        Worker worker1 = new Worker("작업자1");
        worker1.start();
        System.out.println("메인쓰레드 시작");


    }//end of main
}//end of class
