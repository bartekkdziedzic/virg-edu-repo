package pl.sdacademy.java.basics;

public class MilesCalculator {

    public static void main(String[] args) {
       //  km to miles converting

        double km= 15;
        double km2= 40;

       double miles= kmToMiles(km);
       double miles2= kmToMiles(km2);

        System.out.println(miles);
        System.out.println(miles2);
      //  System.out.println(miles2-miles);

    }

    public static double kmToMiles(double km){

        final double scaleKmToMilesRatio=0.621371192;
        double miles= km * scaleKmToMilesRatio;
        return miles;
    }
}
