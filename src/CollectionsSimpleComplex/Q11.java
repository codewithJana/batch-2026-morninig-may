package CollectionsSimpleComplex;

import java.util.HashSet;

public class Q11 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 3, 5, 9, 8, 5};

        HashSet<Integer> seen_so_far = new HashSet<>();
        HashSet<Integer> confirmed_duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen_so_far.add(num)) {
                confirmed_duplicates.add(num);
            }
        }

        // Print duplicates
        System.out.println("Duplicate elements: " + confirmed_duplicates);
    }
}
