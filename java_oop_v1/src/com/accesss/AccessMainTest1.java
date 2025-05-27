package com.accesss;
public class AccessMainTest1 {
    //main
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(10000);
        acc1.withdraw(6000);
        acc1.showInfo();

        /*
        접근 제어 지시자 Access Modifier

        왜 사용하는가?

        만약 후임개발자가
        실수로 메서드를 통해 코드를 작성하지 않고
        바로 멤버변수에 접근해서 수정하는 코드를 작성했다면?

        실수할 수 있는 가능성이 있다.

        만약 balance 변수에 대한 외부접근을 차단한다면?
        외부에서는 오직 deposit, withdraw 메서드로만 접근 가능

        이를 캡슐화 라고 한다.
         */
        // acc1.balance = 10000; // 입금을 했다고 착각
        // acc1.showInfo();

        //getter 메서드 사용
        int outerBalancer = acc1.getBalance();
        System.out.println("현재 잔액은 " + outerBalancer + "입니다.");
        System.out.println(acc1.getName());
        // 멤버 변수 값을 초기화하지 않으면 String null로 초기화된다.

        //setter 메서드 사용
        acc1.setBalance(10);
        acc1.showInfo();
    }//end of main
}//end of class
