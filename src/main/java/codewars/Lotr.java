package codewars;

import java.lang.String;
import java.util.Arrays;

public class Lotr {


    public static String battle(String goodAmounts, String evilAmounts) {

        int goodPower = 0;
        int evilPower = 0;
        int[] goodRatios = {1, 2, 3, 3, 4, 10};
        int[] evilRatios = {1, 2, 2, 2, 3, 5, 10};
        String[] goodAmount = goodAmounts.split(" ");
        String[] evilAmount = evilAmounts.split(" ");

        for (int i = 0; i < 6; i++) {
            goodPower = goodPower + Integer.valueOf(goodAmount[i]) * goodRatios[i];
            evilPower = evilPower + Integer.valueOf(evilAmount[i]) * evilRatios[i];
        }
        evilPower = evilPower + Integer.valueOf(evilAmount[6]) * evilRatios[6];

        if (goodPower > evilPower) {
            return "Battle Result: Good triumphs over Evil";
        } else if (goodPower < evilPower) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }


    }


    public static void main(String[] args) {
        System.out.println(Lotr.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
        System.out.println(Lotr.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
        System.out.println(Lotr.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }


}
