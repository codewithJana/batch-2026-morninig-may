//package Collection_Simpler_complex_Assignment;

import java.util.LinkedList;

public class Q5_Reverse_LinkedList_withoutREVERSE {
    /* Reverse a LinkedList without Collections.reverse() [Medium]
Given a java.util.LinkedList<Integer>, reverse its order manually without calling Collections.reverse() or creating a new
list of a different type.
Input [1, 2, 3, 4, 5]
Output [5, 4, 3, 2, 1]
Focus on: ListIterator (which allows bidirectional traversal), or repeatedly calling addFirst() while polling from the original. */
}

static void main() {
    LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5));


    System.out.println(list);

    System.out.print("Reversal: ");
for(int i=0;i< list.size();i++){
    list.add(i,list.pollLast()); //have used mthod called pollLast()
    }
System.out.println(list);
}
