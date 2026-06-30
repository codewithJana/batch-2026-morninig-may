package assignment1;

/**
 * Implements standard screening logic utilizing tiered modulo constraints.
 * Tracks specific business criteria matches via independent counter variables.
 */
public class FizzBuzzCounter {
    public static void main(String[] args) {
        int fizzBuzzCount = 0;

        for (int i = 1; i <= 50; i++) {
            // Critical Priority: Evaluate composite criteria first to prevent false captures
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
                fizzBuzzCount++;
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nFizzBuzz count: " + fizzBuzzCount);
    }
}