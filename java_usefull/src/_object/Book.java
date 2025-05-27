package _object;
/**
 * 4.24
 * Object 최상위 클래스 이해
 *
 * 클래스를 만들면
 * 기본적으로 Object 클래스를 상속받도록 돼 있다.
 *
 * Object 클래스는 모든 클래스의 최상위 클래스다.
 *
 * 자바는 Object 클래스를 제외하고
 * 단일 상속만을 제공한다.
 *
 * import java.lang.Object;
 * import java.lang.*;
 * 패키지도 자동으로 넣어준다
 */
//import java.lang.Object;
//import java.lang.*;

public class Book { //컴파일러가 'extends Object'를 자동으로 꽂아준다.

    private int bookTypeId;

    private String title;
    private String author;

    public Book(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) { //equals 메서드 재정의

        if (obj instanceof Book) {
            //Book 타입이 맞고, 제목도 같다면 같은 책으로 판별해보자
            //this.title == title && 저자 == 저자
            if (this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
   }
    /*
    equals 메서드를 재정의 할때는 haseCode 메서드를 재정의 해줘야
    의도하지 않은 동작을 막을 수 있다.

    hashCode
    이 객체의 고유한 정수값을 만들어서 독립성을 보장하는 정수 값이다.
     */

    @Override
    public int hashCode() {
        return bookTypeId;
    }

    //method - showInfo 대신 toString을 써보자
//    @Override
//    public String toString() {
//
//        return "title:" + title + ", author:" + author;
//    }

    //main - 테스트 코드
    public static void main(String[] args) {
        /*
        book1, boo2처럼
        물리적 객체 주소값은 다르지만
        equals 메서드를 재정의해서..

        논리적으로 책 이름과 저자 이름이 같다면
        같은 녀석으로 바라보도록
        프로그램을 짤 수는 없을까?
         */

        //object
        Book book1 = new Book(1, "데미안", "헤르만 헤세");
        Book book2 = new Book(1, "데미안", "헤르만 헤세");
        Book book3 = new Book(2, "자바", "홍길동");
        Book book4 = new Book(1, "데미안", "파울로코엘료");
        //두 객체는 내용은 같지만 주소값이 달라

        String stri1 = new String("데미안");

        System.out.println(book1.toString()); // toString: 객체의 주소값을 반환
        System.out.println(book2.toString());

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(stri1);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);

    }//end of main
}//end of class
