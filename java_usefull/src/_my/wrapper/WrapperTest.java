package _my.wrapper;

import java.util.ArrayList;

public class WrapperTest {
    public static void main(String[] args) {

        //박싱
        int num = 10;
        Integer wrapNum = Integer.valueOf(num);
//        System.out.println(wrapNum.toString());
        System.out.println("박싱:"+wrapNum);
        //언박싱
        Integer wrapNum2 = Integer.valueOf(20);
        int num2 = wrapNum2.intValue();
        System.out.println("언박싱:"+num2);
        //자동박싱
        Integer autoBox = 30;
        System.out.println("자동박싱:"+autoBox);
        //자동언박싱
//        int autoUnbox = autoBox.intValue();
        int autoUnbox = autoBox;
        System.out.println("자동언박싱:"+autoUnbox);
        System.out.println();

        //double
        double d1 = 1.234;
        Double dw1 = Double.valueOf(d1);
        System.out.println("박싱:"+dw1);
        Double dw2 = Double.valueOf(4.321);
        double d2 = dw2.doubleValue();
        System.out.println("언박싱:"+d2);
        Double dw3 = 3.333;
        System.out.println("자동박싱:"+dw3);
        double d3 = dw3;
        System.out.println("자동언박싱:"+d3);
        System.out.println();

        //String => 기본데이터
        String strI = "10";
        int newI = Integer.parseInt(strI);
        System.out.println("정수로:"+newI);

        String strD = "1.234";
        double newD = Double.parseDouble(strD);
        System.out.println("실수로:" + newD);

        String strB = "true";
        boolean newB = Boolean.parseBoolean(strB);
        System.out.println("논리로:"+newB);
        System.out.println();

        //기본데이터 => String
        int value1 = 10;
        String strV1 = String.valueOf(value1);
        System.out.println("int => String:"+strV1);

        Float value2 = 1.234F;
        String strV2 = String.valueOf(value2);
        System.out.println("Float => String:"+strV2);

        Long value3 = 1000L;
        String strV3 = String.valueOf(value3);
        System.out.println("Long => String:"+strV3);
        System.out.println();

        //컬렉션 프레임워크
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.size());
        int sum = numbers.getFirst() + numbers.get(1) + numbers.getLast();
        System.out.println(sum);


    }//main
}//class
