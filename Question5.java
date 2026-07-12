/*
Problem Statement:
Write a Java program that prints numbers from 1 to 10 using a for loop.
Skip the number 5 using the continue statement. All other numbers should be printed.
Requirements:
• Use a for loop from 1 to 10
• Inside the loop, use an if statement to check if i == 5
• If i equals 5, use continue to skip to the next iteration
• Print all other numbers normally
Expected Output:

1 2 3 4 6 7 8 9 10
 */
package Assignment1;

public class Question5 {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.print(" " +i);
        }
    }
}