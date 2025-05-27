package com.array;
public class ArrayTest2 {
    //메인
    public static void main(String[] args) {
        char[] alphabet = new char[26]; // 52바이트 공간

//        alphabet[0] ='A'; alphabet[1] ='B'; alphabet[2] ='C'; alphabet[3] ='D';
//        alphabet[4] ='E'; alphabet[5] ='F'; alphabet[6] ='G'; alphabet[7] ='H';
//        alphabet[8] ='I'; alphabet[9] ='J'; alphabet[10] ='K'; alphabet[11] ='L';
//        alphabet[12] ='M'; alphabet[13] ='N'; alphabet[14] ='O'; alphabet[15] ='P';
//        alphabet[16] ='Q'; alphabet[17] ='R'; alphabet[18] ='S'; alphabet[19] ='T';
//        alphabet[20] ='U'; alphabet[21] ='V'; alphabet[22] ='W'; alphabet[23] ='X';
//        alphabet[24] ='Y'; alphabet[25] ='Z';

        /*
        char 타입은 원래 정수값이다.

        컴퓨터는 0,1의 이진수로 데이터를 표현한다.

        컴퓨터에서 문자를 표현하기 위해 문자표가 존재한다.

        아스키코드, EUC KR 등

        아스키코드
        1바이트(0~127) 안에 1개 문자를 표현 가능

        유니코드
        전세계 통합 문자표

        A 정수값 65
         */
//        System.out.println(alphabet[0] + "" + (int)alphabet[0]); // A 65
//        System.out.println(alphabet[1] + "" + (int)alphabet[1]); // B 66

        /*
        인코딩
        문자를 컴퓨터가 이해할 수 있도록
        숫자(코드 값)로 바꾸는 과정

        디코딩
        숫자(코드 값)를 사람이 이해할 수 있도록
        문자로 바꾸는 과정을 말한다.
         */

        int code1 = (int) 'A'; // 인코딩

        char code2 = (char) 66; // 디코딩

        //반복문을 통해 알파벳 A~Z까지 출력
        for (int i = 65; i < 91; i++) {
            System.out.print((char)i + " "); // A B C.. X Y Z
        }
        System.out.println();

        // alphabet[]에 A부터 Z까지 담아보자
//        for (int i = 0; i < 26; i++) {
//            alphabet[i] = (char)(i + 65);
//            System.out.println(alphabet[0] + "" + (int)alphabet[0]);
//        }

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)(i + 65);
            System.out.print(alphabet[i] + " ");
        }
        for (int i = 0; i < 26; i++) {

        }
    }//end of main
}//end of class
