package com.accesss;

// 설계 측
public class Hero {
    //속성
    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    //생성자

    //getter 메서드
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getPower() {
        return power;
    }
    public double getDefense() {
        return defense;
    }
    public boolean getIsDie() {
        return isDie;
    }

    // setter 메서드
    public void setName(String stNam) {
        name = stNam;
    }
    public void setHp(int stHp) {
        hp = stHp;
    }
    public void setPower(int stPow) {
        power = stPow;
    }
    public void setDefense(double stDef) {
        defense = stDef;
    }
    public void setIsDie(boolean stIsd) {
        isDie = stIsd;
    }

} // end of class
