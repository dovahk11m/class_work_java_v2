package _my.lottery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class LottoMachine extends JFrame implements ActionListener {

    /*
    구조
    ----- ----- -----
    JFrame 상속 ActionListener 구현

    멤버변수
    JButton
    배열

    생성자

    메서드
    makeNo(난수생성)

    initData
    setInitLayout
    addActionListener

    오버라이드
    action Performed
    paint

    메인
     */

    //멤버변수
    private JButton button;

    private boolean isInitState = true;

    private int[] currentNo;

    //생성자
    public LottoMachine() {

        initData();
        setInintLayout();
        addActionListener();

    }

    //메서드 - makeNo
    public int[] makeNo() {

        int[] lottoNo = new int[6];
        Random ran = new Random();

        for (int i = 0; i < 6; i++) {

            lottoNo[i] = ran.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {

                if (lottoNo[i] == lottoNo[j]) {

                    i--; //중복 제거

                }//if

            }//inner

        }//outer
        Arrays.sort(lottoNo);

        return lottoNo;
    }//makeNo

    private void initData() {

        setTitle("로또머신");
        setSize(360, 150);
        setDefaultCloseOperation(3);
        setResizable(false);

        button = new JButton("게임시작");
        currentNo = new int[6];
    }

    private void setInintLayout() {

        add(button, BorderLayout.NORTH);

        setVisible(true);
    }

    private void addActionListener() {

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        isInitState = false;

        currentNo = makeNo();

        repaint();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.setFont(new Font("궁서체", Font.BOLD, 30));

        if (isInitState) {

            g.drawString("로또번호생성", 100, 100);

        } else {

            for (int i = 0; i < 6; i++) {

                g.drawString(currentNo[i] + " ", (i+1)*50, 100);

            }//for

        }//if

    }//paint

    //메인
    public static void main(String[] args) {

        new LottoMachine();

    }

}//end of class LM
