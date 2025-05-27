package _bubble.test01;
/**
 * 5.1
 * 캐릭터가
 * 위아래왼쪽오른쪽으로 움직이는
 * 일종의 게임을 만든다.
 *
 * 캐릭터를 정의하는 클래스 Player
 * 동작을 정의하는 인터페이스 Movable
 * 을 먼저 설계하고
 *
 * 현재 클래스에서 상속/구현한다.
 *
 * 구조
 * ===== =====
 * 멤버변수
 * 생성자
 * 메서드
 * 메인
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
    }

    //메서드
    private void initData() {
        setTitle("버블게임");
        setSize(1000,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backgroundMap = new JLabel((new ImageIcon("img/backgroundMap.png")));
        //루트패널에 JLabel 넣기

        setContentPane((backgroundMap));

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

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                //조건문 switch
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:

                        //Player 클래스에 정의한 left() 메서드 호출
                        player.left();
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.right();
                        break;
                    case KeyEvent.VK_UP:
                        player.up();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    //메인 - 테스트코드
    public static void main(String[] args) {

        new BubbleFrame();

    }//end of main

}//end of class BubbleFrame
