package com.inheritance.customer;
/**
 * 4.21 상속개념 7_2
 * 클래스 다이어그램 준수해야 한다.
 */
public class GoldCustomer extends Customer {

    //클래스속성
    private int agentID;
    private double salesRatio;

    //생성자
    public GoldCustomer(String customerName, int agentID) {
        super(customerName);
        this.agentID = agentID;
        salesRatio = 0.05;
        setCustomerGrade("GOLD");
    }

    //getter
    public int getAgentID() {
        return agentID;
    }

    //메서드
    public int calcPrice(int int1) {
        return (int) (salesRatio * int1);
    }

    public void showCustomerInfo() {
        System.out.print("고객 정보...");
        System.out.print(" 고객ID: " + super.getCustomerID());
        System.out.print(" 고객이름: " + super.getCustomerName());
        System.out.print(" 고객등급: " + super.getCustomerGrade() + "(" + salesRatio + ")");
        System.out.println(" 포인트: " + super.getBonuspoint());
    }

}//end of class

