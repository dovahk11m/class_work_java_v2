package _colloections;

import java.util.HashMap;
import java.util.Map;

public class UserMapAddSystem {

    /*
    데이터를 맵 구조로 저장해본다.
     */

    private Map<String, User> users;

    public UserMapAddSystem() {
        users = new HashMap<>();
    }


    //users에 접근해서 데이터를 추가하는 기능을 만들어본다.


    public void addUser(String name, String email) {

        //1. Map 자료구조에 넣어야 한다.

        //2. key값을 명시하고 value 에는 User Object로 들어가야 한다.

//        User u1 = new User(name, email);
//        users.put(name, u1);

        users.put(name, new User(name, email));

    }//addUser

    //users에 접근해서 데이터를 출력하는 기능을 만들어본다.
    public void printAll() {
        for (User u : users.values()) {
            System.out.println(u.toString());
        }
    }

    //main
    public static void main(String[] args) {

        UserMapAddSystem userSystem = new UserMapAddSystem();

        userSystem.addUser("홍길동", "a.naver.com");
        userSystem.addUser("임꺽정", "b.naver.com");
        userSystem.addUser("장길산", "c.naver.com");

        userSystem.printAll();

    }//main
}//class

class User {

    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //toString 오버라이드
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}