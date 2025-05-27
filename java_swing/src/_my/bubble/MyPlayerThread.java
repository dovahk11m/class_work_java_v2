package _my.bubble;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPlayerThread implements Runnable {
    private BufferedImage image;

    private MyPlayer player;

    public MyPlayerThread(MyPlayer player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
            int bottomColorLeft = image.getRGB(player.getX() + 10, player.getY() + 55);
            int bottomColorRight = image.getRGB(player.getX() + 50, player.getY() + 55);
            if (bottomColorLeft + bottomColorRight != -2) {
                player.setDown(false);
            } else {
                if (!player.isUp() && !player.isDown()) {
                    player.down();
                }
            }
            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                player.setLeftWallCrash(true);
                player.setLeft(false);
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                player.setRightWallCrash(true);
                player.setRight(false);
            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}//end of class
