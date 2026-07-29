package Assignment_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class question_16 {
    static void main() {
        Integer[] input = {7, 2, 9, 4, 1, 8};

        int k = 3;

        // Create a TreeSet
        TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(input));

        // Find kth smallest
        Iterator<Integer> itr = set.iterator();

        int smallest = 0;

        for (int i = 0; i < k; i++) {
            smallest = itr.next();
        }

        // Find kth largest
        Iterator<Integer> revItr = set.descendingIterator();

        int largest = 0;

        for (int i = 0; i < k; i++) {
            largest = revItr.next();
        }

        // Print the result
        System.out.println("3rd Smallest = " + smallest);
        System.out.println("3rd Largest = " + largest);
    }
}
