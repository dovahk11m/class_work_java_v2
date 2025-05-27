package _bubble.test04;

import javax.swing.*;

/**
 * 5.1
 * 플레이어 클래스 설계
 * Player 클래스가 컴포넌트로 들어가게 하려면
 * JLabel을 상속해줘야 한다.
 */
public class Player extends JLabel implements Movable {

    //멤버변수
    private int x;
    private int y;

    private ImageIcon playerR, playerL;
    //private ImageIcon playerL;

    //플레이어의 속도를 정의
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    //플레이어의 움직임 상태를 정의
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    //벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;

    //세터 setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
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

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
    }

    //게터 getter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMP_SPEED() {
        return JUMP_SPEED;
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

    public boolean isDown() {
        return down;
    }

    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }

    //생성자
    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");

        //플레이어 초기 상태 설정
        x = 55;
        y = 535;
        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {


        //라벨의 사이즈
        setSize(50, 50);

        //라벨의 아이콘을 바꿔주는 기능
        setIcon(playerR);

        //라벨의 위치를 지정
        setLocation(x, y);
    }

    @Override
    public void left() {

        left = true;

        setIcon(playerL);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {

                    x -= SPEED;

                    setLocation(x, y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }//while
            }//run()
        }).start(); //Thread()
    }//left()

    @Override
    public void right() {

        //움직임 상태 변경
        right = true;

        setIcon(playerR);

        //익명 클래스
        new Thread(new Runnable() {

            //thread.start() -> run() 메서드 안에 동작을 정의한다.
            @Override
            public void run() {
                while (right) {

                    x += SPEED;

                    setLocation(x,y);

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    //todo 종료하는 코드 넣기

                }//while
            }//run()
        }).start(); //Thread
    }//right

    @Override
    public void up() {
        System.out.println("점프");

        //움직임 상태 변경
        up = true;

        //익명클래스
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (130 / JUMP_SPEED); i++) {

                    y -= JUMP_SPEED;

                    setLocation(x, y);

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) { // 일단멈춤
                        throw new RuntimeException(e);
                    }
                }// for

                //상태값을 잘 다뤄야 버그가 없다.
                up = false;

                //down 호출
                down();

            }
        }).start();
    }//up

    @Override
    public void down() {

        down = true;

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < (130 / JUMP_SPEED); i++) {

                    y += JUMP_SPEED;

                    setLocation(x, y);

                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) { // 일단멈춤
                        throw new RuntimeException(e);
                    }
                }// for

                //상태값을 잘 다뤄야 버그가 없다.
                down = false;

            }
        }).start();

    }
}
