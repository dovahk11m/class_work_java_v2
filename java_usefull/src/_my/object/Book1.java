package _my.object;
/**
 * 4.24
 * 오브젝트 연습
 */

public class Book1 {

    //member
    private int bookTypeId;

    private String title;
    private String author;

    //constructor (Alt Insert)
    public Book1(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    //method override - eqauls
    @Override
    public boolean equals(Object obj) {
        /*
        Book 타입이 맞고
        제목이 같고
        저자가 같으면
        같은 책으로 판별해보자
         */

        if (obj instanceof Book1) { //Book1 클래스인가?

            if (this.title.equals(((Book1) obj).title) && this.author.equals(((Book1) obj).author)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }//end of equlas

    @Override
    public int hashCode() {
        return bookTypeId;
    }

    //main - Test code
    public static void main(String[] args) {


    //object
    Book1 book1 = new Book1(1, "홍길동전", "허균");
    Book1 book2 = new Book1(1, "홍길동전", "허균");
    Book1 book3 = new Book1(2, "데미안", "헤세");
    Book1 book4 = new Book1(1, "홍길동전", "김근호");

    String str1 = new String("데미안");

    boolean result1 = book1.equals(book2);
    boolean result2 = book1.equals(str1);
    boolean result3 = book1.equals(book3);
    boolean result4 = book1.equals(book4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }//end of main
}//end of Book1
