package assignment1_On_ArraysandLoops;

public class Quest1_PrintNum1to10 {

    //Q1. Print Numbers 1 to 10
     /* Problem Statement:
            Write a Java program to print all numbers from 1 to 10 using a for loop.
            On the same line below, also print whether each number is Even or Odd.
        Expected Output:
            1 -> Odd
            2 -> Even
            3 -> Odd
            ... up to ...
            10 -> Even
        Constraints:
            • Use a for loop only — no while or do-while.
            • Use % 2 to determine even/odd. No built-in methods.
            • Each number must be on its own line
    */
    static void main() {

        int num;

        //using for loop to print num 1 to 10

        for(num=1; num<=10; num++)
        {
            //To check whether its odd or even
            if(!(num%2==0))
                System.out.println(num + " -> Odd");
            else
                System.out.println(num + " -> Even");
        }
    }
}
