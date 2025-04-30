package _Inner;
/**
 * 4.25 inner 클래스 1강
 *
 * 정적 내부 클래스를 만들어보자
 * Static Inner Class
 */
public class SpaceshipMainTest {

    //main thread
    public static void main(String[] args) {
        /*
        멤버 내부 클래스의 문제점
        외부 클래스가 먼제 생성돼야 접근 가능하다.
        불편하다...

        정적 내부 클래스를 사용한다면?
         */
        Spaceship s1 = new Spaceship();
        s1.startSpaceShip();

        Spaceship.Engine engine1 = new Spaceship.Engine();
        Spaceship.Engine engine2 = new Spaceship.Engine();
        Spaceship.Engine engine3 = new Spaceship.Engine();

        s1.addengine(engine1); //우주선 si 에 엔진 engine1 추가

        s1.startSpaceShip(); //우주선 si 가동

        /*
        Why? 정적 내부 클래스를 사용하는 이유?

        ⭐논리적인 그룹화

        정적 내부 클래스는
        외부 클래스와 논리적으로 관련있는 클래스를
        그룹화하는데 유용하다

        👍이는 코드의 가독성과 구조화를 향상해
        관련 클래스들을 유지하는데 도움을 준다.
         */

    }//end of main
}//end of class
