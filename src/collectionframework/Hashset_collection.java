package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_collection {
    static void main(String[] args) {

        Set<String> set = new HashSet<>(1000,0.90f);
        set.add("Apple");
        set.add("Banana");
        set.add("cherry");
        set.add("pineapple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set values are: "+set);
        //remove object
        set.remove("cherry");
        System.out.println("After removed: "+ set);
        //contains
        System.out.println("contains pineapple? :"+set.contains("pineapple"));

        // convery to array
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));

        //iterator
        Iterator<String> it = set.iterator();;
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Integer[] array = {1,2,3,4,5,6,6};
        Set<Integer> num = new HashSet<>(Arrays.asList(array));
        System.out.println(num);


    }
}
