package ch01;

import java.util.Random;

public class Circle2 {

    private int radius;

    private Circle2(int radius) {
                this.radius = radius;
    }

    void show() {
        System.out.println(radius);
    }


    public static void main(String[] args) {

        Circle2[] circles = new Circle2[3];

        Random random = new Random();

        int ran1 = random.nextInt(100)+1;

        circles[0] = new Circle2(random.nextInt(100)+1);
        circles[1] = new Circle2(random.nextInt(100)+1);
        circles[2] = new Circle2(random.nextInt(100)+1);

        circles[0].show();
        circles[1].show();
        circles[2].show();



    }//main
}//class
