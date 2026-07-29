package Collection_Simpler_complex_Assignment;

import java.util.LinkedList;

/* Q4. Use LinkedList as both Stack and Queue [Easy]
Using a single java.util.LinkedList<Integer>, demonstrate Stack behavior (push/pop/peek) and Queue behavior
(offer/poll/peek) and print the resulting order for each.
Input push 10, push 20, push 30 (stack) | offer 10, offer 20, offer 30 (queue)
Output Stack pop order: 30, 20, 10 | Queue poll order: 10, 20, 30
Focus on: push()/pop()/peek() vs offer()/poll()/peek() — know which end each operates on. */
public class Q4_Linkedlist_stack_Queue {

    static void main() {
LinkedList<Integer> stack = new LinkedList();

stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("Top Element: " +stack.peek());
// added value using push()  in stack :: pop stack print
System.out.print("Pop order:");
while(!stack.isEmpty()){
    System.out.print("    "+stack.pop());
}

LinkedList<Integer> queue = new LinkedList<>();
queue.offer(10);
queue.offer(20);
queue.offer(30);

        System.out.println("");
System.out.println("Queue elements:"+queue);

System.out.print("poll order:");
while(!queue.isEmpty())
{
    System.out.print("  " +queue.poll()); //it will return in same sequence data is inserted. FIFO manner
}
    }
}
