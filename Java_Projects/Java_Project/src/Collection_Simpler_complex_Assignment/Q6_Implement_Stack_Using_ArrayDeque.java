//package Collection_Simpler_complex_Assignment;

import java.util.ArrayDeque;
public class Q6_Implement_Stack_Using_ArrayDeque {
}
/* Implement push, pop, and peek operations for a stack of integers using only java.util.ArrayDeque (do not use
java.util.Stack).
Input push 1, push 2, push 3, pop(), peek()
Output pop() returns 3, peek() returns 2
Focus on: ArrayDeque.push()/pop()/peek() work on the head — never use addLast()/removeLast() for this by mistake.*/
static void main() {
    ArrayDeque ad = new ArrayDeque();
    ad.push(1);
    ad.push(2);
    ad.push(3);

   System.out.println("pop() retrurn: "+ad.pop());
   System.out.println("peek() return: "+ad.peek());
}