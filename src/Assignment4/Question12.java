package Assignment4;

import java.util.HashSet;
import java.util.Set;

public class Question12 {
    static void main(String[] args) {

        //int[] arr={1,2,3,4,5};
        HashSet<Integer> arr=new HashSet<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
       // int[] arr1={3,4,5,6,7};
        HashSet<Integer> arr1=new HashSet<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        HashSet<Integer>Union=new HashSet<>(arr);
        Union.addAll(arr1);
        System.out.println("Union: "+ Union);
        arr1.retainAll(arr);
        System.out.println("Intersection: "+arr1);


    }
}
