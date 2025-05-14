package _time;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculation {
    public static void main(String[] args) {

        //나이계산하기
        LocalDate birth = LocalDate.of(2000, 5, 13);
        LocalDate today = LocalDate.now();

        //기간계산
        Period age = Period.between(birth, today);

        //나이를 연도 단위로 추출
        System.out.println("나이는" + age.getYears());

    }//main
}//class
