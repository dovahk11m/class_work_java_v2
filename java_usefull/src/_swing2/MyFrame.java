package _swing2;

import javax.swing.*;

/**
 * 4.29
 * ⭐JLabel 이용해
 * 이미지를 다뤄본다.
 *
 * Jlabel.add() 메서드를 이용하면 이미지를 겹칠 수 있다.
 * 좌표 기준으로 배치관리자를 세팅하려면
 * null 값을 세팅해야 한다.
 *
 * 💀이너클래스를 만들지 않고
 * JLabel을 이용해 이미지를 그리면
 * 이미지 사이즈를 조절할 수 없다.
 *
 * 👍미리 조절된 이미지를 사용해야 한다.
 *
 */
public class MyFrame extends JFrame {

    //member
    private JLabel backgroundMap;
    private JLabel player;

    //constructor
    public MyFrame() {

        initData();
        setinitLayout();
    }

    //method
    private void initData() {
        setTitle("JLabel을 이용한 이미지 사용 연습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon1 = new ImageIcon("images/background.png");
        ImageIcon playerIcon1 = new ImageIcon("images/player1.png");

        //JLabel
        backgroundMap = new JLabel(backgroundIcon1);
        player = new JLabel(playerIcon1);

        backgroundMap.setSize(500,500);
        backgroundMap.setLocation(0,0);

        player.setSize(100,100);
        player.setLocation(200,200);

        //가장 마지막에 실행
        setVisible(true);
    }

    private void setinitLayout() {

        /*
        좌표기반으로 세팅하기 위해 널값을 줬다.
        💀이때는 컴포넌트의 크기를 일일히 지정해줘야 한다.
         */
        setLayout(null);

        //루트 패널에 붙이기
        add(player);
        add(backgroundMap);
        /*
        💀서순
        먼저 쓴 놈이 젤 위에 나온다.
         */
    }

    //inner(🤷‍♂️)

    //main - 테스트 코드 작성
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();

    }//end of main
}//end of class
