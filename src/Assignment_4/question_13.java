package Assignment_4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class question_13 {
    static void main() {

        // Input array
        Integer[] input = {9, 4, 9, 1, 4, 7};

        // LinkedHashSet removes duplicates and preserves insertion order
        LinkedHashSet<Integer> output = new LinkedHashSet<Integer>(Arrays.asList(input));

        // Print the result
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Output: " + output);
    }
}
