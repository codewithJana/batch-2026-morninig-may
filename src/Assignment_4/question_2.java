package Assignment_4;

import java.util.ArrayList;
import java.util.Arrays;

public class question_2 {
    static void main() {
        ArrayList<Integer>input= new ArrayList<>(Arrays.asList(12, 45, 2, 41, 45, 7));
        int largest= input.get(0);
        int second_largest= 0;
        for(int num:input){
            if(num>largest){
                second_largest= largest;
                largest=num;
            } else if (num>second_largest && num!=largest) {
                second_largest=num;
            }
        }
        System.out.println("input:"+input);

        System.out.println("second_largest:"+second_largest);
    }
}
