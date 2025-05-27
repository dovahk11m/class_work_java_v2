package com.static1;
    //클래스 설계
public class Card2 {
    /*
    static 변수
    모든 Card 객체가 공유한다.
    고유번호를 생성하는 데 활용된다.
     */
    private static int cardCounter = 0;

    //인스턴스 변수
    private final int cardId;
    private final String cardName;

    //생성자
    public Card2(String cardName) {
        this.cardName = cardName;
        this.cardId = ++cardCounter;
    }

    //static 메서드 - 함수
    public static int getTotalCards() {

//        System.out.println("cardName" + cardName);
        /*
        static 메서드 안에서 인스턴스 변수를 사용할 수 없다.
        인스턴스 변수는 객체가 생성된 이후에 사용할 수 있다.
         */

        //static 변수
        return cardCounter;
    }

    //인스턴스 메서드
    public void showInfo() {
        System.out.println(cardCounter);
        System.out.println(cardName + " 의 고유번호는 " + cardId);
        //인스턴스 메서드에선 인스턴스 변수 사용 가능
    }

    //메인
    public static void main(String[] args) {
        /*
        static 변수는
        객체 생성 전에 사용 가능

        마찬가지로

        static 메서드는
        객체 생성 전에 사용 가능

        사용법은
        클래스 이름으로 접근 가능
         */
        System.out.println(Card2.cardCounter); // static 변수

        System.out.println(Card2.getTotalCards()); // static 메서드

//        Card2 card1 = new Card2("우리카드1"); // 객체 생성
//        Card2 card2 = new Card2("우리카드2");
//
//        System.out.println(card1.cardName + " 고유번호는 " + card1.cardId);
//        System.out.println(card2.cardName + " 고유번호는 " + card2.cardId);

    }//end of main
}//end of class
