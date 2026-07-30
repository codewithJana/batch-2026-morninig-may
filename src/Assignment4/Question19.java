package Assignment4;

import java.util.HashMap;

public class Question19 {
    static void main(String[] args) {
        String word = "swiss";
        HashMap<Character,Integer> rep = new HashMap<>();

        for (char ch : word.toCharArray()) {
            rep.put(ch, rep.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word.toCharArray()) {
            if (rep.get(ch) == 1) {
                System.out.println(ch);
                return;
            }

        }
    }
}
