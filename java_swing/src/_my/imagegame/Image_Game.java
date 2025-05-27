package _my.imagegame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 구조
 * =====
 * JFrame 상속/ KeyListener 구현
 * <p>
 * //변수
 * BufferImage (3), 내부클래스, 좌표변수, 플래그
 * <p>
 * //생성자 (3 + Thread)
 * <p>
 * //메서드 (3)
 * <p>
 * //오버라이드
 * KeyPressed
 * <p>
 * //내부클래스
 * JPanel 상속/ Runnable 구현
 * <p>
 * //내부클래스 오버라이드
 * paintComponent
 * run (While)
 * <p>
 * //메인
 */
public class Image_Game extends JFrame implements KeyListener, ActionListener {

    //멤버변수
    private JButton button;

    private BufferedImage backImg;
    private BufferedImage player1Img;
    private BufferedImage player2Img;

    private ImagePanel imagePanel;

    private int player1X = 400;
    private int player1Y = 50;

    private int player2X = 300;
    private int player2Y = 400;

    private boolean flag = true;

    //생성자
    public Image_Game() {
        initData();
        setInitLayout();
        addEventListener();
        addActionListener();

        Thread thread1 = new Thread(imagePanel);
        thread1.start();

    }

    //메서드
    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        button = new JButton("부활버튼");

        try {
            backImg = ImageIO.read(new File("images/background.png"));
            player1Img = ImageIO.read(new File("images/player1.png"));
            player2Img = ImageIO.read(new File("images/player2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel = new ImagePanel();

    }//initData

    private void setInitLayout() {

        add(button, BorderLayout.NORTH);

        add(imagePanel);

        setVisible(true);

        setFocusable(true);
        requestFocusInWindow();

    }//setInitLayout

    private void addEventListener() {

        addKeyListener(this);

    }//addEventListener

    private void addActionListener() {

        button.addActionListener(this);

    }


    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("키코드:" + e.getKeyCode());

        int keyNo = e.getKeyCode();

        if (keyNo == KeyEvent.VK_UP) {
            player1Y -= 10;
        } else if (keyNo == KeyEvent.VK_DOWN) {
            player1Y += 10;
        } else if (keyNo == KeyEvent.VK_LEFT) {
            player1X -= 10;
        } else if (keyNo == KeyEvent.VK_RIGHT) {
            player1X += 10;

        }

        repaint();

    }//keyPressed

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player1X = 250; player1Y = 250;

        try {
            player1Img = ImageIO.read(new File("images/player1.png"));
            requestFocusInWindow();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }


    //내부클래스
    private class ImagePanel extends JPanel implements Runnable {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(backImg, 0, 0, 1000, 600, null);
            g.drawImage(player1Img, player1X, player1Y, 100, 100, null);
            g.drawImage(player2Img, player2X, player2Y, 100, 100, null);
        }

        @Override
        public void run() {

            boolean direct = true;

            while (flag) {

                if (direct == true) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if (player2X >= 800) {
                    direct = false;
                }

                if (player2X <= 100) {
                    direct = true;
                }

                if ((Math.abs(player1X - player2X) <= 25) && (Math.abs(player1Y - player2Y) <= 25)) {
                    System.out.println("사망지점:"+player1X +","+player1Y);
                    player1Img = null;
                }

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                repaint();

            }//while
        }//run
    }//inner

    //메인
    public static void main(String[] args) {
        new Image_Game();
    }//end of main
}//end of GF
