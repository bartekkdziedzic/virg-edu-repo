package codewars;

public class StringSplit {

    public static String[] solution(String s) {
        //Write your code here
        String[] array;
        array = new String[s.length() / 2];

        for (int i = 0; i < array.length; i++) {
            array[i] = s.substring(2 * i, 2 * i + 2);
        }
        if (s.length() % 2 == 1) {

            String[] array2;
            array2 = new String[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];

            }
            array2[array2.length - 1] = s.substring(s.length() - 1) + "_";
            return array2;
        }

        return array;
    }


}
