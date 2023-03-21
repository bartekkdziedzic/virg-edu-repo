package codewars;

import codewars.IntegerOverflowException;

import java.util.List;

public class ListOperation {

    public int sumInts(List<String> input) throws IntegerOverflowException {

        int sum = 0;
        for (String s : input) {
            String[] words = s.split(" ");
            for (String word : words){
                try{
                    int singleInt = Integer.parseInt(word);
                    sum = sum + singleInt;
                }
                catch(NumberFormatException exception1){

                }

            }
        }

        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            throw new IntegerOverflowException("Integer range has been exceeded",null);
        }


        return sum;
    }

}
