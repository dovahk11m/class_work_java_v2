package com.my.class_;
// Baby 클래스 설계
public class Baby1 {

    //속성
    private String name;
    private int hunger;
    private int thirst;
    private int sleepy;

    //생성자
    public Baby1(String babyNm, int babyHn, int babyTs, int babySp) {
        name = babyNm;
        hunger = babyHn;
        thirst = babyTs;
        sleepy = babySp;
    }

    //getter 메서드
    public int getSleepy() {
        return sleepy;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }

    //메서드
    public void showInfo() {
        System.out.println("===== 아기상태창 =====");
        System.out.println("배고픔" + hunger);
        System.out.println("목마름" + thirst);
        System.out.println("졸림" + sleepy);
    }

    // 물마심
    public void drinkWater(int amount) {
        if (amount >= thirst) {
            System.out.println(thirst + "ml 물을 마셨다");
            thirst -= thirst;
            sleepy += 5;
            System.out.println("목마름:" + thirst);
            System.out.println("졸림:" + sleepy);

        } else if (thirst > amount && amount >= 0) {
            System.out.println(amount + "ml 물을 마셨다");
            thirst -= amount;
            sleepy += 5;
            System.out.println("목마름:" + thirst);
            System.out.println("졸림:" + sleepy);
        }
    }
    // 밥먹음
    public void eatFood(int amount) {
        if (amount >= hunger) {
            System.out.println(hunger + "g 밥을 먹었다");
            hunger -= hunger;
            sleepy += 15;
            System.out.println("배고픔:" + hunger);
            System.out.println("졸림:" + sleepy);

        } else if (hunger > amount && amount >= 0) {
            System.out.println(amount + "g 밥을 먹었다");
            hunger -= amount;
            sleepy += 15;
            System.out.println("배고픔:" + hunger);
            System.out.println("졸림:" + sleepy);
        }
    }
    // 잠
    public void goToSleep(int amount) {
        if (amount <= sleepy) {
            System.out.println("잠을 잤다");
            sleepy -= amount;
            hunger += 25;
            thirst += 25;
            System.out.println("졸림:" + sleepy);
            System.out.println("배고픔:" + hunger);
            System.out.println("목마름:" + thirst);

        } else if (amount > sleepy) {
            System.out.println(amount + "잠을 자지 않았다");
            sleepy -= 10;
            System.out.println("졸림:" + sleepy);
        }
    }
}//end of class
