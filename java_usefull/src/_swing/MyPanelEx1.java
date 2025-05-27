package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.28
 * 지금까지 배치관리자에 대해 알아봤다면
 * 기본 배치관리자로는 유연한 배치가 안되는 문제점
 *
 * JPanel
 * 패널을 여러개 나눈 다음
 * 각 패널마다 배치관리자를 할당하는 방법이 있다.
 *
 * GridLayout
 * 루트패널의 그리드를 나누는 배치관리자: 예) 2행 1열
 *
 */
public class MyPanelEx1 extends JFrame {

    //member
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    /*
    패널을 사용하면
    컴포넌트들을 그룹화시킬 수 있다.
    각각의 배치관리자를 추가해 관리할 수 있다.
     */

    private JPanel panel1;
    private JPanel panel2;

    //constructor
    public MyPanelEx1() {

        initData();
        setinitLayout();
    }

    //method
    private void initData() {
        setTitle("패널연습해보기");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1 = new JPanel();
        panel2 = new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");

    }

    private void setinitLayout() {

        //루트패널에 그리드를 나누는 배치관리자: 2행 1열
        setLayout(new GridLayout(2,1));

        //패널1,2 디자인
        panel1.setBackground(new Color(49, 137, 151));
        panel2.setBackground(Color.black);

        //버튼1~4 디자인
        button1.setBackground(new Color(65,23,0));
        button2.setBackground(new Color(65,23,0));
        button1.setForeground(Color.white);
        button2.setForeground(Color.white);
        button1.setSize(100,75);
        button2.setSize(100,75);

        button3.setBackground(Color.white);
        button4.setBackground(Color.white);

        //루트패널에 패널 삽입
        add(panel1);
        add(panel2);

        /*
        패널에 버튼을 삽입
        배치관리자를 설정하지 않았따면 기본 배치관리자가 세팅된다.
         */
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);
        panel2.add(button4);

       // 패널1 배치관리자 설정
//        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        /*
        panel1 <-- FlowLaout
        panel1 <-- null --> 컴포넌트 사이즈, 좌표값 ...
        null, flow
         */
        panel1.setLayout(null);
        button1.setLocation(30,0);
        button2.setLocation(160,0);

        //패널2 배치관리자 설정
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
    }

    //main - test code
    public static void main(String[] args) {

        MyPanelEx1 myPanelEx1 = new MyPanelEx1();

    }//end of main

}//end of class
