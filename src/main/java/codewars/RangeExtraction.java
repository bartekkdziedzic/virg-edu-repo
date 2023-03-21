package codewars;

import java.util.Arrays;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {

        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = String.valueOf(arr[i]);
        }
        String[] copy = new String[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            copy[i] = arr2[i];
        }



        String temp = arr2[0];
        for (int i = 0; i < arr.length-1; i++) {

            if(Integer.valueOf(temp) +1 == Integer.valueOf(arr2[i+1])){
                temp= arr2[i+1];
                if(copy[i]!="-"){
                copy[i+1]="-";}
            }
            else {
                copy[i]=temp;
                temp=arr2[i+1];
            }




        }


        if(copy[copy.length-1]=="-"){
        //    copy[copy.length-1]="";
         //   copy[copy.length-2]="";
        }

String so="";


        for (int i = 0; i < copy.length; i++) {


            if(copy[i]=="-" || copy[i+1]=="-"){
                so=so+copy[i];
            }



            else
                so= so +copy[i]+",";




        }


so=so+ arr2[arr2.length-1];
        System.out.println(Arrays.toString(arr2));
        return so;
    }


}
