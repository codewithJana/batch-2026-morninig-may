package CollectionsSimpleComplex;

import java.util.SortedSet;
import java.util.TreeSet;

public class Q17 {

    public static void main(String[] args) {

        TreeSet<Integer> input = new TreeSet<>();

        input.add(5);
        input.add(10);
        input.add(15);
        input.add(20);
        input.add(25);
        input.add(30);

        int low = 10;
        int high = 25;

        SortedSet<Integer> output = input.subSet(low, true, high, true);

        System.out.println("Input : " + input);

        System.out.println("Output : " + output);
    }
}
