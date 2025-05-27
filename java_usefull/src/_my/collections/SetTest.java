package _my.collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 5.7
 컬렉션프레임워크2
 Set 계열
 */
public class SetTest {

    //main
    public static void main(String[] args) {

//        Set<Integer> setTest = new HashSet<>();

        HashSet<Integer> numTest = new HashSet<>();

        numTest.add(111);
        numTest.add(111);
        numTest.add(222);
        numTest.add(333);
        numTest.add(444);

        System.out.println("추가 후 요소 크기: " + numTest.size());
        System.out.println();

        numTest.remove(111);
        System.out.println("삭제 후 요소 크기: " + numTest.size());
        System.out.println();

        for (Integer num : numTest) {
            System.out.println("num 확인" + num);
        }
        System.out.println();

        Iterator<Integer> iterator = numTest.iterator();

        while (iterator.hasNext()) {
            System.out.println("값:" + iterator.next());
        }
        System.out.println();






    }//main

}//SetTest
