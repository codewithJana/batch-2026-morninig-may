package hashset;

import java.util.HashSet;
import java.util.Set;

public class FindUnionAndIntersection {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int n : a)
            setA.add(n);

        for (int n : b)
            setB.add(n);

        // Union
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}