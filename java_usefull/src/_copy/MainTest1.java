package _copy;
/**
 5.2
 참조변수에 다른 참조변수를 대입했을때
 주소값이 변한다는 개념을 이해한다.

 이를 얕은 복사 Shallow Copy 라고 한다.
 */
public class MainTest1 {

    //메인 = 메인은 Stack 메모리에 할당
    public static void main(String[] args) {
        /*
        얕은 복사 Shallow Copy
        깊은 복사 Deep Copy

        이를 이해하려면
        기본 데이터 타입(소문자), 참조 타입(대문자)의 차이를 알아야 한다.

         */
        int a = 10;
        int b = a; //대입
        //기본데이터타입를 대입하면 값 복사가 된다.

        b = 100;
        //b 값을 변경해도 a 값에는 변화가 없다.

        System.out.println("a값: " + a); // 10
        System.out.println("b값: " + b); // 100
        System.out.println();

        /*
        person => 참조변수
        변수안에 담기는 값은
        heap 메모리 안에 존재하는 주소값이다.

        참조변수끼리 대입을 하면
        person2 = person1;
        주소값이 복사된다 = 얕은 복사 Shallow Copy
        person1과 person2는 같은 객체를 바라보고 있는 상태다.
         */
        Person person1 = new Person("홍길동");
        System.out.println("초기값 person1: " + person1.name);
        System.out.println("1. person2에 person1 주소값 대입");
        Person person2 = person1; //참조변수 대입하면 주소값 복사

        System.out.println("2. person2의 값을 티모로 변경");
        person2.name = "티모";
        System.out.println("3. person2의 값을 변경했는데.."
                + " person1의 값도 바뀌었다.");
        System.out.println("확인 person1: " + person1.name);
        System.out.println();

    }//end of main
}//end of class

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}//end of Person