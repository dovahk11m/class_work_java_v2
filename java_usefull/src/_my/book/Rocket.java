package _my.book;

public class Rocket {

    private int x;
    private int y;

    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private void moveUp() {
        y ++;
    }

    //main
    public static void main(String[] args) {

        Rocket rocket = new Rocket(10, 10);

        System.out.println(rocket.toString());

        rocket.moveUp();

        System.out.println(rocket.toString());


    }//end of main

}//end of class
