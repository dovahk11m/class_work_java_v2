package com.my.class_;
/**
 * author 조충희
 * 클래스 설계
 * 메인
 */
public class Card1 {

    //static 변수
    static int cardCounter = 1;

    //멤버변수
    private String cardName;
    private int cardNumber;

    //생성자
    public Card1(String cardName) {
        this.cardName = cardName;
        this.cardNumber = cardCounter++;
    }

    //메서드
    public void showInfo() {
        System.out.println("⭐"+ cardName + " 카드 상태⭐");
        System.out.println("카드이름: " + cardName);
        System.out.println("카드번호: " + cardNumber);
    }

    //메인
    public static void main(String[] args) {

        System.out.println("고유번호 초기화 값: " + Card1.cardCounter);
        System.out.println("===== ===== =====");

        Card1 card1 = new Card1("첫카드");
        Card1 card2 = new Card1("둘카드");
        Card1 card3 = new Card1("셋카드");

        card3.showInfo();
        card2.showInfo();
        card1.showInfo();

    }//end of main
}//end of class
