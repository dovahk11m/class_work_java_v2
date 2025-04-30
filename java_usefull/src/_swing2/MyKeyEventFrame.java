package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * 4.29
 */
public class MyKeyEventFrame extends JFrame implements KeyListener {

    //member
    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    //constructor
    public MyKeyEventFrame() {

        initData();
        setInitLayout();
        addEventListener();
    }

    //method
    private void initData() {

        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //프레임 사이즈 고정

        textArea = new JTextArea();
    }

    private void setInitLayout() {

        setLayout(new BorderLayout());
        add(textArea);

        // 마지막에 실행
        setVisible(true);
    }

    private void addEventListener() {

        textArea.addKeyListener(this); //키보드 누르면 반응
    }

    //override
    @Override
    public void keyTyped(KeyEvent e) {} //🤷‍♂️

    @Override
    public void keyPressed(KeyEvent e) {} //🤷‍♂️

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("KeyCode: " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("위쪽 화살표 누름");

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("아래쪽 화살표 누름");

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("왼쪽 화살표 누름");

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("오른쪽 화살표 누름");

        }
    }//keyReleased

    //main - test code
    public static void main(String[] args) {

        new MyKeyEventFrame();

    }//end of main
}//end of class
