package _thread;
/**
 * 4.25
 * 쓰레드 2강
 * <p>
 * 2.인터페이스를 이용해 쓰레드 만들기 (작업자 만들기)
 */
public class Worker2MainTest {

    //main thread
    public static void main(String[] args) {

        // 상속을 통한 쓰레드 생성
//        Worker worker1 = new Worker("워커");
//        worker1.start();

        //사용하는 방법
        System.out.println("========== 메인 쓰레드 시작 ==========");
        //현재 쓰레드가 누구인가
        System.out.println(Thread.currentThread());

        // 인터페이스를 활용해서 쓰레드를 start() 시키는 방법
        Worker2 worker2 = new Worker2();
//        worker2.start();
        /*인터페이스를 사용했을 때
        start() 메서드가 없어서 동작을 시키지 못한다.
         */

        Thread subT1 = new Thread(worker2);
        subT1.start();
        System.out.println("========== 메인 쓰레드 종료 ==========");

    }//end of main
}//end of class
