package _colloections;

import java.util.ArrayList;
import java.util.List; //리스트 호출

/**
 5.2
 컬렉션 프레임워크
 리스트 계열

 리스트와 배열의 차이를 이해한다.
 리스트의 좋은 기능들을 익힌다.

 참조변수라는 특징에 주의한다.
 */
public class MyArrayListTest {

    //메인
    public static void main(String[] args) {

        //리스트 인터페이스
        List mList;

        int[] arrayInt = new int[10]; //배열
        ArrayList<Integer> list = new ArrayList(); //리스트

        /*
        <T> 제네릭
        추후 배우게 된다.

        Integer(참조 타입), int(기본 데이터 타입)
        Integer - wrap 클래스
        int 데이터 타입을 클래스로 설계해둔 데이터 타입이다.

        ArrayList<Integer> list
        정수값을 하나의 변수에 저장하는
        리스트 계열의 자료구조를 생성했다.
         */

        //1. 값을 추가하는 방법 비교
        arrayInt[0] = 100;

        list.add(100);
        list.add(null); // [100, null]
        list.add(200); // [100, null, 200]

        //2. 값 꺼내기
        System.out.println("배열 0번:" + arrayInt[0]);
        System.out.println("리스트 0번:" + list.get(0));
        System.out.println();

        //3. 값 삭제
        list.remove(1); // [100, 200]
        System.out.println("1번(2번째) 삭제 후 리스트:" + list);

        //4. 인덱스 번호로 값 추가하기
        list.add(1, 1000); // [100, 1000]
        System.out.println("추가한 뒤 리스트:" + list);

        //5. 수정 = 삭제처리 후 삽입
        list.remove(2);
//        list.remove(200); 오류
        //Object 값으로 삭제 할 수 있다.
        System.out.println("2번(3번째) 삭제처리 후 리스트:" + list);

        //6. 전체 삭제
        list.clear(); // [ .. ]
        System.out.println("전체삭제 후 리스트:" + list);
        System.out.println();

        //7. 리스트 사이즈
        System.out.println("배열 사이즈:" + arrayInt.length);
        System.out.println("리스트 사이즈:" + list.size());
        System.out.println();

        //nums 참조변수에 list 참조변수의 주소값을 대입시켰다.
        System.out.println("리스트 초기값:" + list);

        //주소값을 복사한 것이다. (얕은 복사 개념)
        ArrayList nums = list;

        System.out.println("새로 선언한 nums에 값을 추가했다");
        nums.add(10);
        nums.add(500); // [10, 500]

        //nums 변수에 숫자를 넣었는데 왜 list에 뜨지?
        //둘다 하나의 객체를 바라보고 있다.
        System.out.println("리스트 전체:" + list);
        System.out.println("넘스 전체:" + nums);
        System.out.println();

        //for문을 돌리지 않아도 자료를 찾을 수 있다.
        System.out.println("넘스에 10이 존재하나:"+nums.contains(10));
        System.out.println("10의 인덱스값 확인:"+nums.indexOf(10));
        System.out.println("500의 인덱스값 확인:"+nums.indexOf(500));

        for (int i = 0; i < nums.size(); i++) {

            //nums[i] <= 배열의 방식
            System.out.println(nums.get(i));
        }

    }//end of main
}//end of class
