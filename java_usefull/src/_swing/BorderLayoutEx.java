package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.28
 * 화면과 관련된 작업을 할때
 * 배치관리자 Layout을 이해해야 한다.
 * Component 들을 어떻게 배치할 것인지
 */
public class BorderLayoutEx extends JFrame {

    //member
    JButton[] buttons;
    String[] directions = {BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER,
            BorderLayout.NORTH, BorderLayout.SOUTH};

    //constructor
    public BorderLayoutEx() {
        setTitle("borderLayout 연습");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData(); // 1번
        setInitLayout();// 2번 서순 주의
    }

    //method
    private void initData() {
        buttons = new JButton[5];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
//        buttons[0] = new JButton("button1");
//        buttons[1] = new JButton("button2");
//        buttons[2] = new JButton("button3");
//        buttons[3] = new JButton("button4");
//        buttons[4] = new JButton("button5");
    }

    private void setInitLayout() {
        /*
        배치관리자 개념중에
        보더레이아웃이라는 개념이 있다.
        BorderLayout은 컴포넌트를
        동서남북 가운데로 배치하는 레이아웃이다.
         */
        setLayout(new BorderLayout());
        /*
        프레임 (패널)
        우리가 생성한 JButton 객체를
        프레임에 붙인다.
         */

        for (int i = 0; i < 5; i++) {
            add(buttons[i], directions[i]);
        }
//        add(buttons[0], {BorderLayout.WEST);
//        add(buttons[1], {BorderLayout.EAST);
//        add(buttons[2], {BorderLayout.CENTER);
//        add(buttons[3], {BorderLayout.NORTH);
//        add(buttons[4], {BorderLayout.SOUTH);
    }

    //main thread - 테스트 코드 작성
    public static void main(String[] args) {

        BorderLayoutEx borderLayoutEx = new BorderLayoutEx();

    }//end of main

}//end of class
