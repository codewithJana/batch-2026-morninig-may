package Collection_Simpler_complex_Assignment;

import java.util.*;


/* Q3. Rotate an ArrayList by k positions [Medium]
Rotate an ArrayList<Integer> to the right by k positions in-place (k can be greater than list size).
Input list = [1,2,3,4,5,6,7], k = 3
Output [5,6,7,1,2,3,4]
Focus on: Collections.rotate(), or List.subList() + addAll() to build the rotated result manually.*/
public class Q3_Rotate_Arraylist_k_position {
    static void main() {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println("Input Array list:"+arr1);

    int k = 3;
    // java supports inbuilt functionality : to rotate element position
        Collections.rotate(arr1,k);
        System.out.println("After roration by 3:"+arr1);
    }

}
