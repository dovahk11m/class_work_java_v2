package _Inner;
/**
 * 4.25 inner 클래스 1강
 *
 * 멤버 내부 클래스
 */
public class OuterClass {

    private int num1 =10;
    /*
    inner 클래스란
    클래스 속 클래스다.

    멤버 내부 클래스를 만들어보자
     */
    class InnerClass {

        public void display() {
            System.out.println("inner class display() 호출" + num1);
            //외부 클래스에 있는 변수 호출
        }

    }//end of inner class

    //main thread
    public static void main(String[] args) {
//        InnerClass = innerClass = new InnerClass();
        //이너클래스를 그냥 메모리에 올릴 수는 없다.

        OuterClass OuterClass = new OuterClass();
        OuterClass.InnerClass innerClass = OuterClass.new InnerClass();

        innerClass.display();

    }//end of main
}//end of outter class
