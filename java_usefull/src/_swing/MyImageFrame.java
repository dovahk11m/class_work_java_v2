package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.28
 * Swing 2강
 * 이미지를 프레임에 올려보자
 *
 */
public class MyImageFrame extends JFrame {

    //구조 - 멤버, 생성자, 메서드, 내부클래스, 메인

    //member
    private MyImagePanel myImagePanel;

    private JPanel panel1;
    private JPanel panel2;

    //cons
    public MyImageFrame() {
        initData();
        setInitLayout();
    }

    //method
    private void initData() {
        setTitle("이미지 넣어보기 연습");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //멤버변수 호출
        myImagePanel = new MyImagePanel();

        panel1 = new JPanel();
        panel2 = new JPanel();
    }

    private void setInitLayout() {

        setBackground(Color.yellow);

        setLayout(new GridLayout(1,3));

        panel1.setBackground(Color.black);
        panel2.setBackground(Color.yellow);

        add(panel1);

        add(myImagePanel);

        add(panel2);

    }

    //inner - 정적 내부 클래스
    static class MyImagePanel extends JPanel {
        //다형성 때문에 JPanel로 볼 수 있어

        //내부 클래스의 멤버변수 선언
        private Image image1;
        private Image image2;
        private Image image3;
        private Image image4;

        //내부 클래스의 생성자
        public MyImagePanel() {
            /*
            이미지 생성에는 여러가지 방법이 있다.

            여기서는
            ImageIcon 이라는 데이터타입을
            .getImage() 라는 메서드를 호출해서
            형 변환을 했다.

            단, ImageIcon 은 루트폴더(java_usefull)를 기준으로 검색한다.
             */
            image1 = new ImageIcon("image1.png").getImage();
            image2 = new ImageIcon("image2.png").getImage();
            image3 = new ImageIcon("image3.png").getImage();
            image4 = new ImageIcon("image4.png").getImage();

        }

        //paint method override
        //페인트 메서드는 자동으로 호출되게끔 순서가 정해져 있다.
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            //이미지를 올려보자
            g.drawImage(image1, 0, 0, 300,300,null);
            g.drawImage(image2, 300, 0, 300,300,null);
            g.drawImage(image3, 0, 300, 300,300,null);
            g.drawImage(image4, 300, 300, 300,300,null);
        }

    }//end of inner

    //main
    public static void main(String[] args) {

        new MyImageFrame();

    }//end of main

}//end of class
