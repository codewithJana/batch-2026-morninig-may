package collectionframework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_LinkedList {

    static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        //add method --> add new element, --> Throw exception if the insertion is failed
        /*
        if i set capacity to 4
         */
        queue.add("Jana");
        queue.add("Peter");
        queue.add("Mary");
        System.out.println(queue);

        //offer method --> Same as 'add' method, It will not throw exception if insertion failed
        queue.offer("John");
        queue.offer("James");
        System.out.println(queue);

        //remove method --> it will throw exception, if removal is failed
        queue.remove("John");
        System.out.println(queue);
        queue.remove("harry");   //if the queue is empty , we are trting to remove the elements --throw Exception
        System.out.println(queue);
        System.out.println("Remove all" +queue.remove());
        System.out.println(queue);
        queue.poll(); //---> if the quque is empty, it will retuen null instead of throw
        System.out.println(queue.poll());

        Queue<String> students = new LinkedList<>();
        students.add("Jane");
        students.add("Peter");
        students.add("Mary");
        System.out.println("Students queue:" + students);
        //element
        System.out.println("element method usage "+students.element());

        //peek
        System.out.println("peek method usage "+students.peek());


        Queue<String> queue1 = new ArrayBlockingQueue<>(3);
        queue1.offer("Jane");
        queue1.offer("Peter");
        queue1.offer("Mary");
        queue1.offer("John");
        System.out.println(queue1);
        System.out.println("program end");

        System.out.println(students.contains("xxx"));



        /*
        add()   --> exception , commonlyused
        Offer() --> false, preferred in Queue (Arrayblockingqueue class)

        remove() --> remove element, Throw exception if the list/queue is empty
        poll() -->  Remove the eleme,return null if the list/queue is empty

        element() --> Doesnt remove, get the first element, Throw exception if the list/queue is empty
        peek() --> Doesnt remove, get the first element, return null if the list/queue is empty


         */


    }

}
