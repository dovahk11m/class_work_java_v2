package _lotto.ch01;
/**
 * 4.30
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    /*
    요청사항
    보더레이아웃
    위쪽에 타이틀
    패널
     */

    //member
    private JButton button;

    //constructor
    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //method
    private void initData() {
        setTitle("로또게임");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("게임시작");
    }

    private void setInitLayout() {
        add(button, BorderLayout.NORTH);

        setVisible(true); //마지막에 실행
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("그림을 그려라");
    }

    //main
    public static void main(String[] args) {

        new LottoFrame();

    }//end of main
}//end of class
