package Assignment_4;

import java.util.Arrays;
import java.util.HashSet;

public class quedstion_12 {
    static void main() {
        // Input arrays
        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] b = {3, 4, 5, 6, 7};

        // Create HashSets
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(a));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(b));

        // Find Union
        HashSet<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);

        // Find Intersection
        HashSet<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);

        // Print results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
