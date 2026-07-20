package collectionframework;

import javax.xml.transform.Source;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Collection {
    static void main(String[] args) {

        //QQueue will follow the insertion order
        Queue<Integer>queue = new LinkedList<>();
        queue.offer(45);
        queue.offer(12);
        queue.offer(78);
        queue.offer(3);
        queue.offer(67);
        System.out.println("The Queue is: "+queue);

        PriorityQueue<Integer> pr = new PriorityQueue<>();
        pr.offer(45);
        pr.offer(12);
        pr.offer(78);
        pr.offer(3);
        pr.offer(67);

        //print queue
        System.out.println("The Priority Queue of Min Heap is: "+pr);
        //view first element
        System.out.println("Peak: "+pr.peek());
        //remove first element
        System.out.println("Remove first elem: "+pr.poll());
        //after removal
        System.out.println("After remove - PriorityQueue: "+pr);
        //contains
        System.out.println("contain 45?: "+pr.contains(45));
        //size
        System.out.println("Size: "+pr.size());

        PriorityQueue<Integer> pr_Max = new PriorityQueue<>(Collections.reverseOrder());
        pr_Max.offer(45);
        pr_Max.offer(12);
        pr_Max.offer(78);
        pr_Max.offer(3);
        pr_Max.offer(67);

        //print queue
        System.out.println("The Priority Queue of Max Heap is: "+pr_Max);
        

    }
}
