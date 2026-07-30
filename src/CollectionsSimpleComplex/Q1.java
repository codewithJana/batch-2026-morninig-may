package CollectionsSimpleComplex;

import java.util.ArrayList;

public class Q1 {
    static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(4);
        input.add(2);
        input.add(4);
        input.add(7);
        input.add(2);
        input.add(9);
        input.add(4);

        System.out.println("input = " + input);

        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int num : input){
            if (!output.contains(num)) {
                output.add(num);
            }
        }
        System.out.println("output = " + output);
    }
}
