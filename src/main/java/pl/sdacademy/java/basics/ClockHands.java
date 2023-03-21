package pl.sdacademy.java.basics;

public class ClockHands {

    public static double calculateAngle(String time) {
        String[] array = time.split("");

        double hh = Double.valueOf(array[0]) * 10d + Double.valueOf(array[1]);
        double mm = Double.valueOf(array[3]) * 10d + Double.valueOf(array[4]);
        if (hh >= 12) {
            hh = hh - 12d;
        }
        double hhAngle = hh * 30d + (mm / 60d) * 30;
        double mmAngle = mm * 6d;

        double retAngle = Math.abs(hhAngle - mmAngle);

        return retAngle;
    }

    public static void main(String[] args) {
        String time1 = "01:55";

        System.out.println(calculateAngle(time1));
    }
}

