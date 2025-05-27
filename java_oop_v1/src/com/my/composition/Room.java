package com.my.composition;

public class Room {

    //member field
    private String type;

    //constructor
    public Room(String type) {
        this.type = type;
    }

    //method
    void describe() {
        System.out.println(this.type + "입니다");
    }

}//end of CompRoom
