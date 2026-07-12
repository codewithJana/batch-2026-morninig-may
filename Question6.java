/* Problem Statement: Print numbers from 1 to 50 using a for loop with the following rules:
Requirements:
• If divisible by both 3 and 5 → print "FizzBuzz"
• If divisible by 3 only → print "Fizz"
• If divisible by 5 only → print "Buzz"
• Otherwise → print the number
• At the end, print the total count of times "FizzBuzz" was printed
Expected Output:
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz ...
FizzBuzz count: 3
 */

package Assignment1;

public class Question6 {
    static void main() {
        int sum =0;
        for(int i = 1; i <= 50; i++)
        {

            if((i %3) ==0 && (i%5) ==0)
            {
                System.out.println("FizzBuzz");

                sum += 1;
            } else if (i %3 == 0)
                {
                System.out.println("Fizz");
                }
            else if (i %5 == 0)
            {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("FizzBuzz count:" +sum);

    }
}
