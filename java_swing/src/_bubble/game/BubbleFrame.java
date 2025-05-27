package _bubble.game;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class BubbleFrame extends JFrame {
    /*
    5.12
    mContext 선언
    자기 자신의 주소값을 담는다.
    .. 나중에 Spring을 배우면서 이해가 깊어지게 된다.
     */
    BubbleFrame mContext = this;

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();
        new Thread(new BackgroundPlayerService(player)).start();
    }

    private void initData() {
        setTitle("버블게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel((new ImageIcon("img/backgroundMapService.png")));
        setContentPane(backgroundMap);

        //5.12 수정
        player = new Player(mContext);
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
                        if (player.isLeft() == false && player.isLeftWallCrash() == false) {
                            System.out.println("좌측 버튼 가동");
                            player.left();
                        }
                        break;

                    case KeyEvent.VK_RIGHT:
                        if (player.isRight() == false && player.isRightWallCrash() == false) {
                            System.out.println("우측 버튼 가동");
                            player.right();
                        }
                        break;

                    case KeyEvent.VK_UP:
                        if (player.isUp() == false && player.isDown() == false) {
                            System.out.println("점프 버튼 가동");
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

                    case KeyEvent.VK_SPACE:
                        player.attack();
                        break;
                }//switch 조건문
            }//keyReleased 오버라이드
        });//메소드안에 익명클래스
    }//addEventListener 메소드

    public static void main(String[] args) {
        /*
        5.12
        BubbleFrame
        이 하위에 생성되는 모든 객체들의 주소값에 접근할 수 있다.

        ⭐메인함수를 가질 수 있는 클래스는
        Context라는 개념이 생길 수 있다.
         */
        new BubbleFrame();
    }//end of main
}//end of class BubbleFrame
