package codewars;

import java.io.*;

public class PhoneNumber {


    public static String createPhoneNumber(int[] numbers) {
        String S = "";

        for (int i = 0; i < numbers.length; i++) {

            S = S + String.valueOf(numbers[i]);


        }

        StringBuffer newS = new StringBuffer(S);
        newS.insert(6, "-");
        newS.insert(3, ") ");
        newS.insert(0, "(");

        S = String.valueOf(newS);

        return S;
    }


}
