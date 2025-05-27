package com.books;
/**
 * 4.18 2강
 * 도서를 저장하고 관리할 수 있는
 * 간단한 프로그램 만들기
 * CRUD 개념!
 */
public class Book {
    //Book 클래스 설계
    private String title;
    private String author;
    private int totalPage;

    //생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    //getter메서드
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getTotalPage() {
        return totalPage;
    }

    //setter메서드
    public void setAuthor(String author) {
        this.author = author;
    }

    //메서드 - showInfo
    public void showInfo() {
        System.out.print("⭐도서정보⭐");
        System.out.print("도서명: " + title);
        System.out.print(",작가:" + author);
        System.out.print(",페이지:" + totalPage);
    }

}//end of class
