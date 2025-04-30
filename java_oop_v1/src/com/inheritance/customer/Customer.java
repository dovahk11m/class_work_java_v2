package com.inheritance.customer;
/**
 * 4.21 상속개념 7
 * 클래스 다이어그램 준수해야 한다.
 */
public class Customer {

    //member
    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonuspoint;
    private double bonusRatio;

    static int idCount = 1;

    //constructor
    public Customer(String customerName) {
        this.customerID = idCount;
        idCount++;
        this.customerName = customerName;
        customerGrade = "일반";
        bonuspoint = 0;
        bonusRatio = 0.01;
    }

    //getter
    int getCustomerID() {
        return customerID;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerGrade() {
        return customerGrade;
    }

    int getBonuspoint() {
        return bonuspoint;
    }

    //setter
    void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    //method

    public int calcPrice(int int1) {
        return (int) (bonusRatio * int1);
    } //calcPrice

    public void showCustomerInfo() {
        System.out.print("고객 정보...");
        System.out.print(" 고객ID: " + customerID);
        System.out.print(" 고객이름: " + customerName);
        System.out.print(" 고객등급: " + customerGrade + "(" + bonusRatio + ")");
        System.out.println(" 포인트: " + bonuspoint);
    } //showCustomerInfo

}//end of class
