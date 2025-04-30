package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 4.29
 * 자바는 단일 상속만을 지원한다.
 * (Object 제외)
 *
 * 이벤트 리스너 예제 코드를 만들면서 이해해 보자
 *
 * 액션리스너 인터페이스
 * ActionListener
 * 자바 개발자들이
 * 운영체제(마우스 제어 주체)와
 * 상호작용할 수 있도록 에비해둔 기능이다.
 */
public class ColorChangeFrame extends JFrame implements ActionListener {

    /*
    구조
    -----
    멤버
    생성자
    메서드
    이너
    메인
     */

    //member
    JButton button1 = new JButton();

    //constructor
    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }


    //method
    private void initData() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("button1");
    }

    private void setInitLayout() {

        //배치관리자 기본
        setLayout(new FlowLayout());

        add(button1);

        //가장 마지막에 실행
        setVisible(true);
    }

    private void addEventListener() {

        button1.addActionListener(this);
    }
    /*
    운영체제와 약속된 추상 메서드를 오버라이드 한다.

    이는 이벤트가 발생되면 이 메서드를 수행하도록 하기 위해서다.

    ⭐콜백
    callback
    직접 수행하는 것이 아니라
    미리 정해져 있는 정보(객체)를 받을 수 있게 하는 것

    💀단, 어떤 컴포넌트가 이벤트를 실행시킬 것인지
    먼저 등록해둬야 한다.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("actionPerformed() 메서드 호출");
        System.out.println(e.toString());
    }

    //main
    public static void main(String[] args) {

        ColorChangeFrame colorChangeFrame = new ColorChangeFrame();

    }//end of main
}//end of class
