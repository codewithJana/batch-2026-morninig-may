//package Collection_Simpler_complex_Assignment;

import java.util.ArrayList;

public class Q2_2nd_Largest_element_find {

    /* Q2. Find the second largest element [Easy]
Given an ArrayList<Integer>, find the second largest distinct element without sorting the whole list.
Input - [12, 45, 2, 41, 45, 7]
Output  - 41
Focus on: Single pass tracking two variables (largest, secondLargest); avoid Collections.sort() as the interviewer will usually ask for an
O(n) approach. */
}

static void main() {

    ArrayList<Integer> mylist = new ArrayList();
    mylist.add(12);
    mylist.add(45);
    mylist.add(2);
    mylist.add(41);
    mylist.add(45);
    mylist.add(7);

    System.out.println("Array Input: "+mylist);
int largest = mylist.get(0);

// To find largest element
    for(int i : mylist){
        if(i > largest){
            largest = i;
       }
    }
//To find second largest element
    int sec_large = Integer.MIN_VALUE;
    for(int i : mylist){
        if(i > sec_large &&  i <largest){
            sec_large = i;

        }
    }

    if(sec_large == Integer.MIN_VALUE){
        System.out.println("No second largest element.");
    }
    else {
        System.out.println("Second Largest element :"+sec_large);
    }
    System.out.println("Largest element."+largest);
}
