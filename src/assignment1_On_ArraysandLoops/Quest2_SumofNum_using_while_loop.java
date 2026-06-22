package assignment1_On_ArraysandLoops;

public class Quest2_SumofNum_using_while_loop {

    static void main() {
        //Q2. Sum of Numbers Using While Loop
        /*
        Problem Statement:
            Write a Java program to calculate the sum of all numbers from 1 to 20 using a while loop.
            Print the sum at the end.

         Expected Output:
            Sum of 1 to 20 = 210

          Constraints:
            • Must use a while loop — not a for loop.
            • Use only int variables. No arrays.
            • Do not use any formula shortcut (n*(n+1)/2) — the loop must do the work.

         */

            int i=1,sum=0;
            // Variable always be initialized if not exception/error to initialize

            //using while loop to check condition
            while(i<=20)
            {   //1+2+3+....+20
                sum=sum+i ;
                i++;

            }
             System.out.println("Sum of 1 to 20 = " + sum);
    }
}
