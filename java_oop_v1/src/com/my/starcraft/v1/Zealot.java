package com.my.starcraft.v1;

public class Zealot {
    //클래스설계

    private String name;
    private int power;
    private int hp;

    //생성자

    public Zealot(String name) {
        this.name = name;
        this.power = 5;
        this.hp = 80;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    //setter
    public void setPower() {
        this.power += power;
    }

    ///메서드

    // 공격 저글링
    public void attack(Zergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + "이 " + zergling.getName() +" 공격중");
    }
    // 공격 마린
    public void attack(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + "이 " + marine.getName() + " 공격중");
    }

    //크리티컬 저글링
    public void crit(Zergling zergling) {
        zergling.beAttacked(this.power * 2);

        System.out.println(name + "이 " + zergling.getName() +" 에게 치명타");
    }
    //크리티컬 마린
    public void crit(Marine marine) {
        marine.beAttacked(this.power * 2);
        System.out.println(name + "이 " + marine.getName() +" 에게 치명타");
    }


    //공격 받다
    public void beAttacked(int power) {
        /*
        방어적 코드
         */
        if (this.hp <= 0) {
            System.out.println(name + " 이미 사망");
            // 실행의 제어권을 반납하고 싶으면
            return; // 돌아가
        }
        this.hp -= power;
        System.out.println(name + " 공격 받는 중");
    }
    //강공시 흡혈
    public void healHp() {
        this.hp += power;
        System.out.println(name + " 이 " + power + " 체력 회복");
    }

    //파워업
    public void powerUp() {
        this.power += 5;
        System.out.println(name + " 의 공격력이 5 만큼 증가했습니다.");
    }


    // 상태창
    public void showInfo() {
        System.out.print("질럿 체력 " + hp);
        System.out.println(", 공격력 " + power);

    }

}//end of class
