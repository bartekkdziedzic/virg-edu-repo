package codewars;


public class StringSplit2 {
    public static String[] solution(String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})"); // split co 2 litery   He|ll|oW|or|ld
    }
}