package _thread.Bank;
/**
 * 4.25 쓰레드 3강
 *
 * 각 쓰레드가 공유하는 자원 만들어보기
 */
public class Father extends Thread { //쓰레드 상속

    //prop
    BankAccount bankAccount; //연관관계

    //cons
    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    //method - run override

    @Override
    public void run() {
        //계좌에 입금요청
        bankAccount.deposit(10_000);

    }

}//end of class Father
