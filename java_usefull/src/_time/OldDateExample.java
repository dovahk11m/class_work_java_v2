package _time;
import java.util.Calendar;
import java.util.Date;
/**
 5.14
 java.time
 시간과 관련된 클래스들

 java1.1때 만들어진 Date, Calendar 클래스는
 여러 문제점을 안고 있다.

 java8에서 새로운 클래스들이 만들어졌다.
 */
public class OldDateExample {
    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("현재시간" + now);

        //Calendar cal = new Calendar(); //new 못때리게 개발자가 막아놨다.
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,14); //0부터 시작(4= 5월)
        System.out.println("설정날짜"+ cal.getTime());

    }//main
}//class
