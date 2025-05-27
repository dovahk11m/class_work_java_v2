package com.association;
/**
 * 4.22 2_2교시 연관관계
 */
public class Team {

    //member
    private String name;

    private Player player; //연관관계

    //constructor
    public Team(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //method - 영입
    public void recruit(Player player) {
        this.player = player;
        System.out.println(name + " " + player.getName() + " 선수 영입");
    }

    //method - 방출
    public void release(Player player) {
        System.out.println(name + " " + player.getName() + " 선수 방출");
        this.player = null;
    }

    //method - 현황
    public void showRoster() {
        System.out.print(name + " 선수 현황: ");
        if (this.player != null) {
            System.out.println(this.player.getName());
        } else {
            System.out.println("등록 선수 없음");
        }
    }

}//end of Team
