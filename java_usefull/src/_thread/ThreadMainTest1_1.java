package _thread;
/**
 * 4.25
 * 쓰레드 Thread
 */
public class ThreadMainTest1_1 {

    //main thread
    public static void main(String[] args) {

        System.out.println("메인 함수 동작(메인 쓰레드)");
        System.out.println(Thread.currentThread());

        SubThread subThread1 = new SubThread();
        SubThread subThread2 = new SubThread();

        //run();
        //start(); 쓰레드를 시작해
        subThread1.start();
        subThread2.start();
        System.out.println("메인 함수 종료(메인 쓰레드)");


    }//end of main
}//end of class ThreadMainTest2

class SubThread extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            i ++;
            System.out.println(i + ": " + Thread.currentThread());
        }
    }
}//end of class Thread


