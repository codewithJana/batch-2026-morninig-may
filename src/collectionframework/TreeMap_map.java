package collectionframework;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMap_map {

    static void main(String[] args) {
        TreeMap<Integer,String> students = new TreeMap<>();
        students.put(103,"Rahul");
        students.put(105,"Petr");
        students.put(102,"James");
        students.put(106,"Admin");
        students.put(101,"user");

        System.out.println(students);
        System.out.println(students.firstEntry());
        System.out.println(students.firstKey());

        TreeMap<Integer,String> students_dec = new TreeMap<>(Collections.reverseOrder());
        students_dec.put(103,"Rahul");
        students_dec.put(105,"Petr");
        students_dec.put(102,"James");
        students_dec.put(106,"Admin");
        students_dec.put(101,"user");

        System.out.println(students_dec);
    }
}
