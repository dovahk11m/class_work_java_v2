package com.inheritance.customer;
/**
 * 4.21 상속개념 7_3
 * 클래스 다이어그램 준수해야 한다.
 */
public class CustomerMainTest {

    //main
    public static void main(String[] args) {

        Customer customer1 = new Customer("홍길동");
        VIPCustomer vipCustomer1 = new VIPCustomer("장길산", 1);
        GoldCustomer goldCustomer1 = new GoldCustomer("임꺽정", 1);

        customer1.showCustomerInfo();
        vipCustomer1.showCustomerInfo();
        goldCustomer1.showCustomerInfo();

        System.out.println(customer1.getCustomerName() + "이 받을 포인트: " + customer1.calcPrice(1000));
        System.out.println(vipCustomer1.getCustomerName() + "이 받을 포인트: " + vipCustomer1.calcPrice(1000));
        System.out.println(goldCustomer1.getCustomerName() + "이 받을 포인트: " + goldCustomer1.calcPrice(1000));

    }//end of main
}//end of class
