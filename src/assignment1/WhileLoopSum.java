package assignment1;

/**
 * Calculates the total cumulative sum of numbers within an inclusive range.
 * Leverages a state-monitored while loop to process values sequentially.
 */
public class WhileLoopSum {
    public static void main(String[] args) {
        int i = 1;       // Initialize the tracking loop variable
        int sum = 0;     // Accumulator pattern tracking variable

        // Loop execution persists while the constraint condition evaluates to true
        while (i <= 20) {
            sum += i;    // Add current integer value to the ongoing total
            i++;         // Increment explicitly at the end to prevent an infinite loop scenario
        }

        System.out.println("Sum of 1 to 20 = " + sum);
    }
}
