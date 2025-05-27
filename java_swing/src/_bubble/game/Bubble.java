package _bubble.game;
import lombok.Getter;
import lombok.Setter;
import javax.swing.*;
@Getter
@Setter
public class Bubble extends JLabel implements Movable {

    private int x;
    private int y;

    private ImageIcon bubble;
    private ImageIcon bomb; // 터졌을때

    private boolean left;
    private boolean right;
    private boolean up;

    private boolean isLeft;
    private boolean isRight;

    private Player player;
    private BackgroundBubbleService backgroundBubbleService;

    //생성자
    public Bubble(Player player) {
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
}//end of Buble
