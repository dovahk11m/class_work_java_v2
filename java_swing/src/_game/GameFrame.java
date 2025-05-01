package _game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    //변수
    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private BufferedImage player2;

    private ImagePanel imagePanel;

    private int playerX = 200;
    private int playerY = 300;

    private int player2X = 100;
    private int player2Y = 300;

    private boolean flag = true;

    //생성자
    public GameFrame() {
        initDate();
        setInitLayout();
        addEventListener();

        //메인작업자가 서브작업자를 생성
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
        //imagePanel 안에 구현한 run() 메서드가 시작된다.
    }

    //메서드
    private void initDate() {
        setSize(1000, 600);
        setDefaultCloseOperation(3);
        setResizable(false);

        try {
            backgroundImage = ImageIO.read(new File("images/background.png"));
            player1 = ImageIO.read(new File("images/player1.png"));
            player2 = ImageIO.read(new File("images/player2.png"));

            //TODO player 이미지도 올려야 함
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel = new ImagePanel();

    }//initDate

    private void setInitLayout() {

        add(imagePanel);

        setVisible(true);

    }//setInitLayout

    private void addEventListener() {

        /*
        keyListener는 인터페이스다.

        자바 문법에서는
        인터페이스나 추상클래스를
        구현클래스, 즉 객체로 사용하는 문법을 제공한다.

        new KeyListener() {
        추상 메서드를 구현 메서드로 오버라이드}
         */

        addKeyListener(this);
        /*
        JFrame 자체에
        KeyEventListener를 등록한다.
         */
    }//addEventListener

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }//keyReleased

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("키 코드: " + e.getKeyCode());

        //TODO 화살표만 추출해 낼 예정

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP) {
            playerY -= 10;
        } else if (code == KeyEvent.VK_DOWN) {
            playerY += 10;
        } else if (code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        } else if (code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }

        //리페인트
        repaint();

    }//keyPressed



    //내부클래스
    private class ImagePanel extends JPanel implements Runnable {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, 50, 50, null);
            g.drawImage(player2, player2X, player2Y, 50, 50, null);
        }

        @Override
        public void run() {
            //서브작업자가 해야하는 일을 명시하도록 약속돼 있다.

            boolean direction = false;
            //direction true 오른쪽, false 왼쪽

            while (flag) {

                if (direction == true) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if (player2X >= 800) {
                    direction = false;
                }

                if (player2X <= 100) {
                    direction = true;
                }

                if (Math.abs(playerX - player2X) < 25 && Math.abs(playerY - player2Y) < 25) {
                    player1 = null;
                    System.out.println(playerX+ "," + playerY);
                    System.out.println(player2X + "," + player2Y);
                }

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                repaint();

            }//end of while

        }//run

    }//end of inner class

    //메인
    public static void main(String[] args) {

        new GameFrame();

    }//end of main

}//end of outer class
