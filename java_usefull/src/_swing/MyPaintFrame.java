package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.28
 *
 * 구조
 * 멤버변수, 생성자, 메서드, 내부클래스, 메인
 *
 */
public class MyPaintFrame extends JFrame {

    //member
//    private JPanel panel;
    /*
    💡근데 패널도 클래스다.
    내가 정의한 클래스에 상속을 받을 수 있지 않을까?

    이너클래스 개념을 이용해보자
     */
    private MyDrawPanel drawPanel;

    //constructor
    public MyPaintFrame() {

        initData();
        setInitLayout();

        drawPanel = new MyDrawPanel();
    }


    //method
    private void initData() {
        setTitle("내부클래스 JPanel 상속 처리");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new MyDrawPanel();
    }

    private void setInitLayout() {
        add(drawPanel);
        //컴포넌트를 상속한 클래스라서 들어갈 수 있다.
    }

    //innerclass - 사용자 정의 정적내부클래스
    static class MyDrawPanel extends JPanel {

        /*
        사각형 패널을 그려보자
        paint 철자 주의
         */
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50,50,100,50);
            g.drawRect(250,50,100,50);
            g.drawLine(200,100,200,300);
            g.drawLine(50,200,350,200);

            g.drawString("***",75,75);
            g.drawString("***",275,75);
            g.drawString("안녕***",150,150);
            g.drawString("💀💀💀💀💀",225,225);
        }

    }//end of inner

    //main
    public static void main(String[] args) {

        MyPaintFrame myPaintFrame = new MyPaintFrame();

    }//end of main
}//end of class
