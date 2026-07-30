package CollectionsSimpleComplex;

import java.util.Arrays;
import java.util.HashSet;

public class Q12 {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] b = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(a));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(b));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("intersection = " + intersection);
        System.out.println("union = " + union);

    }
}
