package com.starcraft.v02;

// 난수 생성기를 테스트 하는 공간

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int random1;

        // 난수 생성기 1 -  0~1 사이 소수점 숫자를 만든다
        while (true) {
            random1 = (int)(Math.random() * 3) + 1;
            System.out.println(random1);

            if (random1 == 3) {
                break;
            }
        }

        // 난수 생성기 2 -
        Random random = new Random();
        random.nextInt(); // 0 ~ ± 22억 범위 난수 생성
        int ranInt1 = random.nextInt(3) + 1; // 1~3까지 랜덤숫자

    }
}
