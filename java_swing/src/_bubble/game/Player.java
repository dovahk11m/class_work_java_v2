package _bubble.game;
import lombok.Getter;
import lombok.Setter;
import javax.swing.*;
@Getter
@Setter
public class Player extends JLabel implements Movable {

    /*
    컨텍스트는 매우 중요한 개념

    주소값을 불러오기 위한 변수 선언
     */
    private BubbleFrame mContext;

    private int x;
    private int y;

    private ImageIcon playerR, playerL;

    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private boolean leftWallCrash;
    private boolean rightWallCrash;

    private PlayerWay playerWay;

    /*
    5.12
    생성자가 호출될때
    나를 생성시켜주는 BubbleFrame의 주소값을 전달받을 수 있도록 설계한다.

    이를 컨텍스트라고 부른다.
    이는 문맥, 환경정보를 의미한다.
     */
    public Player(BubbleFrame mContext) {
        this.mContext = mContext;

        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");

        x = 55;
        y = 535;
        left = false;
        right = false;
        up = false;
        down = false;

    }//initData

    private void setInitLayout() {
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }//setInitLayout

    @Override
    public void left() {

        playerWay = PlayerWay.LEFT;

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
        playerWay = PlayerWay.RIGHT;
        right = true;
        setIcon(playerR);
        new Thread(new Runnable() {
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
                }//while
            }//run()
        }).start(); //Thread
    }//right

    @Override
    public void up() {
        System.out.println("점프");
        up = true;
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
                up = false;
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
                while (down) {
                    y += JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }//while
                down = false;
            }
        }).start();
    }//down

    public void attack() {
        System.out.println("물방울 객체 생성");

//        add(new Bubble(this)); //JLabel의 부모 add() 호출
        // BubbleFrame에 add(new Bubble(this));

        /*
        5.12
        player가 bubble 생성하도록 하고 싶은데..
        부모 BubbleFrame 호출해야되는 문제

        1. 콜백 메서드를 설계한다.

        2. 자식클래스에서 부모클래스의 주소값을 전달받도록 한다.
        이를 통해 부모클래스의 메서드를 호출한다.

        부모클래스 기능.add() 가 가능해진다.
         */
        mContext.add(new Bubble(this));
    }
}//end of Player
