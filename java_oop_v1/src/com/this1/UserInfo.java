package com.this1;
public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAdress;
    private String phoneNumber;

    // 생성자 매개변수 1개 ~ 5개, 모두 5가지 만들기 (생성자 오버로딩)
    public UserInfo(String userId) {
        this.userId = userId;
    }
    public UserInfo(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;
    }
    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
    }
    public UserInfo(String userId, String userPassword, String userName,
                    String userAdress) {
        this(userId, userPassword, userName);
        this.userAdress = userAdress;
    }
    public UserInfo(String userId, String userPassword, String userName,
                    String userAdress, String phoneNumber) {
        this(userId, userPassword, userName, userAdress);
        this.phoneNumber = phoneNumber;
    }

    // getter 메서드
    public String getUserId() {
        return userId;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserAdress() {
        return userAdress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setter 메서드
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}// end of class
