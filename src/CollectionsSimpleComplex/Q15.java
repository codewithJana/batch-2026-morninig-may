package CollectionsSimpleComplex;

import java.util.TreeSet;

public class Q15 {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        int x = 25;

        Integer floor = set.floor(x);
        Integer ceiling = set.ceiling(x);

        System.out.println("Floor : " + floor);
        System.out.println("Ceiling : " + ceiling);
    }
}
