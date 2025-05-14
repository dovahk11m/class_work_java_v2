package _time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 5.14
 날짜 표시 방법 변경하기
 */
public class KoreanDateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재일시"+now);
        //2025-05-14T10:02:13
        /*
        이걸 한국식 날짜포맷으로 바꿀 수는 없을까?

        2025년 05월 14일 12시 00분
        이런 식으로 패턴을 지정할 수 있다.

        yyyy 4자리 년
        mm 2자리 월
        dd 2자리 일
        hh 2자리 시간
        mm 2자리 분

        DateTimeFormatter
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월dd일 HH시mm분");
        now.format(dtf);
        //내가 정의한 포맷으로 현재 시간을 표시해준다.
        System.out.println("현재일시" + now.format(dtf));

    }//main
}//class