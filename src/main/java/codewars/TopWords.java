package codewars;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        // Use a regular expression to match words in the string
        String[] words = s.toLowerCase().split("[^a-z']+");
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }


        if (map.size() == 2) {
           map.remove("");
            String s2 = map.keySet().toString();    //zmienic keyset na coś co nie zrwaca setu z []
            s2=s2.substring(1,s2.length()-1);
            List<String> list = new ArrayList<>();
            list.add(s2);


            return list;
        }

        // Use a PriorityQueue to sort the words by frequency
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        queue.addAll(map.entrySet());
        // Get the top 3 words
        ArrayList<String> topWords = new ArrayList<String>();
        int i = 0;
        while (!queue.isEmpty() && i < 3) {

            if (queue.element().getKey() != "") {
                topWords.add(queue.poll().getKey());
            }
            i++;
        }
        // Return the top 3 words or fewer if there are not enough unique words


        return topWords;


    }


}
