package pl.sdacademy.java.basics.hellome;

import java.math.BigDecimal;

public class HelloNumbers {
    public static void main(String[] args) {
        /*
        naturalne - brak typu w Javie, używamy całkowitych
        całkowite/wymierne:
            * byte (Byte): od -128 do 127
            * short (Short): od -32,768 do -32,767
            * int (Integer): od -2^31 do 2^31-1 <-- najczęściej używane
            * long (Long): od 2^63 do 2^63-1
            * BigInteger
        ułamki:
            * float (Float) (floating-point - typ zmiennoprzecinkowy)
            * double (Double) (double precision - nadal zmiennoprzecinkowy)
            * BigDecimal

        inne typy:
            * char (Character) - reprezentuje znak tekstowy
        */

        int integer1 = 1;
        int integer2 = 2;
        int integerSum = integer1 + integer2;

        System.out.println("Wynik dodawania int: " + integerSum);

        double double1 = 0.1;
        double double2 = 0.2;
        double doubleSum = double1 + double2;

        System.out.println("Wynik dodawania double: " + doubleSum);

        //zagadnienie z bloku Java Zaawansowana
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.2);
        BigDecimal bigDecimalSum = bigDecimal1.add(bigDecimal2);

        System.out.println("Wynik dodawania BigDecimal: " + bigDecimalSum);

        long long1 = 30000000000000004L;
        long long2 = 30000000000000005L;
        long longSum = long1 + long2;

        System.out.println("Wynik dodawania long: " + longSum);
    }
}