package _thread;
/**
 * 4.25
 * 쓰레드 Thread
 */
public class ThreadMainTest1 {

    //메인 쓰레드 main thread
    public static void main(String[] args) {

        System.out.println("main thread 동작 start");
        MyThread thread1 = new MyThread();
        thread1.start();
//        thread1.run();
        System.out.println();

        System.out.println("main thread 동작 end");

    }//end of main
}//end of class ThreadMainTest1

/*
 쓰레드를 만드는 방법 1

 start() 메서드를 호출하면
 run() 안에 있는 구현부가 동작한다.
 */
class MyThread extends Thread {

    @Override
    public void run() {//run 재정의
        int i;
        for (i = 0; i < 11; i++) {
            System.out.printf(i + "\t");
        }
    }

}//end of class