package com.starcraft.v01;
/**
 * @author 조충희
 */
public class UnitMarine {
    ///속성
    private String name;
    private int power;
    private int hp;

    ///생성자
    public UnitMarine(String name) {
        this.name = name;
        this.power = 8; // 기본값을 만들어 줄 수 있다.
        this.hp = 70;
    }

    //read only => getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    //setter는 안만들 생각

    /// 메서드

    //마린이 질럿을 공격하다
    public void attackZealot(UnitZealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + " 이 " + zealot.getName() + " 공격중");
    }
    //마린이 질럿을 강공
    public void critZealot(UnitZealot zealot) {
        zealot.beAttacked(this.power * 2);
        System.out.println(name + " 이 " + zealot.getName() + " 에게 치명타");
    }

    //마린이 저글링을 공격하다
    public void attackZergling(UnitZergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + " 이" + zergling.getName() + " 공격중");
    }
    //마린이 저글링을 강공
    public void ctitZergling(UnitZergling zergling) {
        zergling.beAttacked(this.power * 3);
        System.out.println(name + " 이" + zergling.getName() + " 에게 치명타");
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
    public void healHp(UnitMarine marine) {
        this.hp += power * 2;
        System.out.println(name + " 이 " + power * 2 + " 체력 회복");
    }

    // 상태창
    public void showInfo() {
        System.out.println("마린 체력 " + hp);
    }
}//end of class
