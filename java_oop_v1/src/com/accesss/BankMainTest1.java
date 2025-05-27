package com.accesss;

public class BankMainTest1 {
    //main
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        //bank1.number // private - 외부 접근 불가
        bank1.balance = 1000; // default - 동일 패키지 접근 가능
    }
} // end of class
