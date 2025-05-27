package _time;
import java.time.LocalDate;
/**
 5.14
 요일
 */
public class BirthdayDayOfWeek {
    public static void main(String[] args) {

        //2000년 5월13일이 무슨 요일일까?
        LocalDate birthday = LocalDate.of(2000, 5, 13);
        System.out.println("00-05-13요일"+birthday.getDayOfWeek());

    }//main
}//class
