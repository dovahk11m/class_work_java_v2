package com.composition;
/**
 * 4.21 포함개념 8_2
 */
public class Room {

    private String type;

    public Room(String type) {
        this.type = type;
    }

    void descrive() {
        System.out.println(this.type + " 입니다.");
    }
}// end of Room
