package com.starcraft.v02;

public class Zergling {
    //클래스설계

    private String name;
    private int power;
    private int hp;

    //생성자

    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
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

    //저글링이 마린을 공격하다
    public void attack(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + "이 " + marine.getName() +" 공격중");
    }
    // 저글링이 질럿을 공격하다
    public void attack(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + "이 " + zealot.getName() + " 공격중");
    }
    //저글링이 마린을 강공
    public void ctit(Marine marine) {
        marine.beAttacked(this.power * 4);
        System.out.println(name + "이 " + marine.getName() + " 에게 치명타");
    }
    //저글링이 질럿을 강공
    public void crit(Zealot zealot) {
        zealot.beAttacked(this.power * 4);
        System.out.println(name + "이 " + zealot.getName() + " 에게 치명타");
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
    public void healHp(Zergling zergling) {
        this.hp += power * 4;
        System.out.println(name + " 이 " + power * 4 + " 체력 회복");
    }

    // 상태창
    public void showInfo() {
        System.out.println("저글링 체력 " + hp);

    }

}//end of class
