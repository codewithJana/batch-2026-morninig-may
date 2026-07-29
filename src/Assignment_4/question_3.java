package Assignment_4;
import java.util.ArrayList;
import java.util.Arrays;
public class question_3 {
    static void main() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int k = 3;
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = input.size() - k; i < input.size(); i++) {  //for(int i = 7-3; i < 7; i++)  ( int i=4; i<7; i++)
            output.add(input.get(i));
        }
        for (int i = 0; i < input.size() - k; i++) {       // for( int i=0; i<7-3; i++) (int i=0; i<4; i++)
            output.add(input.get(i));
        }
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
