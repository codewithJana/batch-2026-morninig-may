package Assignment_4;

import java.util.ArrayDeque;

public class question_6 {
    static void main() {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the stack
        System.out.println("Stack: " + stack);

        // romoves the top element and display it
        System.out.println("Pop: " + stack.pop());

        // Returns the top element without removing it
        System.out.println("Peek: " + stack.peek());

        // Display the remaining stack
        System.out.println("Stack after pop: " + stack);
    }
}
