package com.my.starcraft.v2;
/**
 * @author 조충희
 * 4.22 스타크래프트 만들기
 * 추상클래스
 */
public abstract class Unit { //추상 클래스로 선언하는 것이 타당하다

    //member
    protected String name;
    protected int power;
    protected int hp;

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

    //method - showInfo
    public void showInfo() {
        System.out.print("😭" + name);
        System.out.print(" 공격: " + power);
        System.out.println(" 체력: " + hp);
    }

    //method - attack
    public void attack(Unit unit) {
        unit.beAttacked(this.power);
        System.out.println("😡" + name + ", " + unit.getName() +" 공격중! ");
    }

    //method - Crit
    public void crit(Unit unit) {
        unit.beAttacked(this.power * 2);

        System.out.print("💥" + name + "이 " + unit.getName() +" 에게 치명타(" + power * 2 +") ");
    }

    //method - healHp
    public void healHp(Unit unit) {
        this.hp += power;
        System.out.println(name + " 이 " + power + " 체력 회복");
    }

    //method - beAttacked
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println("💀" + name + " 이미 사망");
            // 실행의 제어권을 반납하고 싶으면
            return; // 돌아가
        }
        this.hp -= power;
    }

}//end of class
