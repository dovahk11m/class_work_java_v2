package _lotto.ch02;
/**
 * 4.30
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    //member
    private int testNumber = 45;

    private JButton button;

    private LottoRandomNumber lottoRandomNumber1;

    private int[] result = new int[6];

    //constructor
    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //method
    private void initData() {
        setTitle("로또게임");
        setSize(360, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        button = new JButton("게임시작");

        lottoRandomNumber1 = new LottoRandomNumber();
    }

    private void setInitLayout() {
//        add(button, BorderLayout.NORTH);
        setLayout(new FlowLayout());

        add(button);

        setVisible(true); //마지막에 실행
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("그림을 그려라");

        result = lottoRandomNumber1.creatNumber();

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("궁서체", Font.BOLD, 25);

        g.setFont(f);

        g.drawString(result[0] + " ", 50, 100);
        g.drawString(result[1] + " ", 100, 100);
        g.drawString(result[2] + " ", 150, 100);
        g.drawString(result[3] + " ", 200, 100);
        g.drawString(result[4] + " ", 250, 100);
        g.drawString(result[5] + " ", 300, 100);
    }

    //main
    public static void main(String[] args) {

        new LottoFrame();

    }//end of main
}//end of class
