package com.starcraft.v02;

public class Marine {
    //클래스설계

    private String name;
    private int power;
    private int hp;

    //생성자

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    //메서드

    //저글링 공격
    public void attack(Zergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + "이 " + zergling.getName() +" 공격중");
    }
    // 질럿 공격
    public void attack(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + "이 " + zealot.getName() + " 공격중");
    }
    //저글링을 강공
    public void ctit(Zergling zergling) {
        zergling.beAttacked(this.power * 3);
        System.out.println(name + " 이" + zergling.getName() + " 에게 치명타");
    }
    //질럿을 강공
    public void crit(Zealot zealot) {
        zealot.beAttacked(this.power * 3);
        System.out.println(name + " 이 " + zealot.getName() + " 에게 치명타");
    }
    //내가 공격을 받다
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
    public void healHp(Marine marine) {
        this.hp += power * 2;
        System.out.println(name + " 이 " + power * 2 + " 체력 회복");
    }

    // 상태창
    public void showInfo() {
        System.out.println("마린 체력 " + hp);

    }

}//end of class
