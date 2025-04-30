package _my._swing;

import javax.swing.*;
import java.awt.*;
/**
 * 4.28
 *
 * 집그리기
 * 멤버변수, 생성자, 메서드, 내부클래스, 메인
 *
 */
public class MyPaintFrame extends JFrame {

    //member
    private Mypanel mypanel;

    private JPanel panel1;
    private JPanel panel2;

    //cons
    public MyPaintFrame() {

        initData();
        setInitLayout();
    }

    //method
    private void initData() {
        setTitle("집그리기");
        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mypanel = new Mypanel();

        panel1 = new JPanel();
        panel2 = new JPanel();

    }

    private void setInitLayout() {
        add(mypanel);
    }

    //inner
    static class Mypanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
//            setBackground(new Color(189,230,249));
            setBackground(new Color(61,47,80));

            //네모
            g.setColor(new Color(0,128,0));
            g.fillRect(100,400,550,250);
            g.fillRect(300,200,350,200);
            g.setColor(new Color(150,75,0));
            g.fillRect(0,650,1000,500);


            //1층창
            g.setColor(Color.blue);
            g.fillRect(150,550,200,50);
            g.fillRect(375,550,25,50);
            g.fillRect(425,550,25,50);
            //2층창
            g.fillRect(475, 450,125,50);
            g.fillRect(425, 450,25,50);
            g.fillRect(375, 450,25,50);
            //3층창
            g.fillRect(425, 300,25,50);
            g.fillRect(375, 300,25,50);
            //원
            g.setColor(Color.white);
            g.fillOval(25,25,175,175);
            g.setColor(new Color(61,47,80));
            g.fillOval(50,50,150,150);
            //선
            g.setColor(Color.red);
//            g.drawLine(100,400,300,300);
//            g.drawLine(300,100,650,200);
//            g.drawLine(300,100,300,200);
            //삼각형
            int[] intX = {100,300,300};
            int[] intY = {400,300,400};
            g.fillPolygon(intX,intY,3);
            int[] intX2 = {300,300,650};
            int[] intY2 = {100,200,200};
            g.fillPolygon(intX2,intY2,3);
            //둥근네모
            g.setColor(Color.black);
            g.fillRoundRect(660,550,100,100,50,50);
            //글자
            g.setColor(Color.red);
            g.drawString("💀💀💀💀💀",680,605);
            g.setFont(new Font("d2coding",Font.BOLD,25));
            g.drawString("051)912-1000",460,600);
            g.setColor(Color.black);
            g.drawString("그린컴퓨터학원",460,570);

        }
    }//end of inner

    //main
    public static void main(String[] args) {

        MyPaintFrame myPaintFrame = new MyPaintFrame();

    }//end of main
}//end of class
