package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 4.29
 * 버튼을 눌러 색깔을 바꿔보자
 */
public class ColarChangeFrame2 extends JFrame implements ActionListener {

    //member
    private JButton button1;
    private JButton button2;

    private JPanel panel1;

    //cons
    public ColarChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //meth
    private void initData() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();

        button1 = new JButton("검정");
        button2 = new JButton("노랑");
    }

    private void setInitLayout() {
        setLayout(new BorderLayout());

        panel1.setBackground(Color.YELLOW);
        add(panel1, BorderLayout.CENTER);

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);

        //젤 마지막
        setVisible(true);
    }

    /*
    모든 수식을 생성자에 때려박을 수도 있다.
    특정부분을 분리해서 짜두면
    나중에 고칠때 편할 수 있다.

    addEventListener
    이 메서드의 역할은
    이벤트 리스너만을 등록 처리하는 것이다.
     */
    private void addEventListener() {

        button1.addActionListener(this); // 다형성
        button2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());

        /*
        e.getSource를
        JButton으로 다운캐스팅
         */
        JButton selectedButton = (JButton)e.getSource();

        System.out.println(selectedButton);
        System.out.println(selectedButton.getText());

        //같은 객체의 주소값을 비교
        if (selectedButton == button1) {

            panel1.setBackground(Color.BLACK);

            //같은 객체의 문자열을 비교
        } else if (selectedButton.getText().equals(button2.getText())) {

            panel1.setBackground(Color.YELLOW);
        }

    }

    //main
    public static void main(String[] args) {
        ColarChangeFrame2 colarChangeFrame2 = new ColarChangeFrame2();
    }//end of main
}//end of class
