package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 4.28
 * 배치관리자 FlowLayout
 * 컴포넌트들을 수평, 수직으로 배치
 */
public class MyComponents extends JFrame {

    //member - 가장 많이 쓰이는 기능들
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    //constructor
    public MyComponents() {

        initData();
        setInitLayout();
    }

    //method
    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button = new JButton("JButton");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디를 입력하세요", 30);
        passwordField = new JPasswordField("비밀번호를 입력하세요", 40);
        checkBox = new JCheckBox("동의");

    }
    // JFrame 의 배치관리자를 결정해주는 메서드 (레이아웃)
    private void setInitLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT,30,30));

        //프레임에 붙여넣기
        add(button);
        add(label);
        add(textField);
        add(passwordField);
        add(checkBox);
    }

    //main thread - 테스트 코드 작성
    public static void main(String[] args) {

        MyComponents myComponents = new MyComponents();

    }//end of main

}//end of class
