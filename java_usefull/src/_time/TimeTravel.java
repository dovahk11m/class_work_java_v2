package _time;
import java.time.LocalDate; //날짜만 다루는 클래스
import java.time.LocalDateTime; //날짜와 시간을 함께 다루는 클래스
/**
 5.14
 Time 패키지의 클래스들 활용
 */
public class TimeTravel {
    public static void main(String[] args) {

        //현재 날짜를 가져옴
        //LocalDate today = new LocalDate();
        LocalDate today = LocalDate.now();
        System.out.println("오늘날짜"+today);

        //현재 날짜와 시간을 가져오자
        LocalDateTime now = LocalDateTime.now();
        System.out.println("오늘일시"+now);

    }//main
}//class
