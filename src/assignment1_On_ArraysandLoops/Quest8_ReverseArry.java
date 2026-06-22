package assignment1_On_ArraysandLoops;

public class Quest8_ReverseArry {

    static void main() {

        /*
        Problem Statement:
            Given: int[] arr = {10, 25, 38, 47, 56, 62, 71}
            Reverse the array without creating a second array. Print before and after.

        Expected Output:
            Original : 10 25 38 47 56 62 71
            Reversed : 71 62 56 47 38 25 10

        Constraints:
            • No second array. No Collections or utility methods.
            • For loop must iterate only arr.length / 2 times.
            • Use a separate for loop just for printing — keep printing logic clean
         */

        int arr[] = {10,25,38,47,56,62,71};
        System.out.print("Original :\t");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n Reversed :\t");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+"\t");
        }

        //using swap
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            System.out.print(arr[i]+"\t");
        }
    }
}

