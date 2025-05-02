package _my.bubble;

import javax.swing.*;

/**
 ⭐물방울은 객체가 돼야해
 프레임에 컴퍼넌트로 들어와야 해
 = JLabel로 만들어본다.

 🤔물방울의 움직임 정의
 발사
 1.스페이스 키를 누르면 발사된다.
 2.플레이어 위치값에서 발사된다.
 3.플레이어 방향과 동일한 방향으로 발사된다.

 움직임
 1.수평으로 움직인다.
 2.일정 위치에 도달하면 위로 올라간다
 3.벽에 막혀도 위로 올라간다.

 ⭐좌표, 이미지, 제어변수, player좌표

 */
public class Bubble extends JLabel {//JLabel 상속

    //물방울의 좌표 변수
    private int x;
    private int y;

    //물방울 이미지 변수
    private ImageIcon bubble;

    //움직임 상태 제어변수
    private boolean left;
    private boolean right;
    private boolean up;

    //Player 좌표를 받아오기 위한 클래스변수
    private Player player;

    //생성자
    public Bubble(Player player) {
        //Player 객체의 주소값을 주입받는다 = 생성자 의존주입

        initData();
        setInitLayout();
    }

    //메서드 - 요소생성
    private void initData() {

        //버블 이미지아이콘 생성
        bubble = new ImageIcon("img/bubble.png");

        //움직임의 초기상태
        left = false;
        right = false;
        up = false;
    }

    //메서드 - 디자인
    private void setInitLayout() {

        //메서드 호출시 player 좌표 확인
        x = player.getX();
        y = player.getY();

        //Bubble 레이블에 덮어씌울 이미지 지정
        setIcon(bubble);
        //Bubble 레이블의 크기 지정
        setSize(50,50);

        //Bubble 레이블 초기 위치 = player
        setLocation(x,y);

    }

    //게터
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

    //세터
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

}//end of Bubble
