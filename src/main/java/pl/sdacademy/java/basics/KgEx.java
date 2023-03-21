package pl.sdacademy.java.basics;

import java.text.DecimalFormat;

public class KgEx {
    public static double kgToPounds(double kg) {
        double ratio = 2.204;
        double pounds = kg * ratio;
        pounds = Math.round(pounds * 10) / 10d;
        return pounds;
    }

    public static double circleArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        area = Math.round(area * 100) / 100d;
        return area;
    }

    public static double celsiusToFahrenheit(double c) {
        double fahrenheit = (c * 1.8) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        double kg1 = 83;
        double radius1 = 51;
        double c1 = 18;
        System.out.println(kg1 + " kg is equal to " + kgToPounds(kg1) + " pounds");
        System.out.println("Area of circle of radius " + radius1 + " is equal to " + circleArea(radius1) + " units^2");
        System.out.println(c1 + " Celsius = " + celsiusToFahrenheit(c1) + "F");
    }
}
