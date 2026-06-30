package assignment1;

/**
 * Simulates a stateful security verification interface loop.
 * Monitors access lifecycle limitations using variable mock injections.
 */
public class AtmPinValidator {
    public static void main(String[] args) {
        int correctPin = 4521;
        int attempts = 1;

        while (attempts <= 3) {
            int enteredPin;

            // Map simulated variable state tracking values sequentially per loop pass
            if (attempts == 1) enteredPin = 1234;
            else if (attempts == 2) enteredPin = 0000;
            else enteredPin = 4521;

            if (enteredPin == correctPin) {
                System.out.println("Access Granted. Welcome!");
                break; // Exit the state tracking loop immediately upon matching validation
            } else {
                // Decrement the calculated remaining value prior to printing the output string
                int remaining = 3 - attempts;
                if (remaining > 0) {
                    System.out.println("Incorrect PIN. " + remaining + " attempt(s) remaining.");
                } else {
                    System.out.println("Card Blocked. Contact your bank.");
                }
            }
            attempts++;
        }
    }
}