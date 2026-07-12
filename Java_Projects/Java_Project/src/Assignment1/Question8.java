/*
Problem Statement:
Given: int[] arr = {10, 25, 38, 47, 56, 62, 71}
Reverse the array without creating a second array. Print before and after.
Requirements:
• Use a for loop that runs only up to arr.length / 2 iterations
• Swap elements from both ends moving towards the center using a temp variable
• Print the original array first, then the reversed array (use a separate for loop to print)
Expected Output:
Original : 10 25 38 47 56 62 71
Reversed : 71 62 56 47 38 25 10
 */
package Assignment1;

public class Question8 {
    static void main() {
        int[] originalArr = {10, 25, 38, 47, 56, 62, 71};
        //        int[] ReverseArr ;

        System.out.print("Original : ");
        for(int i=0;i< originalArr.length;i++) {
            System.out.print(originalArr[i] + " ");
        }
        int start = 0;
        int end = originalArr.length - 1;
          for(int j=0;j <originalArr.length/2;j++) {
              int temp = originalArr[start];
              originalArr[start] = originalArr[end];
              originalArr[end] = temp;

              start++;
              end--;
          }

                  System.out.print("\nReversed : ");
          for(int i =0;i<originalArr.length;i++) {
              System.out.print(originalArr[i] + " ");
          }
        }
    }

