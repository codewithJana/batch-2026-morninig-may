package assignment1_On_ArraysandLoops;

public class Quest5_Skip_A_Num_using_Continue {

    static void main() {
    /*
        Problem Statement:
            Write a Java program that prints numbers from 1 to 10 using a for loop.
            Skip the number 5 using the continue statement. All other numbers should be printed.
        Expected Output:
            1 2 3 4 6 7 8 9 10
        Constraints:
            • Must use continue — do not use if-else with print inside.
            • All 9 numbers (1–10 except 5) must appear on a single line separated by spaces.
            • No arrays needed — just a loop variable.

     */
        //initializing for loop till num 10
        for (int i = 1; i <= 10; i++) {
            if(i==5)
            {
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
