package com.starcraft.v01;
/**
 * @author 조충희
 */
public class UnitZealot {
    ///속성
    private String name;
    private int power;
    private int hp;

    ///생성자
    public UnitZealot(String name) {
        this.name = name;
        this.power = 10; // 기본값을 만들어 줄 수 있다.
        this.hp = 80;
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

    //질럿이 저글링을 공격하다
    public void attackZergling(UnitZergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + "이 " + zergling.getName() +" 공격중");
    }

    //질럿이 저글링을 강공
    public void critZergling(UnitZergling zergling) {
        zergling.beAttacked(this.power * 2);

        System.out.println(name + "이 " + zergling.getName() +" 에게 치명타");
    }

    // 질럿이 마린을 공격하다
    public void attackMarine(UnitMarine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + "이 " + marine.getName() + " 공격중");
    }

    //질럿이 마린을 강공
    public void critMarine(UnitMarine marine) {
        marine.beAttacked(this.power * 2);
        System.out.println(name + "이 " + marine.getName() +" 에게 치명타");
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
    public void healHp(UnitZealot zealot) {
        this.hp += power;
        System.out.println(name + " 이 " + power + " 체력 회복");
    }

    // 상태창
    public void showInfo() {
        System.out.println("질럿 체력 " + hp);
    }
}//end of class
