package ch01;

public class MyMetric {

    private int kilo;

    private MyMetric(int kilo) {
        this.kilo = kilo;
    }

    private void kilo2mile() {

        System.out.println(kilo * 0.62);
    }


    public static void main(String[] args) {

        MyMetric m1 = new MyMetric(5);

        m1.kilo2mile();


    }
}//class
