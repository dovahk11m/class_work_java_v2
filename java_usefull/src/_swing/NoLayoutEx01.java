package _swing;

import javax.swing.*;

/**
 * 4.28
 * 배치관리자 설정을 아무것도 안하면
 * 또는 null값을 세팅하면
 * 좌표 기준으로 배치할 수 있다.
 */
public class NoLayoutEx01 extends JFrame{

    //member
    private JButton button1;
    private JButton button2;
    private JButton button3;

    //constructor
    public NoLayoutEx01() {

        initData();
        setInitLayout();
    }

    //method
    private void initData() {
        setTitle("좌표값으로 버튼 배치하기");
        setSize(316,339);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    private void setInitLayout() {
        /*
        좌표 값으로 배치하려면
        반드시 null 값을 입력하자

        좌표값을 선택하려면
        먼저 컴포넌트의 사이즈를 결정해야 한다.

        그 다음
        배치관리자가 좌표값이기 때문에
        x,y 값을 지정해줘야 한다.
         */
        setLayout(null);

        button1.setSize(100,100);
        button2.setSize(100,100);
        button3.setSize(100,100);
        //setter 메서드

        button1.setLocation(0,0);
        button2.setLocation(100,100);
        button3.setLocation(200,200);

        //패널에 붙이기
        add(button1);
        add(button2);
        add(button3);
    }

    //main
    public static void main(String[] args) {

        new NoLayoutEx01();

    }//end of main

}//end of class
