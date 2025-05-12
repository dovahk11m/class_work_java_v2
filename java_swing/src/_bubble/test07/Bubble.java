package _bubble.test07;

import javax.swing.*;

/**
 * ⭐물방울은 객체가 돼야해
 * 프레임에 컴퍼넌트로 들어와야 해
 * = JLabel로 만들어본다.
 * <p>
 * 🤔물방울의 움직임 정의
 * 발사
 * 1.스페이스 키를 누르면 발사된다.
 * 2.플레이어 위치값에서 발사된다.
 * 3.플레이어 방향과 동일한 방향으로 발사된다.
 * <p>
 * 움직임
 * 1.수평으로 움직인다.
 * 2.일정 위치에 도달하면 위로 올라간다
 * 3.벽에 막혀도 위로 올라간다.
 * <p>
 * ⭐좌표, 이미지, 제어변수, player좌표
 */

public class Bubble extends JLabel implements Movable {

    //물방울의 좌표 변수
    private int x;
    private int y;

    //물방울 이미지 변수
    private ImageIcon bubble;
    private ImageIcon bomb; // 터졌을때

    //물방울 움직임 상태를 나타내는 제어변수
    private boolean left;
    private boolean right;
    private boolean up;

    //
    private boolean isLeft;
    private boolean isRight;

    //Player 클래스 변수
    private Player player;
    private BackgroundBubbleService backgroundBubbleService;

    //생성자
    public Bubble(Player player) {
        //Player 객체의 주소값을 주입받는다 = 생성자 의존 주입
        this.player = player;
        this.backgroundBubbleService = new BackgroundBubbleService(this);

        initData();
        setInitLayout();
        bubbleStartThread();

    }//constructor

    //메서드 - 버블 발사 전용
    private void bubbleStartThread() {

        //쓰레드 생성
        new Thread(new Runnable() {
            @Override
            public void run() {

                if (player.getPlayerWay() == PlayerWay.LEFT) {
                    left();
                } else {
                    right();
                }

            }//run
        }).start();
    }//bubbleStartThread

    //메서드 - 요소생성
    private void initData() {

        bubble = new ImageIcon("img/bubble.png");
        bomb = new ImageIcon("img/bomb.png");

        //초기상태
        left = false;
        right = false;
        up = false;


    }//initData

    private void setInitLayout() {

        //setInitLayout 메서드 호출시 플레이어 좌표 초기화
        x = player.getX();
        y = player.getY();

        setIcon(bubble);

        setSize(50, 50);

        //위치는 player 좌표
        setLocation(x, y);


    }//setInitLayout

        @Override
        public void left() {

    //        new Thread().start(); 여기서는 쓰레드를 활용하지 않는다

            left = true;

            for (int i = 0; i < 400; i++) {

                x--;
                setLocation(x, y);

                if (backgroundBubbleService.leftWall()) {
                    //왼쪽벽일때
                    break;
                }

                try {
                    Thread.sleep(1); //메인쓰레드가 수행
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }//for

            up(); //수평이동을 마친 뒤 위로 올라간다

        }//left

    @Override
    public void right() {

        right = true;

        for (int i = 0; i < 400; i++) {

            x++;

            /*
            좌표 오른쪽으로 1 움직였다.
            오른쪽 벽인지 매번 확인하는 구문을 넣어보자
             */

            setLocation(x, y);

            if (backgroundBubbleService.rightWall()) {
                //오른쪽벽일때
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }//for

        up(); //수평이동을 마친 뒤 위로 올라간다

    }//right

    @Override
    public void up() {

        up = true;

        while (true) {

            y--;
            setLocation(x, y);

            if (backgroundBubbleService.ceilingBlue()) {
                //파란천장일때
                break;
            }
            if (backgroundBubbleService.ceilingRed()) {
                //빨간천장일때
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }//while

        //3초 뒤에 이미지를 변경한다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setIcon(bomb);

        //0.5초 뒤에 이미지를 없앤다.
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setIcon(null);

    }//up

    //게터 getter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public Player getPlayer() {
        return player;
    }

    //세터 setter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}//end of Buble
