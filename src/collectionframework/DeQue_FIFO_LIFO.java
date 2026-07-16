package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeQue_FIFO_LIFO {
    static void main(String[] args) {

        ArrayDeque<String> queue = new ArrayDeque<>(); //-->preferred
        Deque<String> deque = new LinkedList<>();

        //Queue ----- DeQue
        //add values
        queue.add("harry");
        queue.add("peter");
        System.out.println("Add values using add method: "+queue);
        //add first
        queue.addFirst("John");
        System.out.println("Add values using addFirst method: "+queue);
        //add Last
        queue.addLast("James");
        System.out.println("Add values using addLast method: "+queue);
        //Remove First
        queue.removeFirst();
        System.out.println("Remove values using removeFirst method: "+queue);
        //remove last
        queue.removeLast();
        System.out.println("Remove values using removeLast method: "+queue);
        //viewFirst
        String firstElem =  queue.peekFirst();
        System.out.println(firstElem);
        //viewLast
        String lastElem =  queue.peekLast();
        System.out.println(lastElem);

        //Stack Methods
        //push data into stack
        queue.push("Jana");
        System.out.println("Add values using push method: "+queue);
        queue.push("Kishor");
        System.out.println("Add values using push method: "+queue);
        //pop data from stack
        queue.pop();
        System.out.println("Remove values using pop method: "+queue);
        queue.pop();
        System.out.println("Remove values using pop method: "+queue);
    }
}
