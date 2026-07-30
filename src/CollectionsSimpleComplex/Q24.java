package CollectionsSimpleComplex;

import java.util.TreeMap;

public class Q24 {

    public static void main(String[] args) {

        TreeMap<Integer, String> events = new TreeMap<>();

        events.put(100, "A");
        events.put(200, "B");
        events.put(350, "C");
        events.put(500, "D");

        int query = 300;

        Integer floor = events.floorKey(query);
        Integer ceiling = events.ceilingKey(query);

        System.out.println("Query = " + query);
        System.out.println("Floor Key = " + floor);
        System.out.println("Ceiling Key = " + ceiling);
    }
}
