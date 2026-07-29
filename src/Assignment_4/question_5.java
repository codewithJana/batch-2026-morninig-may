package Assignment_4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class question_5 {
    static void main() {
        LinkedList<Integer> input = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> output = new LinkedList<Integer>();

        // Add each element at the beginning of the output list
        for (Integer num : input) {
            output.addFirst(num);
        }

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
