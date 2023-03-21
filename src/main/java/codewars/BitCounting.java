package codewars;

import java.util.stream.Stream;

public class BitCounting {

    public static int countBits(int n) {
        // Show me the code!


        String s = Integer.toBinaryString(n);


        for (int i = 0; i < s.length() + 1; i++) {
            if (s.contains("1")) {
                s = s.replaceFirst("1", "0");
            } else {
                return i;
            }

        }


        return 0;
    }


}