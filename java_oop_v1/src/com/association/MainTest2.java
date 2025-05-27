package com.association;
/**
 * 4.22 2_2교시 연관관계
 */
public class MainTest2 {
    //main
    public static void main(String[] args) {
        Team team1 = new Team("롯데");
        Player player1 = new Player("장원준");

        team1.showRoster();
        System.out.println();

        team1.recruit(player1);
        team1.showRoster();
        System.out.println();

        team1.release(player1);
        team1.showRoster();
        System.out.println();

        player1.showRoster();
        System.out.println();

        player1.join(team1);
        player1.showRoster();
        System.out.println();

        player1.leave(team1);
        player1.showRoster();

    }//end of main
}//end of class
