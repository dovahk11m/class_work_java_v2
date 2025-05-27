package com.static1;
//클래스 설계
public class Employee {

    //속성
    private int employeeId;
    private String name; //
    private String department;

    //생성자
    public Employee(String name) {
        this.name = name;
//        employeeId = 1;
        /*
        클래스 변수를 활용해보자.
        클래스 이름으로 접근할 수 있다.
        Company.empSerialNumber
         */
        employeeId = Company.empSerialNumber;
        Company.empSerialNumber ++;
    }

    //메서드

    //getter
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
}
