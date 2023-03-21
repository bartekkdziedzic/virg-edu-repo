package pl.sdacademy.java.basics;

public class NumberUnits {










    public static boolean isDivisible(int intValue, int divider) {

        if (intValue % divider == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(isDivisible(a, b));
    }
}
