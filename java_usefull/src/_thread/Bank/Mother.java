package _thread.Bank;
/**
 * 4.25 쓰레드 3강
 *
 * 각 쓰레드가 공유하는 자원 만들어보기
 */
public class Mother extends Thread{

    BankAccount bankAccount; //연관관계

    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        //계좌에 출금요청
        bankAccount.withdraw(5_000);
    }
}//end of class Mother
