package pl.sdacademy.java.basics;

import java.util.Random;
import java.util.Scanner;

public class ArrayManualSort {


    public static double[] arrAscendingSort(double[] initarray) {
        double[] arr = initarray;
        //display income
        System.out.println("Random generated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((Math.round(arr[i]*1000))/1000d);
        }

        System.out.println(""); //spacing

        //for every value at the beginning check its maximum
        for (int j = 0; j < arr.length - 1; j++) {
            //set temporary to be at teh beginning of the array
            double t = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    // switch places using temporary memory
                    t = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = t;
                }
            }
        }

        //display outcome
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((Math.round(arr[i]*1000))/1000d);
        }

        return arr; // for further use
    }


    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please type length of random created array:");
        int numb = scanner1.nextInt();

        double[] arr1 = new double[numb];

        for (int i = 0; i <= arr1.length - 1; i++) {
            Random r = new Random();
            arr1[i] = r.nextDouble();
        }


        arrAscendingSort(arr1);


    }
}