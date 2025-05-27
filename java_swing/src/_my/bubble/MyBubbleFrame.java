package _my.bubble;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyBubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private MyPlayer player;

    public MyBubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();
        new Thread(new MyPlayerThread(player)).start();
    }

    private void initData() {
        setTitle("버블게임");
        setSize(1000, 640);
        setDefaultCloseOperation(3);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMapService.png"));
        setContentPane(backgroundMap);
        player = new MyPlayer();
    }

    private void setInitLayout() {
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        add(player);
        setVisible(true);
    }

    private void addEventListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (!player.isLeft() && !player.isLeftWallCrash()) {
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (!player.isRight() && !player.isRightWallCrash()) {
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (!player.isUp() && !player.isDown()) {
                            player.up();
                        }
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        break;
                    //TODO space 눌렀을시 버블 발사
                }
            }
        });
    }
    public static void main(String[] args) {
        new MyBubbleFrame();
    }//main
}//class
