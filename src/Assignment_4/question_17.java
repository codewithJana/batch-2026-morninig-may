package Assignment_4;

import java.util.TreeSet;

public class question_17 {
    static void main() {
        TreeSet<Integer> set = new TreeSet<Integer>();


    // Add elements
        set.add(5);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(25);
        set.add(15);

    int low = 10;
    int high = 25;

    // Print elements between low and high (inclusive)
        System.out.println("Elements in range: " + set.subSet(low, true, high, true));
}
}
