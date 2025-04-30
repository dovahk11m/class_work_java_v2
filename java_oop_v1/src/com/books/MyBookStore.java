package com.books;
import java.util.Scanner; //스캐너 호출
/**
 * 4.18 5강
 * 배열
 * 실행의 흐름 만들어보기
 * 모든 프로그램의 기본은 CURD이다
 */
public class MyBookStore {
    /*
    샘플 데이터 = 5
    샘플데이터 지우면 인덱스번호 0부터 하면 됨
     */
    //스태틱 변수
    static int currentBookIndex = 6;

    //메인함수
    public static void main(String[] args) {
        //스캐너 준비
        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.nextLine(); 문자열 스캐너

        //배열 준비
        Book[] books = new Book[100];
//        books = null //배열 삭제방법 - 가리키는 공간이 없다.

        //샘플 데이터 미리 만들어두기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘류");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[5] = new Book("홍길동전", "허균");
        //TODO 추후 삭제하기

        //실행의 흐름을 제어하는 플래그 준비
        boolean flag = true;

        //상수 준비
        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITTLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        while (flag) {
            System.out.print("메뉴선택: 1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료");
            String selecNo = scanner.nextLine();
            /*
            숫자 비교할 때 ==
            문자열 비교할 때 "문자열"equals("문자열") => true, false

            👍문자열 비교할때는 무조건 equals 메서드를 사용하자
             */
//            if (selecNo == "SAVE") {}
            if (selecNo.equals(SAVE)) {
                System.out.println("⭐저장하기");
                save(scanner, books);

            } else if (selecNo.equals(SEARCH_ALL)) {
                System.out.println("⭐전체조회하기");
                readAll(books);

            } else if (selecNo.equals(SEARCH_BY_TITTLE)) {
                System.out.println("⭐책 제목으로 조회하기");
                readByTitle(scanner, books);

            } else if (selecNo.equals(DELETE_ALL)) {
                System.out.println("⭐전체삭제하기");
                deleteAll(books);

            } else if (selecNo.equals(END)) {
                System.out.println("...프로그램을 종료합니다");
                flag = false; // while(false)가 돼서 종료

            } else {
                System.out.println("💀잘못된 선택입니다 1~5 번호 중에서 선택해주세요");
            }//end of if

        }//end of while

    }//end of main

    //🌟다른 함수를 선언하려면 메인함수 밖에서 해야돼

    //저장하기 함수 - 하나의 Book 객체를 배열에 저장하는 기능
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("===== save() =====");

        // 사용자에게 값을 받아야 한다.
        System.out.println("책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("책 저자을 입력하세요");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        // 5, 6, 7...
        // books라는 배열에 book 객체를 저장하는 코드가 된다.
        // 인덱스 번호가 어디까지 사용했는지에 대한 정보도 필요하다
        // 이는 static 변수로 관리한다

        if (currentBookIndex > books.length) {
            System.out.println("더 이상 저장할 공간이 없습니다");
            return;
        }

        books[currentBookIndex] = book;
        currentBookIndex ++;
    }

    //전체 조회하기 함수 - 반복문 필요, 배열 필요
    public static void readAll(Book[] books) { //💀 배열 문법 조심
        System.out.println("===== readAll() =====");
        for (int i = 0; i < books.length; i++) {

            //방어적 코드 작성
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    //책 제목으로 조회하기 함수
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("===== readByTitle() =====");

        System.out.println("책 제목을 입력해주세요");

        /*
        문자열 기능 중에 공백 제거 기능이 있다.

        trim(); " " + "문자열" + " "
        앞뒤 공백 알아서 제거
         */

        String title = scanner.nextLine();
        boolean isFind = false;
        /*
        찾는 기능을 만들어줘야 한다.
        [] * 100 다 확인 필요
         */
        for (int i = 0; i < books.length; i++) {

            // "문자열".equals()

            /*
            💀 null point exception 발생원인
            0~5까지는 잘 돌아가는데
            6에서 null 값을 만나서 터진다

            TODO 방어적 코드 작성 필요
             */

            if(books[i] != null) { // 방어적 코드 - not null에만 실행

                // title.trim() => 양끝단의 공백 제거
                if (books[i].getTitle().equals(title.trim())) {

                    //찾았다면 출력해
                    System.out.println(books[i].getTitle()+", " + books[i].getAuthor());

                    //찾았으니 그만해
                    isFind = true;
                    break;
                }
            }

        }//end of for
        // 반복문 100번 돌려도 못찾으면 나오는 문구
        // isFind = false
        if (!isFind) {
            System.out.println("💀 해당 책은 존재하지 않습니다.");
        }
    }

    //전체 삭제하기 함수 - 배열안에 담긴 Book 객체를 전부 null 처리
    public static void deleteAll(Book[] books) {
        System.out.println("===== deleteAll() =====");

        // 전체 삭제 중
//        books = null; => 배열 공간 자체를 없애버림
//        books[0] ~ books[100] = null; => 각각의 값을 null 처리

        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
    }

}//end of class
