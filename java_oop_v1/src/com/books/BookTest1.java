package com.books;
/**
 * 4.18 3강
 * 배열에 주소값 넣기
 */
public class BookTest1 {
    //main
    public static void main(String[] args) {
        //int[]
        //double[]
        //String[]
        Book[] books = new Book[10];
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘류");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        // [주소값] [주소값] [주소값] [주소값] [주소값] [주소값]
        books[9] = new Book("홍길동전", "허균");
        /*
        배열 안에 들어갈 수 있는 요소는
        기본데이터 타입 뿐만 아니라
        참조자료형(주소값)도 있다.
         */
        //조회
        String title9 = books[9].getTitle();
        String autor9 = books[9].getAuthor();

        System.out.print(title9 + " "); // 홍길동전
        System.out.println(autor9); // 허균
        System.out.println();
        /*
        배열은 반복문과 함께 많이 쓰인다.

        ⭐ 배열의 길이와 안의 요소(elements)는
        꼭 가득 차 있는 것은 아니다.
         */
//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i].getTitle()); // 오류 발생: null point exception
//        }
        /*
        TODO 방어적 코드 작성 필요
        만약 배열 안의 요소가 null이 아니라면 출력해
         */
        for (int i = 0; i < books.length; i++) { //🌟모든 not null 요소 출력
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            } //end of if
        } //end of for
    }//end of main
}//end of class
