package _Inner;
/**
 * 4.25 inner 클래스 2강
 *
 * 지역 내부 클래스
 * Local Inner Class
 *
 * 메서드 안에서 생성됐다가
 * 메서드 호출이 끝나면 사라진다.
 */
public class OuterClass2 {

    public void display() {

        //지역 내부 클래스
        class LocalInnerClass {

            void printMessage() {
                System.out.println("지역 내부 클래스의 메서드 호출");
            }

        }//end of class

        /*
        LocalInnerClass 생성
        display() 메서드가 호출됐을 때 생성됐다고
        메서드 호출이 끝나면 사라진다.

         */
        LocalInnerClass inner = new LocalInnerClass();
        inner.printMessage();

    }//end of method display()

    //main
    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.display(); //지역 내부클래스의 메서드 호출

    }//end of main

}//end of class OuterClass2
