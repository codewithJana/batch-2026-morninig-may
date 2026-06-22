package assignment1_On_ArraysandLoops;

public class Quest4_Do_while_Untilusersays_Stop {

    static void main() {
        /*
        Q4. Do-While: Print Until User Says Stop
            Problem Statement:
                Simulate a program that prints a countdown from a given number down to 1 using a do-while loop.
                Given: int start = 5. Print each number, then print "Go!" after the loop ends.
            Expected Output:
                5
                4
                3
                2
                1
                Go!
            Constraints:
                • Must use do-while — not a for or while loop.
                • Decrement must happen inside the loop body (n--).
                • Print "Go!" outside the loop after it finishes
         */
        int num=5;
        do{
            System.out.println(num);
            num--;
        }while(num>1);
                {

                    System.out.println(num);

                }
        System.out.println("Go!");

    }
}
