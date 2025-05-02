package _bubble.test01;

import javax.swing.*;

/**
 * 5.1
 * 플레이어 클래스 설계
 * Player 클래스가 컴포넌트로 들어가게 하려면
 * JLabel을 상속해줘야 한다.
 */
public class Player extends JLabel implements Movable{

    //멤버변수
    private int x;
    private int y;

    private ImageIcon playerR, playerL;
    //private ImageIcon playerL;

    //생성자
    public Player() {
        initData();
        setInitLayout();
    }

    //메서드
    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
    }

    private void setInitLayout() {
        //좌표값이 있어야 화면에 표시될 수 있다.
        x = 55;
        y = 535;

        //라벨의 사이즈
        setSize(50, 50);

        //라벨의 아이콘을 바꿔주는 기능
        setIcon(playerR);

        //라벨의 위치를 지정
        setLocation(x, y);
    }

    @Override
    public void left() {
        System.out.println("player left() 메서드 호출");
    }

    @Override
    public void right() {
        System.out.println("player right() 메서드 호출");
    }

    @Override
    public void up() {
        System.out.println("player up() 메서드 호출");
    }

    @Override
    public void down() {
    }
}//Player
