package com.my.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.23
 * 스윙 라이브러리 연습
 */
public class SwingTest extends JFrame {

    //member
    //array
    static JButton[] buttons = new JButton[3];

    //constructor
    public SwingTest() {
        super.setTitle("스윙테스트");
        super.setSize(900,300);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initD();
        setInitD();

    }

    //method
    public void initD() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼");
        }
    }

    public void setInitD() {
        super.setLayout(new FlowLayout());
        for (int i = 0; i < buttons.length; i++) {
            super.add(buttons[i]);
        }
    }

    //main - 코드테스트
    public static void main(String[] args) {

        SwingTest swingTest = new SwingTest();

    }//end of main

}//end of swingtest
