package Assignment_4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class question_1 {
    static void main() {
        ArrayList<Integer> input= new ArrayList<>(Arrays.asList(4, 2, 4, 7, 2, 9, 4));
        ArrayList<Integer> output= new ArrayList<>();
        for(int num:input){
            if(!output.contains(num)){ // Check if the current element is already present in the output lisi if not then add it to output
                output.add(num);
            }

        }
        System.out.println("input: "+ input);
        System.out.println("output: "+ output);
    }
}
