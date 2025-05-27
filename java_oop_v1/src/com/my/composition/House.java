package com.my.composition;

public class House {

    //member
    private String address;
    Room[] rooms;

    //constructor
    public House(String address) {
        this.address = address;
        this.rooms = new Room[3];

        rooms[0] = new Room("거실");
        rooms[1] = new Room("침실");
        rooms[2] = new Room("주방");
    }

    //method
    void showRoom() {
        System.out.println(address + "에 있는 방 목록: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                rooms[i].describe();
            }
        }
    }//showRoom

    //main
    public static void main(String[] args) {

        House house1 = new House("부산해운대구");

        house1.showRoom();

    }//end of main

}//end of class
