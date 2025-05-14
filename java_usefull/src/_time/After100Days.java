package _time;
import java.time.LocalDate;

public class After100Days {
    public static void main(String[] args) {

        //현재 날짜로부터 100일 후의 날짜는?
        LocalDate now = LocalDate.now();
        LocalDate after100 = now.plusDays(100);
        System.out.println("100일후"+after100);
    }//main
}//class
