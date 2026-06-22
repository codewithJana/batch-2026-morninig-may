package assignment1_On_ArraysandLoops;

public class Quest3_Print_ArrayEle_UsingForLoop {

    static void main() {

        /*
            Q3. Print Array Elements Using For Loop
            Problem Statement:
                Given a 1D integer array: int[] marks = {85, 92, 67, 78, 55, 90}
                Use a for loop to print each element with its index position

            Expected Output:
                Index 0 : 85
                Index 1 : 92
                Index 2 : 67
                Index 3 : 78
                Index 4 : 55
                Index 5 : 90
                Total elements: 6

            Constraints:
                • Use for loop with index variable i starting at 0.
                • Use marks.length in the loop condition — do not hardcode 6.
                • No sorting or modification of the array.

         */
        int marks[]= {85,92,67,78,55,90};
        //initialize for loop & runs till size of array
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Index " + i + " : " + marks[i]);
        }
        System.out.println("Total Elements : "  + marks.length);
    }
}
