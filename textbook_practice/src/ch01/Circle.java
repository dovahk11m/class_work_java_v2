package ch01;
public class Circle {

    private int x;
    private int y;
    private int radius;

    private Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("circle [x="+x+ ",y=" +y+ ",r=" + radius+ "]");
    }


    public static void main(String[] args) {

        Circle c1 = new Circle(10, 10, 5);

        c1.move(20,30);


    }//main
}//class
