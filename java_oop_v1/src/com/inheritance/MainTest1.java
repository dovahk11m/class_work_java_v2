package com.inheritance;

public class MainTest1 {
    //main
    public static void main(String[] args) {
        //Cal 클래스와 ChildCal의 관계는 부모자식관계다
        ChildCal childCal1 = new ChildCal();
        int sum1 = childCal1.sum(10, 10); // Cal 클래스에서 호출
        System.out.println("sum1 = " + sum1);

        int minus1 = childCal1.minus(100, 10); // ChildCal 클래스에서 호출
        System.out.println("minus1 = " +minus1);

        int multiply1 = childCal1.multiply(10, 0); // 메서드 오버라이드
        System.out.println("multiply1 = " +multiply1);

        /*
        부모 클래스의 메서드를 자식 클래스에서 수정했다면
        메서드 오버라이드라고 한다.

        상속 관계에 있어
        부모 클래스가 먼저 존재해야
        자식 클래스가 존재할 수 있다.
         */

    }//end of main
}//end of class
