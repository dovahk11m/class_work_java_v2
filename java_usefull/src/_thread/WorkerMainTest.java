package _thread;
/**
 * 4.25
 * 쓰레드 2강
 * <p>
 * 1.상속을 활용해서 쓰레드 만들기 (작업자 만들기)
 */
public class WorkerMainTest {
    //main thread - 일을 도맡아 하는 녀석
    public static void main(String[] args) {
        //사용하는 방법
        System.out.println("========== 메인 쓰레드 시작 ==========");

        //현재 쓰레드가 누구인가
        System.out.println(Thread.currentThread());

        //작업자 subthread 하나 만들기
        Worker worker = new Worker("워커1");
        worker.start(); //worker가 위임받은 작업을 시작하라는 명령어

        System.out.println("========== 메인 쓰레드 종료 ==========");


    }//end of main
}//end of class
