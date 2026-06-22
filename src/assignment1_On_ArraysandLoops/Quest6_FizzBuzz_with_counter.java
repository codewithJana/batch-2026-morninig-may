package assignment1_On_ArraysandLoops;

public class Quest6_FizzBuzz_with_counter {
    static void main() {
        /*
        Problem Statement:
            Print numbers from 1 to 50 using a for loop with the following rules:
        Requirements:
            • If divisible by both 3 and 5 → print "FizzBuzz"
            • If divisible by 3 only → print "Fizz"
            • If divisible by 5 only → print "Buzz"
            • Otherwise → print the number
            • At the end, print the total count of times "FizzBuzz" was printed
        Expected Output:
            1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz ...
            FizzBuzz count: 3

        * */
        //using for loop to print 1 to 50 with if else
        int count=0;
        for(int i=1;i<=50;i++)
        {
            if((i%3==0)&& (i%5==0)) // checks whether num is divisible by 3 and 5
            {

                count++;        // if num is divisble by both 3 and 5, increment the counter variable
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){        // checks whether num is divisble by 3
                System.out.println("Fizz");
            }
            else if (i%5==0) {      //checks whether num is divisble by 5
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
            System.out.println("FizzBuzz count :"+ count); // prints the occurrence of count
        }
    }

