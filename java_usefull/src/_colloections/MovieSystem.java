package _colloections;

import java.util.ArrayList;
/**
 5.2
 ArrayList 사용해보기
 */
public class MovieSystem {
    //main
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList();
        //Movie 타입만 들어갈 수 있다.

        //리스트에서 바로 객체생성
        movies.add(new Movie("범죄도시4 ", 5));
        movies.add(new Movie("기생충 ", 5));
        movies.add(new Movie("올드보이 ", 4));
        movies.add(new Movie("귀궁 ", 3));
        movies.add(new Movie("파일럿 ", 3));
//        movies.add(10);

        // 자료구조 안에 있는 영화 제목만 출력해보자
        for (int i = 0; i < movies.size(); i++) {
            //movies.get(i).getTitle(); //영화제목
            System.out.print(movies.get(i).getTitle());
        } System.out.println();

        // 초기화 for 구문, 로깅해볼때 많이 사용
        for (Movie m : movies) {
            System.out.print(m.getTitle());
        }

    }//end of main
}//end of class

class Movie { //데이터 클래스

    //멤버변수
    private String title;
    private int rating;

    //생성자
    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    //게터
    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    //세터
    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }

}//end of Movie
