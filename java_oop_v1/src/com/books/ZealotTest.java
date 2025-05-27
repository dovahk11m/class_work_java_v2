package com.books;
import com.starcraft.v01.UnitZealot; // stracraft_v01패키지의 UnitZealot 클래스를 호출했다.
/**
 * 4.18 4강 질럿테스트
 * 참조데이터를 담은 배열을 만들어보자
 * 다른 패키지의 클래스를 호출해보자
 */
public class ZealotTest {
    //main
    public static void main(String[] args) {
        UnitZealot[] zealots = new UnitZealot[5]; // 퍼블릭 클래스라서 다른 패키지에서 호출 가능

        //반복문 사용하지 말고 질럿 3마리 0, 1, 3

        zealots[0] = new UnitZealot("질럿1");
        zealots[1] = new UnitZealot("질럿2");
        zealots[3] = new UnitZealot("질럿4");

        //0 번째 인덱스에 주소값을 넣어둔 질럿의 기능 showInfo를 호출하시오

        System.out.print("질럿1상태: ");
        zealots[0].showInfo();

        //반복문을 활용해 배열 안에 있는 질럿들에 showInfo를 호출하시오

        for (int i = 0; i < zealots.length; i++) {
            // TODO 방어적 코드 작성(null point exception)
            if (zealots[i] != null) {
                System.out.print("⭐질럿" + (i + 1) + "상태: ");
                zealots[i].showInfo();

//                System.out.println(zealots[i].showInfo()); // 컴파일 에러 발생
                // sout 안에 void 값을 넣을 수 없다
                // sout 안에 sout을 또 넣을 수 없다.

            }//end of if
        }//end of for
    }//end of main
}//end of class
