package com.composition;
/**
 * 4.21 포함개념 8_2
 */
public class House {

    private String address;
    Room[] rooms;

    public House(String address) {
        this.address = address;

        this.rooms = new Room[3];

        rooms[0] = new Room("1.거실");
        rooms[1] = new Room("2.침실");
        rooms[2] = new Room("3.주방");

        //속성으로 선언되고
        //내붸서 객체생성
        //컴포지션이다.
        //room = new Room(type:"안방");
    }

    void showRoom() {
        System.out.println(address+ "에 있는 한 주택의 방 목록: " );
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                rooms[i].descrive();
            }
        }
    }

    //테스트
    public static void main(String[] args) {
        House house = new House("부산시진구");
        house.showRoom();

        //house 객체가 소멸이 되면 rooms 도 Room 객체도 소멸
        //GC에 의해 소멸
        house = null;
    }//end of main

}//end of House
