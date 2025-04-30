package com.static1;
    // 번호표 코드 실행측
public class PrinterTest1 {
    //main
    public static void main(String[] args) {

        int a = 10;
//        static int b = 20;
        /*
        static 변수는 태양이다

        순서가 있다.
        프로그램을 실행시키면

        static의 저장영역은 먼저 활성화된다.
         */


        NumberPrinter n1 = new NumberPrinter(1);
        NumberPrinter n2 = new NumberPrinter(2);

        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();
        n2.printWaitNumber();
    }//end of main
}//end of class
