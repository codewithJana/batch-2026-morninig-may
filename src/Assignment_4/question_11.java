package Assignment_4;

import java.util.HashSet;

public class question_11 {
    static void main() {
        int[] input = {5, 3, 8, 3, 5, 9, 8, 5};

        // Stores unique elements
        HashSet<Integer> seen = new HashSet<Integer>();

        // Stores duplicate elements
        HashSet<Integer> duplicate = new HashSet<Integer>();

        // Traverse the array
        for (int num : input) {

            // If already present, it is a duplicate
            if (seen.contains(num)) {
                duplicate.add(num);
            } else {
                // Otherwise, add it to seen
                seen.add(num);
            }
        }

        // Print duplicate elements
        System.out.println("Duplicates: " + duplicate);
    }
}
