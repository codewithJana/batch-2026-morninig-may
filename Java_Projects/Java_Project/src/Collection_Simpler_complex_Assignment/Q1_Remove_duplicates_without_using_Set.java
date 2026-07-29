package Collection_Simpler_complex_Assignment;

import java.util.ArrayList;

public class Q1_Remove_duplicates_without_using_Set {
    /*
    Problem statement:
    Given an ArrayList<Integer> containing duplicate values, remove the duplicates in-place (or return a new list) without
using any Set implementation.
input : [4, 2, 4, 7, 2, 9, 4]
     */

    static void main() {
        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(4);
        arr1.add(2);
        arr1.add(4);
        arr1.add(7);
        arr1.add(2);
        arr1.add(9);
        arr1.add(4);

//        ArrayList<Integer> List = new ArrayList<>();
System.out.println("Input Array: "+arr1);
for(int i = 0;i < arr1.size();i++){
    for(int j= i +1;j < arr1.size();)
    {
        if(arr1.get(i).equals(arr1.get(j)))
        {
            arr1.remove(j);
        }
        else {
            j++;
        }

    }
   }
        System.out.println("Output Array:"+arr1);
    }
}
