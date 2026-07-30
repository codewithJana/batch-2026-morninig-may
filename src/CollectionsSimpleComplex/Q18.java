package CollectionsSimpleComplex;

import java.util.HashMap;

public class Q18 {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }

        System.out.println(map);
    }
}
