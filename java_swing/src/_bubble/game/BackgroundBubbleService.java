package _bubble.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 5.8
 BPS 쓰레드는 너무 바쁜 상황이다.
 버블마다 쓰레드를 박으면 자원소모가 너무 많아진다.
 시스템이 느려질 가능성이 높다.
 BBS
 */
public class BackgroundBubbleService {

    //member
    private BufferedImage image;
    private Bubble bubble;

    //constructor
    public BackgroundBubbleService(Bubble bubble) {
        this.bubble = bubble;

        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 왼쪽 벽 확인
    public boolean leftWall() {

        Color leftcolor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY()+25));
        //빨간색 RGB 255,0,0 => 왼쪽 벽
        if (leftcolor.getRed() == 255 && leftcolor.getGreen() == 0 && leftcolor.getBlue() == 0) {
            return true;
        }
        return false;
    }//leftWall

    // 오른쪽 벽 확인
    public boolean rightWall() {

        Color rightcolor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY()+25));
        //빨간색 RGB 255,0,0 => 오른쪽 벽
        if (rightcolor.getRed() == 255 && rightcolor.getGreen() == 0 && rightcolor.getBlue() == 0) {
            return true;
        }
        return false;
    }//rightWall

    //파란천장
    public boolean ceilingBlue() {

        Color ceilBColor = new Color(image.getRGB(bubble.getX()+35, bubble.getY()));
        //파란색 RGB 0,0,255 => 파란천장
        if (ceilBColor.getRed() == 0 && ceilBColor.getGreen() == 0 && ceilBColor.getBlue() == 255) {
            return true;
        }
        return false;
    }//ceilingBlue

    //빨간천장
    public boolean ceilingRed() {

        Color ceilRColor = new Color(image.getRGB(bubble.getX()+35, bubble.getY()));
        //빨간천장
        if (ceilRColor.getRed() == 255 && ceilRColor.getGreen() == 0 && ceilRColor.getBlue() == 0) {
            return true;
        }
        return false;
    }//ceilingRed

}//class
