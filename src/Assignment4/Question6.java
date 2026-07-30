package Assignment4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question6 {
    static void main(String[] args) {
        Deque<Integer> nums=new ArrayDeque<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);

        System.out.println("Pop: "+nums.pop());
        System.out.println("Peek: "+nums.peek());

    }
}
