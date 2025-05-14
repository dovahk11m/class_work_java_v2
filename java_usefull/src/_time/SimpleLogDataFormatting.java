package _time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class SimpleLogDataFormatting {
    public static void main(String[] args) {

        //포매팅된 날짜를 출력해보기
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/M.d/H:m");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime morning = now.minusMinutes(340);
        System.out.println("340분전: "+morning.format(dtf));

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("한국시간: "+LocalDateTime.now().format(dtf));
        System.out.println("뉴욕시간: "+zdt.format(dtf));

    }//main
}//class
