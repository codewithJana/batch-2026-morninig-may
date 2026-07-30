package CollectionsSimpleComplex;

import java.util.TreeMap;

public class Q25 {

    public static void main(String[] args) {

        String text = "banana apple cherry apple banana apple";

        String[] words = text.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.merge(word,1, Integer::sum);
        }

        System.out.println(map);
    }
}
