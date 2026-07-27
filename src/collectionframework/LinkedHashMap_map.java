package collectionframework;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMap_map {
    static void main(String[] args) {
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>(17,0.85f,true);
        students.put(101,"Rahul");
        students.put(102,"Petr");
        students.put(103,"James");
        students.put(104,"Admin");

        System.out.println(students);

        System.out.println(students.get(103));

        System.out.println(students);

        System.out.println(students.keySet());

        System.out.println(students.get(101));

        System.out.println(students.keySet());


    }
}
