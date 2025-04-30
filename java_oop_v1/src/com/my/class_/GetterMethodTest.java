package com.my.class_;

public class GetterMethodTest {

    //속성
    private String userId;
    private String userPassword;
    private String userName;
    private String userAdress;
    private String phoneNumber;

    //생성자

    public GetterMethodTest(String userId) {
        this.userId = userId;
    }

    public GetterMethodTest(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;
    }

    public GetterMethodTest(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userPassword = userName;
    }

    public GetterMethodTest(String userId, String userPassword, String userName, String userAdress) {
        this(userId, userPassword, userPassword);
        this.userAdress = userAdress;
    }

    public GetterMethodTest(String userId, String userPassword, String userName, String userAdress, String phoneNumber) {
        this(userId, userPassword, userPassword, userAdress);
        this.phoneNumber = phoneNumber;
    }

    // getter 메서드

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }



    // setter 메서드
}
