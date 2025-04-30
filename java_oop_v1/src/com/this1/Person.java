package com.this1;
//Person 클래스 설계
public class Person {
    /*
    this의 3가지 사용법

    1. 자기 자신의 주소를 가리킨다.

    2. 생성자에서 다른 생성자를 호출한다.

    3. 자신의 주소값을 반환시킨다.

    먼저 1번 용법을 알아본다 - 문법, 이유
     */
    //속성
    private String name;
    private int age;
    private String phone;
    private String gender;

    //생성자
    public Person(String name, int age) {
        // 멤버변수 = 매개변수
        this.name = name; // this를 사용했다
        this.age = age; // 변수이름 떠올리는 수고를 줄여준다.

        System.out.println("1번 생성자 호출됨");
    }
    /*
    2번째 사용 방법
    this();
     */
    public Person(String name, int age, String phone) {
        //this.name = name;
        //this.age = age;
        this(name, age); //다른 생성자 구분, 앞에 뭐가 있으면 안됨
        this.phone = phone;

        System.out.println("2번 생성자 호출됨");
    }
    public Person(String name, int age, String phone, String gender) {
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
        this(name, age, phone);
        this.gender = gender;

        System.out.println("3번 생성자 호출됨");
    }
    /*
    3번째 사용 방법
    현재 생성된 객체
    즉, 나의 주소를 외부로 반환한다.

    디자인 패턴

    프로그램을 작성할 때
    일괄된 문제가 발생할 수 있다.

    이 때 특정 코드의 패턴을 만들어서
    해결해 가는 방법이 있다.
     */
    public Person getPerson() {
        return this;
    }
} // end of class
