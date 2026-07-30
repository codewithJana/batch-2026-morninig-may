package CollectionsSimpleComplex;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q5 {
    static void main(String[] args) {

        LinkedList input = new LinkedList<>();

        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        System.out.println("input = " + input);

        ListIterator itr = input.listIterator((input.size()));

        while (itr.hasPrevious()) {
            System.out.print(itr.previous());

            if (itr.hasPrevious()) {
                System.out.print(", ");
            }
        }
    }
}
