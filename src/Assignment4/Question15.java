package Assignment4;

import java.util.TreeSet;

public class Question15 {
    static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        int x=25;

        System.out.println("FLoor: " +set.floor(x));
        System.out.println("Ceiling: "+set.ceiling(x));
    }
}
