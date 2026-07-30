package Assignment4;

import java.util.LinkedList;

public class Question4 {
    static void main(String[] args) {
        LinkedList<Integer> stack=new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Last Number in Stack : "+stack.peekLast());
        System.out.print("stack pop order: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

        //Queue

        LinkedList<Integer>Queue=new LinkedList<>();
        Queue.offer(10);
        Queue.offer(20);
        Queue.offer(30);

        System.out.println("Last Number in Queue : "+Queue.peekLast());

        System.out.print("Queue poll Order: ");

        while(!Queue.isEmpty()){
            System.out.print(Queue.poll()+" ");
        }
        System.out.println();

    }
}
