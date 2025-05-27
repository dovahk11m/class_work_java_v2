package _my.imagegame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image_Game2 extends JFrame implements ActionListener {

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
    public Image_Game2() {
        initData();
        setInitLayout();
        addActionListener();
        initKeyBindings();

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

    }//setInitLayout

    private void addActionListener() {

        button.addActionListener(this);

    }//addActionListener

    private void initKeyBindings() {
        InputMap inputMap = imagePanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = imagePanel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("UP"), "moveUp");
        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");

        actionMap.put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1Y -= 10;
                repaint();
            }
        });

        actionMap.put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1Y += 10;
                repaint();
            }
        });

        actionMap.put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1X -= 10;
                repaint();
            }
        });

        actionMap.put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1X += 10;
                repaint();
            }
        });
    }//initKeyBindings

    @Override
    public void actionPerformed(ActionEvent e) {

        player1X = 250; player1Y = 250;

        try {
            player1Img = ImageIO.read(new File("images/player1.png"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }//actionPerformed

    //내부클래스
    private class ImagePanel extends JPanel implements Runnable {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawImage(backImg, 0, 0, 1000, 600, null);
            g.drawImage(player1Img, player1X, player1Y, 100, 100, null);
            g.drawImage(player2Img, player2X, player2Y, 100, 100, null);
        }//paintComponent

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
        new Image_Game2();
    }//end of main
}//end of GF
