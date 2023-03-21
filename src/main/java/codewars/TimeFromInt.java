package codewars;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class TimeFromInt {


    public static String makeReadable(int seconds) {
        int h1 = 0;
        int h = seconds / 3600;
        if (h > 24) h1 = h - 24;
        if (h1 > 24) h1 = h - 24;
        if (h1 > 24) h1 = h - 24;
        int m = (seconds - h * 3600) / 60;
        int s = seconds - (h * 3600) - (m * 60);
        String out = String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);
        System.out.println(out);
        return out;
    }


    public static void main(String[] args) {
        makeReadable(99900);


    }
}
