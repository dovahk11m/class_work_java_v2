package _colloections;
import java.util.*;
/**
 5.7
 컬렉션프레임워크2
 Set 계열
 */
public class MySetTest {

    //main
    public static void main(String[] args) {

        //계층 구조 확인
        Set<Integer> mTestSet = new HashSet<>(); // 업캐스팅된 상태

        //사용방법
        /*
        해시셋
        HashSet
        중복된 요소를 허용하지 않고
        순서가 없는 자료구조다.
         */
        HashSet<Integer> numberSet = new HashSet<>();

        //요소 추가하기.. add
        numberSet.add(111);
        numberSet.add(111); // 중복값.. 추가되지 않는다.
        numberSet.add(222);
        numberSet.add(333);
        numberSet.add(444);

        System.out.println("추가후 요소크기:" + numberSet.size()); //4개

        //요소 제거하기.. remove
        numberSet.remove(1);
        /*
        1이라는 요소 자체를 삭제
        존재하지 않는 요소를 삭제해도 오류 발생 없다.
         */
        System.out.println("삭제후 요소크기:" + numberSet.size()); //4개
        System.out.println("===== ===== ===== ===== ");
        /*
        자료구조는 반복문과 함께 많이 사용된다.
        하지만 index 번호가 없으므로
        기존의 for 문은 사용할 수 없다.
        for (int i = 0; i < 10 ; i++) {}

        향상된 for문을 활용해야 한다.
        이를 통해 Set 요소를 순회시킬 수 있다.
         */
        for (Integer num : numberSet) {
            System.out.println("num 값:" + num);
        }
        System.out.println("===== ===== ===== ===== ");
        /*
        Set 계열을
        Iterator 타입으로 변환해서 순회시킬 수도 있다.
        다만 Iterator도 인덱스 개념이 없는데...
         */
        Iterator<Integer> iter = numberSet.iterator(); // Set 계열을 Iterator 계열로 형 변환

        while (iter.hasNext()) { // hasNest : 다음 요소가 있으면 true 반환
            System.out.println("값:" + iter.next());
        }
        System.out.println("===== ===== ===== ===== ");

        /*
        Set 계열 자료구조 선언
        정수값만 담을 수 있고 중복 불가
         */
        HashSet<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size()<6) {
            lottoNumbers.add(getRandomNumber()); //로또함수호출
        }
        System.out.println("무작위로 선택된 로또번호 6개 "+ lottoNumbers.toString());
        System.out.println("===== ===== ===== ===== ");

        /*
        HashSet 데이터 타입을
        ArrayList 객체 생성시..
        즉, 생성자에 인자값을 넣을 수 있도록 설계

        List자료구조에서는 정렬이 편해진다.
         */
        ArrayList<Integer> sortedList = new ArrayList<>(lottoNumbers);

        Collections.sort(sortedList); //정렬하기

        System.out.println("정렬된 로또번호 6개 " + sortedList);
        System.out.println("===== ===== ===== ===== ");

    }//end of main

    //무작위 1부터 45까지 랜덤번호 생성 함수
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }

}//end of class
