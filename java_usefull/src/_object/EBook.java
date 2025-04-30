package _object;
/**
 * 4.24
 * Object 최상위 클래스 이해
 */
public class EBook {

    //member
    private int bookTypeId;
    private String title;
    private String author;

    //Alt Insert = constructor
    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    //toString() 메서드 재정의
    @Override
    public String toString() {
        return super.toString();
    }

    //equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}//end of EBook
