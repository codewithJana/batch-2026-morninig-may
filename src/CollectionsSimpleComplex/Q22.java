package CollectionsSimpleComplex;

import java.util.LinkedHashMap;

public class Q22 {

    public static void main(String[] args) {

        String sentence = "the cat sat on the mat the cat ran";

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : sentence.split(" ")) {
            map.merge(word, 1, Integer::sum);
        }

        System.out.println(map);
    }
}
