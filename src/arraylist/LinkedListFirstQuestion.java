package arraylist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedListFirstQuestion {

	public static void main(String[] args) {
		
		Stack<Integer> stackpush=new Stack<>();
		stackpush.add(10);
		stackpush.add(20);
		stackpush.add(30);
		
		System.out.println(stackpush.pop());
		System.out.println(stackpush.pop());
		System.out.println(stackpush.pop());
		
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
	}

}
