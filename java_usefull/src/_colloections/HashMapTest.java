package _colloections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 5.7
 컬렉션프레임워크3
 Set 계열
 */
public class HashMapTest {

    //main
    public static void main(String[] args) {

        //계층 구조 확인
        Map<String, String> map;

        //Map 계열 자료 구조 객체 선언과 동시에 초기화
        Map<String, String> books = new HashMap<>();

        //CRUD

        //데이터 추가
        books.put("해리포터", "JK롤링");
        books.put("반지의제왕", "JRR톨킨");
        books.put("1984", "조지오웰");

        //데이터 조회: 특정 키 값으로 밸류 읽기
        String value1 = books.get("해리포터");
        System.out.println("value1: "+value1); //JK롤링
        String value2 = books.get("해리포터1");
        System.out.println("value2: "+value2); //null
        System.out.println();
        //없는 키 값을 요청하면 null 값을 반환한다.

        //데이터 수정
        books.put("1984", "업데이트됨");
        System.out.println(books.get("1984")); //업데이트됨
        System.out.println();

        //데이터 삭제
        books.remove("반지의제왕");
        System.out.println(books.get("반지의제왕")); //null
        System.out.println();

        //size 확인
        System.out.println("Map size(): "+books.size()); //2
        System.out.println();

        //특정 키값을 확인하는 메서드
        System.out.println("keySet: "+books.keySet()); //1984, 해리포터
        System.out.println("values: "+books.values()); //없, JK롤링
        System.out.println();

        //향상된 for 구문
        for (String key : books.keySet()) {
            System.out.print("key:"+key);
            System.out.println(", value:"+books.get(key));
        }
        System.out.println();

        //Iterator 통해 순회 (옛날스타일)
        Iterator<Map.Entry<String, String>> iter = books.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String > entry = iter.next();
            System.out.println("key:"+ entry.getKey() + ", value:" + entry.getValue());
        }
        System.out.println("Map 크기:" + books.size()); //2
        System.out.println();

        //전체 삭제
        books.clear();
        System.out.println("삭제 후 크기:" + books.size()); //0

    }//main
}//class
