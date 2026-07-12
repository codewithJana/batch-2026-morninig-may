/* Problem Statement: Simulate a program that prints a countdown from a given number down to 1 using a do-while loop.
Given: int start = 5. Print each number, then print "Go!" after the loop ends.
Requirements:
• Initialize int n = start (which is 5)
• Use a do-while loop: print n inside the loop, then decrement n
• Loop condition: n >= 1
• After the loop, print "Go!" on a new line
Expected Output:
5
4
3
2
1
Go!
 */

package Assignment1;


public class Question4 {
    static void main() {
        int n = 5;
        do{
            System.out.println(+n);
            n --;
        }while(n>=1);
        System.out.println("Go!");
    }
}
