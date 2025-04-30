package com.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.23 4강 스윙
 * <p>
 * 자바 표준 라이브러리를 활용하여
 * GUI 화면을 만들어보자
 * <p>
 * 화면을 구성할때
 * 배치관리자 layout 라는 개념이 있다.
 * <p>
 * 버튼, 라벨, 텍스트 이런 각각의 요소 Component 들을
 * 배치해주는 기능이다.
 */
public class FlowLayoutEx extends JFrame {

    private JButton button1; //참조타입
    private JButton button2;
    private JButton button3;


    //constructor
    public FlowLayoutEx() {
        super.setTitle("배치관리자 연습 - FlowLayout");
        super.setSize(500,500);
        super.setVisible(true); //화면에 보이게 하는 기능
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스태틱 변수

        //생성자 안에서 다른 메서드를 호출할 수 있다.
        initData();
        setInitLayout();
    }

    //method
    public void initData() { //초기화 메서드
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("버튼");
    }

    public void setInitLayout() {
        /*
        배치관리자 중
        FlowLayout, BorderLayout, null..좌표기반
        FlowLayout은
        컴포넌트들을 수평, 수직으로 배치하는 객체다.
         */

        super.setLayout(new FlowLayout());
        //add는 컴포넌트를 패널에 붙이다.
        super.add(button1);
        super.add(button2);
        super.add(button3);
    }

    //main - 코드테스트
    public static void main(String[] args) {

        FlowLayoutEx flowLayoutEx = new FlowLayoutEx();

    }//end of main

}//end of FLE
