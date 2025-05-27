package _colloections;

import java.util.HashMap;
import java.util.Scanner;

/**
 5.7
 컬렉션프레임워크3
 Map 계열
 */
public class BookMapAddSystem {

    //키 밸류 구조

    //member
    private HashMap<String, Book> bookHashMap;

    //costructor
    public BookMapAddSystem() {
        bookHashMap = new HashMap<>();
    }

    //저장 메서드
    public boolean addBook(String title, String author) {

        return bookHashMap.put(title, new Book(title,author)) == null;
    }

    //출력 메서드 (제목과 저자를 모두 표시)

    public void show() {

        for (Book b : bookHashMap.values()) {

            System.out.println(b.toString());
        }
        System.out.println("총id수: " + bookHashMap.size());
    }

    //시스템 실행
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("책 제목을 입력하세요. " +
                    "종료하라면 'exit' 입력");

            String title = scanner.nextLine().trim();


            if (title.isEmpty()) {
                System.out.println("제목을 입력하세요");
                break;
            }

            if ("exit".equals(title)) {
                System.out.println("😎시스템 종료");
                break;
            }

            if ("show".equals(title)) {
                show();
                continue;
            }

            System.out.println("책 저자를 입력하세요. " +
                    "종료하라면 'exit' 입력");

            String author = scanner.nextLine().trim();

            if ("exit".equals(title)) {
                System.out.println("😎시스템 종료");
                break;
            }
            if ("show".equals(title)) {
                show();
                continue;
            }

            boolean isResistered = addBook(title, author);

            if (isResistered) {
                System.out.println("👍새로운 ID 등록");
            } else {
                System.out.println("💀이미 등록된 ID 입니다.");
            }

        }//while
        scanner.close();

    }//start

    //main
    public static void main(String[] args) {

        BookMapAddSystem bookSystem = new BookMapAddSystem();

        bookSystem.addBook("장화홍련", "작가미상");
        bookSystem.addBook("홍길동전", "허균");
        bookSystem.addBook("구운몽", "김만중");

        bookSystem.start();

    }//main

}//BookMapAddSystem

//데이터타입 Book 선언
class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}//Book