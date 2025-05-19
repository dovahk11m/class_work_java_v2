package _my.book;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class book {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        int orange = 127;
//        System.out.println(orange / 10);
//        System.out.println(orange % 10);
//
//        double mile = 1.609;
//        System.out.println(10 * mile);
//

//
//        System.out.println("마일을 입력하시오");
//        int result1 = scanner.nextInt();
//
//        System.out.println(result1 + "마일은 " + mile * result1 + "킬로미터 입니다");

//        System.out.println("x값을 입력하시오");
//        int intX = scanner.nextInt();
//        System.out.println("x값: " + intX );
//
//        System.out.println("y값을 입력하시오");
//        int intY = scanner.nextInt();
//        System.out.println("y값: " + intY );
//
//        System.out.println("두수의합: " + (intX + intY) );
//        System.out.println("두수의차: " + (intX - intY) );
//        System.out.println("두수의곱: " + intX * intY );
//        System.out.println("두수의평균: " + ((double)intX + intY)/2 );
//
//        if (intX > intY) {
//            System.out.println("더 큰 값: intX(" + intX + ")");
//        } else if (intX < intY) {
//            System.out.println("더 큰 값: intY(" + intY + ")");
//        } else {
//            System.out.println(intX +" & " +intY + "두 수가 같습니다");
//        }

//        boolean p = true;
//        boolean q = true;
//
//
//        System.out.println("P"+"\t\t"+"Q"+"\t\t"+"AND"+"\t\t"+"OR"+"\t\t"+"XOR");
//        System.out.println( p +"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q));
//        q=false;
//        System.out.println( p +"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q));
//        p=false; q=true;
//        System.out.println( p +"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q));
//        q=false;
//        System.out.println( p +"\t"+q+"\t"+(p&&q)+"\t"+(p||q)+"\t"+(p^q));

//        System.out.println("시간간격을 입력하시오");
//        int result = scanner.nextInt();
//
//        System.out.println(result * 340 + "미터");

//        System.out.println("드라이브 이름");
//        String drive = scanner.next();
//        System.out.println("디렉터리 이름");
//        String directory = scanner.next();
//        System.out.println("파일 이름");
//        String file = scanner.next();
//        System.out.println("확장자 이름");
//        String extension  = scanner.next();
//
//        System.out.println(drive + ":\\" + directory+ "\\" +file + "." + extension);
//        System.out.println("자바 프로그래머 여러분");
//        System.out.println("안녕하세요?");
//        int x = 1000; int y = 2000;
//        System.out.println(x +y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println((double) x / y);


//        System.out.println("상품가격");
//        int x = scanner.nextInt();
//        System.out.println("지불한금액");
//        int y = scanner.nextInt();
//
//        System.out.println("부가세: " + 0.1 * x);
//        System.out.println("잔돈: " + (y - x) );

//        double pi = 3.14;
//        double x = scanner.nextDouble();
//
//        System.out.println(Math.pow(x,3) * pi * 4 / 3);

//        int x, y, i, j;
//
//        int[] two = new int[20];
//
//        System.out.println("2진수 입력");
//
//        x = scanner.nextInt();
//        y = x;
//
//        for (i = 0; x != 0; i++ ) {
//            System.out.print(x + "를 2로 나눈 값의 나머지: ");
//            two[i] = x % 2;
//            x /= 2;
//            System.out.println(two[i] + " ");
//        }
//
//        System.out.println();
//        System.out.print(y + "의 2진수값은: ");
//
//        for (j = i - 1; j >= 0; j--) {
//            System.out.print(two[j]);
//        }

//        int x = scanner.nextInt();
//        int y0, y1, y2, y3, y4, y5, y6;
//
//        if ((x / Math.pow(2,6)) >= 1) {
//            y6 = 1;
//        } else y6 = 0;
//        if ((x / Math.pow(2,5)) >= 1) {
//            y5 = 1;
//        } else y5 = 0;
//        if ((x / Math.pow(2,4)) >= 1) {
//            y4 = 1;
//        } else y4 = 0;
//        if ((x / Math.pow(2,3)) >= 1) {
//            y3 = 1;
//        } else y3 = 0;
//        if ((x / Math.pow(2,2)) >= 1) {
//            y2 = 1;
//        } else y2 = 0;
//        if ((x / Math.pow(2,1)) >= 1) {
//            y1 = 1;
//        } else y1 = 0;
//        if ((x / Math.pow(2,0)) >= 1) {
//            y0 = 1;
//        } else y0 = 0;
//        System.out.print(y6);
//        System.out.print(y5);
//        System.out.print(y4);
//        System.out.print(y3);
//        System.out.print(y2);
//        System.out.print(y1);
//        System.out.print(y0);

//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        System.out.println(0.5 * x * Math.pow(y,2));

//        int x = scanner.nextInt();
//
//        if (x == 1) {
//            System.out.println("one");
//        } else {
//            System.out.println("other");
//        }

//        String x = scanner.next();
//
//        if (x.equals("*")) {
//            System.out.println(10 * 20);
//
//        }

//        for (int i = 1; i < 51; i++) {
//
//            if (((i / 10) == 3) && (i % 10 == 0)) {
//                System.out.print("짝\t");
//                System.out.println();
//            } else if ((i / 10) == 3) {
//                System.out.print("짝\t");
//            } else if (i % 10 == 0) {
//                System.out.print(i + "\t");
//                System.out.println();
//            } else if ((i % 10) % 3 == 0) {
//                System.out.print("짝\t");
//            } else {
//                System.out.print(i + "\t");
//            }
//        }

//        int i, sum = 0;
//
//        for (i = 1; i < 101; i++) {
//            if (i % 3 == 0 || i % 4 == 0) {
//                sum += i;
//            }
//        }
//
//        System.out.println(sum);

//        for (int i = 1; i < 7; i++) {
//            for (int j = 1; j < 7; j++) {
//                if (i + j == 6) {
//                    System.out.print("("+i+",");
//                    System.out.println(j+")");
//                }
//            }
//        }

//        int i,j;
//        boolean flag;
//
//        System.out.print("2~100 소수를 구하라: ");
//        for (i = 2; i < 101; i++) {
//            flag = true;
//            for (j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                }
//            }
//            if (flag == true) {
//                System.out.print(i + " ");
//            }
//        }

//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                if ((3 * i + 10 * j) == 100) {
//                    System.out.println("(" + i + "," + j + ")");
//                }
//            }
//        }

//        int a, b, c;
//
//        for (a = 1; a < 100; a++) {
//            for (b = 1; b < 100; b++) {
//                for (c = 1; c < 100; c++) {
//                    if (a * a + b * b == c * c) {
//                        System.out.println(a + "²+" + b + "²=" + c);
//                    }
//                }
//            }
//        }

//        int a, b, c, d;
//
//        d = scanner.nextInt();
//        b = 0; c = 1;
//
//        for (a = 0; a < d; a++) {
//
//            if (a % 2 == 0) {
//                System.out.print(b + ",");
//                b += c;
//            } else {
//                System.out.print(c + ",");
//                c += b;
//            }
//            /*
//            a:0, 출력b:0, b=1
//            a:1, 출력c:1, c=2
//            a:2, 출력b:1, b=3
//            a:3, 출력c:2, c=5
//            a:4, 출력b:3, b=8
//            a:5, 출력c:5, c=13
//             */
//        }

//        double[] doubles = {1.0, 2.0, 3.0, 4.0};
//        double sum = 0;
//        double max = 0;
//
//        for (int i = 0; i < doubles.length; i++) {
//            System.out.print(doubles[i] + " ");
//            sum += doubles[i];
//            if (i > max) {
//                max = doubles[i];
//            }
//            if (i == doubles.length - 1) {
//                System.out.println();
//                System.out.println("총합: "+ sum);
//                System.out.println("최대값: "+ max);
//            }
//        }

//        String[] strings = {"Hello", "Java", "World"};
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }

