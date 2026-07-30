package CollectionsSimpleComplex;

import java.util.LinkedList;

public class Q4 {
    static void main(String[] args) {


        LinkedList<Integer> input = new LinkedList<Integer>();

        input.push(10);
        input.push(20);
        input.push(30);

        System.out.println("input = " + input);

        System.out.print("Stack Pop Order: ");
        while (!input.isEmpty()) {
            System.out.print(input.pop());
            if (!input.isEmpty()) {
                System.out.print(", ");
            }
        }

        System.out.println();

        input.offer(10);
        input.offer(20);
        input.offer(30);

        System.out.println("input = " + input);

        System.out.print("Queue Poll Order: ");
        while (!input.isEmpty()) {
            System.out.print(input.poll());
            if (!input.isEmpty()) {
                System.out.print(", ");
            }
        }
    }

}
