package ch01;
public class BankAccount {

    private int balance;

    private BankAccount(int balance) {
        this.balance = balance;
    }

    private void transfer(int amount, BankAccount target) {
        this.balance -= amount;
        target.balance += amount;
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(10000);
        BankAccount a2 = new BankAccount(0);

        a1.transfer(5000, a2);

        System.out.println(a1.balance);
        System.out.println(a2.balance);

    }//main
}//class