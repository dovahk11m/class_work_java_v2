package _my._swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 4.29
 * 무지개버튼 만들어보기
 */
public class Rainbow extends JFrame implements ActionListener {

    //member
    private JButton[] buttons = new JButton[7];

    private String[] colors = {"빨","주","노","초","파","남","보"};

    //constructor
    public Rainbow() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //method
    private void initData() {
        setSize(365,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(colors[i]);
        }
    }

    private void setInitLayout() {

        setLayout(null);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setLocation(i*50, 0);
            buttons[i].setSize(50, 50);
            add(buttons[i]);
        }

        //마지막
        setVisible(true);
    }

    private void addEventListener() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton selecB = (JButton)e.getSource();

        if (selecB == buttons[0]) {
            getContentPane().setBackground(Color.RED);
        } else if (selecB == buttons[1]) {
            getContentPane().setBackground(Color.ORANGE);
        } else if (selecB == buttons[2]) {
            getContentPane().setBackground(Color.YELLOW);
        } else if (selecB == buttons[3]) {
            getContentPane().setBackground(Color.GREEN);
        } else if (selecB == buttons[4]) {
            getContentPane().setBackground(Color.BLUE);
        } else if (selecB == buttons[5]) {
            getContentPane().setBackground(new Color(8,37,103));
        } else if (selecB == buttons[6]) {
            getContentPane().setBackground(new Color(109,0,255));
        }
    }

    //main
    public static void main(String[] args) {

        new Rainbow();

    }//end of main
}//end of class
