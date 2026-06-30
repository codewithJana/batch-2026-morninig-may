/*
Problem Statement:
Write a Java program to calculate the sum of all numbers from 1 to 20 using a while loop.
Print the sum at the end.
Requirements:
• Declare an int variable i = 1 and a sum variable initialized to 0
• Use a while loop with condition i <= 20
• Add i to sum inside the loop and increment i at the end of each iteration
• Print the final sum after the loop
Expected Output:
Sum of 1 to 20 = 210

Interview Note: A very common question to test while loop basics. Key thing interviewers watch:
increment i inside the loop. Forgetting i++ causes an infinite loop — the most common beginner
mistake.
Constraints:
• Must use a while loop — not a for loop.
• Use only int variables. No arrays.
• Do not use any formula shortcut (n*(n+1)/2) — the loop must do the work.
 */

public class Assignment2 {
    static void main() {
        int i = 1;
        int sum = 0;
        while(i<=20)
        {
          sum = sum + i;
          i++;
        }
        System.out.println("Sum of 1 to 20 =" +sum);
    };
}
