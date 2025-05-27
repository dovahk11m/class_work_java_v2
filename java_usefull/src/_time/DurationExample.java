package _time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 5.14
 Duration
 시간차이를 계산할 때 사용한다.
 */
public class DurationExample {
    public static void main(String[] args) {

        LocalTime start = LocalTime.of(9, 0); //오전 9시
        LocalTime end = LocalTime.of(11, 30); //오전 11:30

        Duration dr = Duration.between(start, end);
        System.out.println("시차는" + dr.toHours()+"시간");
        System.out.println("시차는" + dr.toMinutes()+"분");
        System.out.println("시차는" + dr.toSeconds()+"초");

        LocalDate election = LocalDate.of(2025, 6, 3);
        System.out.println(election.getDayOfWeek());
    }//main
}//class
