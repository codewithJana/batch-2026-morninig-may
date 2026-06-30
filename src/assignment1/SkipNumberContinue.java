package assignment1;

/**
 * Implements granular loop flow control skipping via jump operations.
 * Isolates exact data matching blocks from standard logging sequences.
 */
public class SkipNumberContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            // Check if the iteration matches the exclusion target parameter
            if (i == 5) {
                continue; // Immediately jumps straight to the next loop increment cycle
            }
            // Standard space separation formatting across a single line output
            System.out.print(i + " ");
        }
        System.out.println(); // Standard line break closure
    }
}