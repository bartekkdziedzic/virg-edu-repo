package pl.sdacademy.java.basics;

public class BmiCalculator {

    public static double bmiCalc(double bodyMass, double height) {

        double bmi = bodyMass / Math.pow(height, 2);
        bmi = Math.round(bmi * 100d) / 100d;
        return bmi;
    }

    public static void main(String[] args) {
        double kg1 = 90;
        double height1 = 1.94;
        System.out.println("For " + kg1 + "kg mass and " + height1 + " m height, BMI = " + bmiCalc(kg1, height1));
    }
}
