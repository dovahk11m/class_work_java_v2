package _thread;
/**
 * 4.25
 * 쓰레드 2강
 * <p>
 * 1.상속을 활용해서 쓰레드 만들기 (작업자 만들기)
 */
public class Worker extends Thread {

    private String name;

    public Worker(String name) {
        this.name = name;
    }
    /*
    서브 작업자가 해야 할 일은
    run() 메서드 안에 정의한다.

    그리고 start 메서드를 통해서 쓰레드한테 일을 시작하도록 명령한다.
    그러면 다른 쓰레드가 run()에 정의된 일을 수행한다.
     */

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("worker" + name + ": " + i);

            try {
                Thread.sleep(1000); // 1000millis = 1초 쉬어라

            } catch (InterruptedException e1) {
                System.out.println("외부신호에 따른 예외발생");
                e1.printStackTrace(); //예외가 발생한 부분을 좀 더 상세히 출력

            }
        }
    }

}//end of class Worker
