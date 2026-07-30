package Assignment4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Question5 {
    static void main(String[] args) {
        LinkedList<Integer> nums=new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Correct Order: "+nums);

        ListIterator<Integer> numsIterator= nums.listIterator(nums.size());

        System.out.print("Reversed Order: ");

        while(numsIterator.hasPrevious()){
            System.out.print(numsIterator.previous()+" ");
        }
        System.out.println();
    }
}
