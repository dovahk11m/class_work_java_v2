package _bubble.test04;

import javax.swing.*;

/**
 * 5.2
 * 물방울은 객체가 돼야해
 * 프레임에 컴퍼넌트로 들어와야 해
 * <p>
 * JLabel로 만들어본다.
 * <p>
 * 물방울의 움직임 정의
 * 1.스페이스 키를 누르면 발사된다.
 * 1.플레이어 위치값에서 발사된다.
 * 2.플레이어 방향과 동일한 방향으로 발사된다.
 * 3.수평으로 움직인다.
 * 4.일정 위치에 도달하면 위로 올라간다
 * 5.벽에 막혀도 위로 올라간다.
 */
public class Bubble extends JLabel {

    //물방울의 좌표 변수
    private int x;
    private int y;

    //기본 물방울 이미지 변수
    private ImageIcon bubble;

    //물방울 움직임 상태를 나타내는 제어변수
    private boolean left;
    private boolean right;
    private boolean up;

    //Player 클래스 변수
    private Player player;

    // ===== ===== =====
    //생성자
    public Bubble(Player player) {
        //Player 객체의 주소값을 주입받는다 = 생성자 의존 주입
        this.player = player;

        initData();
        setInitLayout();

    }

    //메서드 - 요소생성
    private void initData() {
        bubble = new ImageIcon("img/bubble.png");

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
