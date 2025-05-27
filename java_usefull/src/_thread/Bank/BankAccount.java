package _thread.Bank;
/**
 * 4.25 쓰레드 3강
 *
 * 각 쓰레드가 공유하는 자원 만들어보기
 */
public class BankAccount {

    //
    int money = 100_000; //초기 잔액

    //getter
    public int getMoney() {
        return money;
    }

    //setter
    public void setMoney(int money) {
        this.money = money;
    }

    //method - 입금
    public synchronized void deposit(int money) {
        int currentMoney = getMoney();

        synchronized (this) {//동기화 블록 처리

        try {//예외처리
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        this.money += money;
        setMoney(currentMoney + money);
        System.out.println("입금후잔액: " + getMoney());

        }//동기화 블록 처리

    }//end of method - 입금

    //method - 출금
    public synchronized int withdraw(int money) {
        int currentMoney = getMoney();

        try {//예외처리
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //방어적 코드
        if (currentMoney < money) {
            System.out.println("잔액 부족");
            return 0;
        } else {
            setMoney(currentMoney - money);
            System.out.println("출금후잔액: " + getMoney());
            return 0;
        }

    }//end of method - 출금

}//end of class
