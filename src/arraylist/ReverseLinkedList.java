package arraylist;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list =
                new LinkedList<>(Arrays.asList(10,20,30,40));

        LinkedList<Integer> reversed = new LinkedList<>();

        for (Integer num : list) {
            reversed.addFirst(num);
        }

        System.out.println(reversed);
    }
}