package _thread.Bank;
/**
 * 4.25 쓰레드 3강
 *
 * 각 쓰레드가 공유하는 자원 만들어보기
 */
public class BankAccountMainTest {

    //main
    public static void main(String[] args) {

        //객체 생성
        BankAccount bankAccount = new BankAccount();
        Father father = new Father(bankAccount); // bankAccount 객체를 바라보고 있다.
        Mother mother = new Mother(bankAccount);

        //아빠가 입금을 요청하다
        father.start(); // 작업요청 3초 지연

        //엄마가 입금을 요청하다
        mother.start(); // 작업요청 0.5초 지연

        /*
        어떻게 될까?
        입금 출금을 동일한 계좌에서 처리한다.

        정상적인 상황이라면
        10만원 + 1만원 - 5천원 = 10만5천원으로 나와야 한다.

        💀단, 멀티스레딩 프로그램에서는
        race condition 상태가 걱정된다.

        동시에 같은 작업을 하면?
        임계영역에 걸린다

        🐶의도치 않은 결과를 야기할 수 있다.
         */

    }//end of main
}//end of class
