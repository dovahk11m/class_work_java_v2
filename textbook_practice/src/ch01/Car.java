package ch01;

import java.util.Scanner;

public class Car {

    private String model;
    private String make;
    private static int numsOfCar = 0;


    private Car(String make, String model) {
        this.model = model;
        this.make = make;

        numsOfCar++;
        System.out.println(make+"의 " +model+"자동차 생산");
        System.out.println("총 생산량="+ numsOfCar);
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public static void main(String[] args) {
        Car c1 = new Car("현대", "아이오닉");
        Car c2 = new Car("현대", "아이오닉");

    }//main
}//class
