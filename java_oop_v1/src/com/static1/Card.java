package com.static1;
//Card 클래스 설계
    //신용카드를 설계해보자
public class Card {

    //멤버변수
    private String name;
    private int cardId;

    static int cardIdNumber =1;

    //생성자
    public Card(String name) {
        this.name = name;
        this.cardId = cardIdNumber;
        cardIdNumber ++;
    }

    //메서드

    //main
    public static void main(String[] args) {

        Card card1 = new Card("첫카드");
        Card card2 = new Card("둘카드");
        Card card3 = new Card("셋카드");
        Card card4 = new Card("넷카드");

        System.out.println("첫카드 ID: " + card1.cardId);
        System.out.println("둘카드 ID: " + card2.cardId);
        System.out.println("셋카드 ID: " + card3.cardId);
        System.out.println("넷카드 ID: " + card4.cardId);

    }//end of main
}//end of class
