package com.my.array;
/**
 * 4.18 배열 질럿테스트 복습
 */
import com.starcraft.v01.UnitZealot;

public class ArrayZealot1 {
    //main
    public static void main(String[] args) {
        UnitZealot[] zealots = new UnitZealot[10];

        zealots[0] = new UnitZealot("질럿1");
        zealots[1] = new UnitZealot("질럿2");
        zealots[3] = new UnitZealot("질럿4");

        for (int i = 0; i < zealots.length; i++) {
            if (zealots[i] != null) {
                zealots[i].showInfo();
            }
        }
    }//end of main
}//end of class
