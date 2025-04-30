package com.my.array;
    /**
     * 4.18 배열 6강
    전화번호 관리 프로그램 만들기

    저장
    조회, 선택조회
    수정
    삭제
    종료

    Scanner 호출
    배열크기 100
     */

import java.util.Scanner;

public class ArrayPhone {

    /// PhoneBook 클래스 설계
    private String names;
    private String numbers;

    //static 변수 선언
    static int currentPhoneBookIndex = 3;
    static int temp;

    /// 생성자
    public ArrayPhone(String names, String numbers) {
        this.names = names;
        this.numbers = numbers;
    }

    /// 메서드
    //getter
    public String getNames() {
        return names;
    }

    public String getNumbers() {
        return numbers;
    }

    //setter
    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    //showinfo
    ////////// ////////// ////////// ////////// ////////// ////////// ////////// //////////

    /// 함수 선언

    // 저장 함수
    public static void save(Scanner scanner, ArrayPhone[] phones) {
        System.out.println("===== save()");

        System.out.println("이름 입력");
        String names = scanner.nextLine();

        System.out.println("전화번호 입력");
        String numbers = scanner.nextLine();

        ArrayPhone phoneBook = new ArrayPhone(names, numbers); //생성자 선언

        phones[currentPhoneBookIndex] = phoneBook;
        currentPhoneBookIndex ++;


    } // 저장 함수 끝

    // 전체조회 함수
    public static void readAll(ArrayPhone[] phones) {
        System.out.println("===== readAll()");

        for (int i = 0; i < phones.length; i++) {

            if (phones[i] != null) {
                System.out.println(phones[i].getNames() + ", " + phones[i].getNumbers());

            }//if
        }//for
    }// 전체조회 함수 끝

    // 이름조회 함수
    public static void readByName(Scanner scanner, ArrayPhone[] phones) {
        System.out.println("===== readByName()");

        System.out.println("이름 입력");

        String name = scanner.nextLine();

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {// 방어코드
                if (phones[i].getNames().equals(name.trim())) { //검색

                    //찾았을때
                    System.out.println(phones[i].getNames()+", "+phones[i].getNumbers());

                }//검색 끝
            }//방어코드 끝
        }//end of for

    }//이름조회 함수 끝

    // 수정 함수
    public static void update(Scanner scanner, ArrayPhone[] phones) {
        System.out.println("===== update()");

        System.out.println("이름 입력");
        String name = scanner.nextLine();

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {// 방어코드
                if (phones[i].getNames().equals(name.trim())) { //검색

                    //찾았을때
                    temp = i;

                }//검색 끝
            }//방어코드 끝
        }//end of for

        System.out.println("번호 입력");
        String number = scanner.nextLine();
        phones[temp].setNumbers(number.trim());

    }// 수정 함수 끝

    //삭제
    public static void deleteAll(ArrayPhone[] phones) {
        System.out.println("===== deleteAll()");

        for (int i = 0; i < phones.length; i++) {
            phones[i] = null;
        }

        System.out.println("모든 번호가 삭제됐습니다");

    }//삭제 끝

    //정렬

    //TODO 정렬기능 만들어보기 Array.sort

    //정렬끝

    /// /////// ////////// ////////// ////////// ////////// ////////// ////////// //////////
    //🌟메인함수
    public static void main(String[] args) {

        //스캐너 호출
        Scanner scanner = new Scanner(System.in);

        //상수 선언
        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_NAME = "3";
        final String UPDATE = "4";
        final String DELETE = "5";
        final String END = "0";

        //배열 100 선언
        ArrayPhone[] phones = new ArrayPhone[100];

        //샘플 데이터
        phones[0] = new ArrayPhone("홍길동", "010-1234-4321");
        phones[1] = new ArrayPhone("장길산", "010-1234-4321");
        phones[2] = new ArrayPhone("임꺽정", "010-1234-4321");

        //흐름제어
        boolean flag = true;

        //반복문 프로그램
        while (flag) {
            System.out.println("===== ===== ===== ===== ===== ===== ===== =====");
            System.out.println("메뉴선택: 1.저장 2.전체조회 3.이름조회 4.수정 5.삭제 0.종료");
            String selecNo = scanner.nextLine();

            if (selecNo.equals(SAVE)) {
                System.out.println("저장하기");
                //저장함수 호출
                save(scanner, phones);

            } else if (selecNo.equals(SEARCH_ALL)) {
                System.out.println("전체조회");
                //전체조회 호출
                readAll(phones);

            } else if (selecNo.equals(SEARCH_BY_NAME)) {
                System.out.println("이름조회");
                //이름조회 호출
                readByName(scanner, phones);

//                System.out.println("번호를 수정할까요? 4.수정 0.종료" );
//                String selecNoUpdate = scanner.nextLine();
//
//                if (selecNoUpdate.equals(UPDATE)) {
//                    //수정 호출
//
//                } else if (selecNoUpdate.equals(END)) {
//                    System.out.println("프로그램 종료");
//                    flag = false;
//                } else {
//                System.out.println("잘못된 번호입니다");
//                }
            } else if (selecNo.equals(UPDATE)) {
                System.out.println("번호수정");
                //삭제 호출
                update(scanner, phones);

            }else if (selecNo.equals(DELETE)) {

                System.out.println("모든 번호를 삭제할까요 1.진행 2.메뉴");
                selecNo = scanner.nextLine();

                if (selecNo.equals(SAVE)) {
                    System.out.println("번호삭제");
                    //삭제 호출
                    deleteAll(phones);
                } else if (selecNo.equals(SEARCH_ALL)) {
                    System.out.println("메뉴로 돌아갑니다");
                } else {
                    System.out.println("잘못된 번호입니다");
                }


            } else if (selecNo.equals(END)) {
                System.out.println("프로그램 종료");
                flag = false;
            } else {
                System.out.println("잘못된 번호입니다");
            }// if 끝

        }// while 끝

    }// end of main

}// end of class
