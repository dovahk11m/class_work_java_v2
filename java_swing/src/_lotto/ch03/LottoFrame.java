package _lotto.ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    //member
    private static final String INITIAL_MESSAGE = "로또 번호 생성";
    private static final String FONT_NAME = "명조";
    private static final int FONT_SIZE = 20;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;

    private boolean isInitState = true; // 초기상태 플래그

    private int[] currentNo;

    //constructor
    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //method
    private void initData() {
        setTitle("로또게임");
        setSize(360, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        button = new JButton("게임시작");

        lottoRandomNumber = new LottoRandomNumber();

        currentNo = new int[LottoRandomNumber.LOTTO_NUMBER_COUNT];
    }

    private void setInitLayout() {
        setLayout(new BorderLayout()); //기본 배치관리자

        add(button, BorderLayout.NORTH);

        setVisible(true); //마지막에 실행
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        isInitState = false;

        currentNo = lottoRandomNumber.creatNumber();

        repaint();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));

        if (isInitState) {
            g.drawString(INITIAL_MESSAGE, 100, 100);
        } else {

            for (int i = 0; i < currentNo.length; i++) {
                g.drawString(currentNo[i] + " ", (i + 1) * 50, 100);

            }//for

        }//if

    }//paint

    //main
    public static void main(String[] args) {

        new LottoFrame();

    }//end of main
}//end of class
