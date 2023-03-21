package pl.sdacademy.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerPi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A a1 = new A();
        A a2 = new A();
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

        List<String> esList =new ArrayList<>(Arrays.asList("1","93","11"));

    }

}
