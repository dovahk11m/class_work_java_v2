package _bubble.test06;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * 5.2
 */
public class BackgroundPlayerService implements Runnable {

    //멤버변수
    private BufferedImage image;

    //캐릭터 좌표값을 받아야 한다.
    private Player player;

    //생성자
    public BackgroundPlayerService(Player player) {
        /*
        생성자 의존 주입 (DI)
        이는 연관관계로 설계됐다.
         */

        //메인쓰레드에서 생성된 player를 가져와야 한다.
        this.player = player;

        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //start() 메서드가 호출되면 동작하는 부분
    @Override
    public void run() {

        while (true) {

            //플레이어 좌표의 RGB 값을 인식하게 하기
            Color leftColor = new Color(image.getRGB(player.getX(),player.getY()+25));
//            System.out.println("왼쪽 벽 확인:"+leftColor);

            //플레이어 좌표에 보정값 추가
            Color rightColor = new Color(image.getRGB(player.getX()+60,player.getY()+25));
//            System.out.println("오른쪽 벽 확인:"+rightColor);

            /*
            바닥 감지 기능 개발
            하얀색이라면?
            255,255,255 -> 16진수 -> -1
            image.getRGB 호출

             */
            int bottomColorLeft = image.getRGB(player.getX() +10, player.getY() + 55);
            System.out.println("bottomColorLeft:" + bottomColorLeft);
            int bottomColorRight = image.getRGB(player.getX() + 50, player.getY() + 55);
            System.out.println("bottomColorRight:" + bottomColorRight);

            /*
            -1이라면 바닥으로 떨어져야 하고 아니라면 멈춘다.
            멈추는 경우는 빨간색, 파란색
             */

            if (bottomColorLeft + bottomColorRight != -2) {
                player.setDown(false);
            } else {

                /*
                점프하는 순간 bottomColor 값이 -1이 되기 때문에
                바로 player.down() 메서드가 호출된다.
                 */
//                player.down();
                if (player.isUp() == false && player.isDown() == false) {
                    player.down();
                }
            }

            /*
            벽 감지 기능 개발

            플레이어의 좌표값에 따라
            빨간색, 파란색, 하얀색을 구분할 수 있다.

            논리적으로
            leftColor가 255, 0, 0 이면 왼쪽 벽에 충돌함
            또 RightColor가 빨간색이면 오른쪽 벽에 충돌한 것으로 판단한다.
             */

            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                //RGB 255,0,0 빨간색으로 판별 = 왼쪽벽에 충돌했다.
                System.out.println("왼쪽 벽에 충돌");

                //왼쪽 벽 충돌 판정
                player.setLeftWallCrash(true);

                //충돌시 왼쪽이동 종료
                player.setLeft(false);


            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                //RGB 255,0,0 빨간색으로 판별 = 오른쪽벽에 충돌했다.
                System.out.println("오른쪽 벽에 충돌");

                //오른쪽 벽 충돌 판정
                player.setRightWallCrash(true);

                //충돌시 오른쪽이동 종료
                player.setRight(false);

            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }

            //위 두 조건이 아니면 하얀색 = 마음대로 움직이세요

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }//while
    }//run

}//end of class
