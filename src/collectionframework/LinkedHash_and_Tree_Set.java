package collectionframework;

import java.util.*;

public class LinkedHash_and_Tree_Set {
    static void main(String[] args) {
        //default linkedhashset object
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //default linkedhashset object with capacity & load
        LinkedHashSet<String> linkedHashSet_with_capacity = new LinkedHashSet<>(200,080f);

        linkedHashSet.add("mango");
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("apple");
        linkedHashSet.add("cherry");

        System.out.println(linkedHashSet);

        //from collections
        ArrayList<String> carlist =  new ArrayList<>();
        carlist.add("BMW");
        carlist.add("BENZ");
        carlist.add("VOLVO");
        carlist.add("VOLVO");
        System.out.println("ArrayList: "+carlist);

        //overloaded with arraylist
        LinkedHashSet<String> carset = new LinkedHashSet<>(carlist);
        System.out.println("LinkedHashSet: "+carset);

        //remove
        carset.remove("VOLVO");
        System.out.println("After remove volvo: "+carset);

        //Add all
        carset.addAll(Arrays.asList("KIA","FORD","TATA","Maruthi","Lambogini"));
        System.out.println("After added list of cars: "+carset );

        //removeall
        carset.removeAll(Arrays.asList("KIA","FORD"));
        System.out.println("After removed the KIA and Ford: "+carset);

        System.out.println("//------------------------------------------------------------------------------------");

        //treeset - default: Ascending order
        TreeSet<Integer> treeset = new  TreeSet<>();
        treeset.add(10);
        treeset.add(5);
        treeset.add(8);
        treeset.add(2);

        System.out.println("TreeSet: "+treeset);

        //override : descending order
        TreeSet<Integer> treeset_dec = new  TreeSet<>(Collections.reverseOrder());
        treeset_dec.add(10);
        treeset_dec.add(5);
        treeset_dec.add(8);
        treeset_dec.add(2);

        System.out.println("TreeSet_dec: "+treeset_dec);

        //get first data
        System.out.println(treeset.first());

        //get last data
        System.out.println(treeset.last());

        //higher
        System.out.println(treeset.higher(8));

        //remove firstelem
        System.out.println("Remove first element: "+treeset.pollFirst());

        //remove lastelem
        System.out.println("Remove last element: "+treeset.pollLast());

        //print treeset
        System.out.println(treeset);



    }
}




























