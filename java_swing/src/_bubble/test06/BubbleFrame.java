package _bubble.test06;
/**
 * 5.2
 * 오늘은 물방울을 발사할거야
 * <p>
 * 물방울은 객체가 돼야해
 * 프레임에 컴퍼넌트로 들어와야 해
 * <p>
 * JLabel로 만들어본다.
 */

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {

    //멤버변수
    private JLabel backgroundMap;
    private Player player;

    //생성자
    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();

        new Thread(new BackgroundPlayerService(player)).start();
    }

    //메서드
    private void initData() {
        setTitle("버블게임");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backgroundMap = new JLabel((new ImageIcon("img/backgroundMap.png")));
        //루트패널에 JLabel 넣기

        setContentPane(backgroundMap);

        player = new Player();
    }

    private void setInitLayout() {
        //좌표기준 (절대 레이아웃 Absolute Layout)
        setLayout(null);

        //사이즈 조절 금지
        setResizable(false);

        //루트패널을 화면 가운데 배치해준다.
        setLocationRelativeTo(null);

        //todo player add() 처리하기
        add(player);

        //맨 마지막
        setVisible(true);
    }

    /*
    키보드 동작은
    라벨보다는
    프레임이 받는 것이 좋다.
     */
    private void addEventListener() {

        //프레임에 키보드 이벤트 리스너 등록 처리
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            //키를 누르고 있을 때 이벤트 발생
            @Override
            public void keyPressed(KeyEvent e) {
//                System.out.println(e.getKeyCode() + "입력");

                //조건문 switch
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:

                        //Player 클래스에 정의한 left() 메서드 호출
//                        player.left();

                        if (player.isLeft() == false && player.isLeftWallCrash() == false) {
                            System.out.println("좌측 버튼 가동");
                            player.left();
                        }

                        break;

                    case KeyEvent.VK_RIGHT:
                        /*
                        만약 오른쪽으로 가는 상태가 아니었다면 right() 수행해
                        만약 오른쪽으로 가고 있었다면 right() 수행하지마
                         */
                        if (player.isRight() == false && player.isRightWallCrash() == false) {
                            System.out.println("우측 버튼 가동");
                            player.right();
                        }

                        break;

                    case KeyEvent.VK_UP:
                        /*
                        만약 점프 상태가 아니었다면 up() 수행해
                        만약 낙하 상태가 아니었다면 up() 수행해
                         */
                        if (player.isUp() == false && player.isDown() == false) {
                            System.out.println("점프 버튼 가동");
                            player.up();
                        }

                        break;
                }
            }

            //키보드에서 손을 뗐을 때 이벤트 발생
            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println(e.getKeyCode() + "해제");

                //조건문 switch
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:

                        //손을 떼면 움직임을 멈추도록 플래그 변경
                        player.setLeft(false);
                        break;

                    case KeyEvent.VK_RIGHT:

                        //손을 떼면 움직임을 멈추도록 플래그 변경
                        player.setRight(false);
                        break;

                    case KeyEvent.VK_UP:

                        break;

                    case KeyEvent.VK_SPACE:
                        add(new Bubble(player));

                        break;
                }//switch 조건문

            }//keyReleased 오버라이드

        });//메소드안에 익명클래스

    }//addEventListener 메소드

    //메인 - 테스트코드
    public static void main(String[] args) {

        new BubbleFrame();

    }//end of main

}//end of class BubbleFrame
