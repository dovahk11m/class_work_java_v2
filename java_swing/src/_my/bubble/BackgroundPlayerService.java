package _my.bubble;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 백그라운드에서
 * Player의 움직임을 관찰하는
 * 새로운 작업자를 따로 만든다.
 */
public class BackgroundPlayerService implements Runnable {

    //이미지 변수
    private BufferedImage image;

    //플레이어 좌표값
    private Player player;

    //생성자 의존주입
    public BackgroundPlayerService(Player player) {

        this.player = player;

        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//생성자

    //메서드
    @Override
    public void run() {

        //계속해서 감시하는 반복문 작성 (true)
        while (true) {

            //특정좌표의 RGB값 인식
            //Color 클래스 호출
            Color leftColor = new Color(image.getRGB(player.getX()+10, player.getY()));

            //그림의 왼쪽 위 꼭지점을 판별하므로
            //이미지의 오른쪽 좌표를 나타내기 위해 보정값(+60)을 줘야 한다.
            Color rightColor = new Color(image.getRGB(player.getX()+60, player.getY()));

            //조건문
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getGreen() == 0) {
                //player 왼쪽의 배경색이 빨간색이다

                player.setLeftWallCrash(true); //왼쪽 벽 충돌
                player.setLeft(false); //왼쪽 이동 금지

            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getGreen() == 0) {
                //player 오른쪽 배경색이 빨간색이다

                player.setRightWallCrash(true); //오른쪽 벽 충돌
                player.setRight(false); //오른쪽 이동 금지

            } else {

                player.setRightWallCrash(false); //오른쪽 벽 충돌 아님
                player.setLeftWallCrash(false); //왼쪽 벽 충돌 아님

            }

            //0.005초마다 감시해라
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }//while

    }//run

}//BackgroundPlayerService
