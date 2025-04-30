package com.association;
/**
 * 4.22 2_2교시 연관관계
 */
public class Player {

    //member
    private String name;

    private Team team;

    //constructor
    public Player(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //method - 입단
    public void join(Team team) {
        this.team = team;
        System.out.println(name + " " + team.getName() + " 입단");
    }

    //method - 탈단
    public void leave(Team team) {
        System.out.println(name + " " + team.getName() + " 탈단");
        this.team = null;
    }

    //method - 현황
    public void showRoster() {
        System.out.print(name + " 팀 현황: ");
        if (this.team != null) {
            System.out.println(this.team.getName());
        } else {
            System.out.println("소속 팀 없음");
        }
    }

}//end of Player
