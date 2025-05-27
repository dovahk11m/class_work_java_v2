package com.accesss;
public class Account {
    //속성
    private String name;
    private int balance; // 2단계
    //생성자
    //메서드 - 입금하다, 출금하다, 잔액출력
    public void deposit(int dmoney) { // 입금하다
        balance += dmoney;
        System.out.println(dmoney +"원 입금했습니다. 현재 잔액은 " + balance + "원 입니다.");
    }
    public void withdraw(int wmoney) { // 출금하다
        // TODO 방어적 코드 작성한다
        if (wmoney > balance) {
            System.out.println("잔액이 부족합니다. 현재 잔액은" + balance + "입니다.");
        } else {
            balance -= wmoney;
            System.out.println(wmoney +"원 출금했습니다. 현재 잔액은 " + balance + "입니다.");
        }
    }
    public void showInfo() { // 잔액출력
        System.out.println("현재 잔액은 " + balance + "입니다.");
    }
    /*
    외부에서 balance 값을 받을 수 있는 메서드가 필요하다.

    getter, setter 메서드

    getter
    변수 앞에 get이라는 단어를 붙인다.
    매개변수는 선언하지 않아도 된다.
     */
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    /*
    setter 메서드 만들기

    방어적 코드를 작성할 수 있다.
    setter 메서드를 만들지 않는다면 접근 자체를 할 수 없다.
     */
    public void setBalance(int setBal) {
        if (setBal < 0) {
            System.out.println("0 이하 값은 넣을 수 없습니다");
        } else {
            System.out.println("잔액을 " +setBal+ "원으로 조정했습니다.");
            balance = setBal;
        }
    }
    public void setName(String setNam) {
        name = setNam;
    }
}//end of class
