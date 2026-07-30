package Assignment4;

import java.util.TreeSet;

public class Question17 {

    static void main(String[] args) {
        //int[] set={5,10,15,20,25,30};
        TreeSet<Integer> ele=new TreeSet<>();
        ele.add(5);
        ele.add(10);
        ele.add(15);
        ele.add(20);
        ele.add(25);
        ele.add(30);
        int low=10;
        int high=25;

        System.out.println(ele.subSet(low,true,high,true));

    }
}