//        int score, count, sum;
//
//        count = 0;
//        sum = 0;
//
//        while (true) {
//
//            System.out.print("점수를입력:");
//            score = scanner.nextInt();
//
//            if (score == -1 && count != 0) {
//                System.out.println("총합:" + sum);
//                System.out.println("평균:" + sum/count);
//                break;
//            }
//
//            sum += score;
//            count ++;
//
//        }

//        String[] types = {"클럽","다이아","하트","스페이드"};
//        String[] nums = {"2","3","4","5","6","7","8","9","1","잭","퀸","킹","에이스"};
//
//        System.out.print("몇장 뽑을까요");
//        int c = scanner.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < c; i++) {
//            int a = (int)(Math.random() * 4);
//            int b = (int)(Math.random() * 13);
//            System.out.println(types[a] + nums[b]);
//            count ++;
//
//        }
//        System.out.println(count + "장 뽑았습니다");

//        int[][] a = {{1, 2, 3,}, {1, 2,}, {1}, {1, 2, 3,}};
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++ ) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }

//        int[][] a = new int[3][5];
//        int count = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = 0;
//            }
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//            int ran1 = random.nextInt(3);
//            int ran2 = random.nextInt(5);
//            a[ran1][ran2] = 1;
//
////TODO 중복방지 어떻게 하지
//
//        }
//
//        while (true) {
//
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < a[i].length; j++) {
//                    count += a[i][j];
//                }
//            }
//
//            if (count < 5) {
//
//                int ran1 = random.nextInt(3);
//                int ran2 = random.nextInt(5);
//
//                a[ran1][ran2] = 1;
//
//            } else {
//
//                for (int i = 0; i < a.length; i++) {
//                    for (int j = 0; j < a[i].length; j++ ) {
//
//                        System.out.print(a[i][j]);
//
//                    }//j
//                    System.out.println();
//                }//i
//
//
//
//                break;
//            }
//
//        }







    }//end of main
}//end of class
