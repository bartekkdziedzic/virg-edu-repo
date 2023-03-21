package codewars;

import java.util.Arrays;
import java.util.stream.IntStream;
public class AnalysisLotr {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = new int[]{1, 2, 3, 3, 4, 10};
        int[] evilWorth = new int[]{1, 2, 2, 2, 3, 5, 10};
        int[] good = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] evil = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int goodSum = IntStream.rangeClosed(0,good.length-1).map(i->good[i]*goodWorth[i]).sum();
        int evilSum = IntStream.rangeClosed(0,evil.length-1).map(i->evil[i]*evilWorth[i]).sum();
        return goodSum > evilSum ?  "Battle Result: Good triumphs over Evil" :
                evilSum > goodSum ? "Battle Result: Evil eradicates all trace of Good" :
                        "Battle Result: No victor on this battle field";
    }
}