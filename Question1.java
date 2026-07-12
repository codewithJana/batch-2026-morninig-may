/* Problem Statement:Write a Java program to print all numbers from 1 to 10 using a for loop.
On the same line below, also print whether each number is Even or Odd.
Requirements:
• Use a for loop with loop variable starting at 1 and ending at 10
• Inside the loop, use an if-else to check even or odd using the % operator
• Print format: "1 -> Odd", "2 -> Even", and so on
Expected Output:
1 -> Odd
2 -> Even
3 -> Odd
... up to ...
10 -> Even    */

public class Question1 {

    static void main() {

        for(int num =1;num <=10;num++)
        {
            if (num %2 == 0)
            {
                System.out.println(num+"-> Even");
            }
           else
           {
                System.out.println(num+"-> Odd");
            }
        }
    }
}
