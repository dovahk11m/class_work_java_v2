package _my._swing;

import _swing2.MyKeyEventFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class _KeyEvent extends JFrame implements KeyListener {
    //Jframe 상속, KeyListener 구현

    //멤버변수
    private JTextArea textArea;
    private final int SIZE = 500;

    //생성자
    public _KeyEvent() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //initData
    private void initData() {
        setSize(SIZE, SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        textArea = new JTextArea();
    }

    //setInitLayout
    private void setInitLayout() {
        setLayout(new BorderLayout());

        add(textArea);

        setVisible(true);
    }

    //addEventListener
    private void addEventListener() {
        textArea.addKeyListener(this);
    }

    //override
    @Override
    public void keyTyped(KeyEvent e) {}//🤷‍♂️

    @Override
    public void keyPressed(KeyEvent e) {}//🤷‍♂️

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode()==KeyEvent.VK_UP) {
            System.out.println("위쪽 화살표 누름");

        } else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
            System.out.println("아래쪽 화살표 누름");

        } else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            System.out.println("왼쪽 화살표 누름");

        } else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            System.out.println("오른쪽 화살표 누름");

        }

    }

    //Main
    public static void main(String[] args) {

        new MyKeyEventFrame();

    }//end of main

}
