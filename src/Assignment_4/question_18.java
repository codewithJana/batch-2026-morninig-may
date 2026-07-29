package Assignment_4;

import java.util.HashMap;

public class question_18 {
    static void main() {
        // Input string
        String input = "programming";

        // Create HashMap to store character frequency
        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();

        // Traverse each character of string
        for (char ch : input.toCharArray()) {

            // If character exists, increase count
            // Otherwise, start count from 0 and add 1
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Print character frequency
        System.out.println(frequency);
    }
}
