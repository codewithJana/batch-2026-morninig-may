package assignment1;

/**
 * Validates sequential numbers within a set range and prints their parity.
 * Employs standard conditional block structures for baseline evaluation.
 */
public class EvenOddPrinter {
    public static void main(String[] args) {

        // Loop sequentially from 1 to 10 inclusive
        for (int i = 1; i <= 10; i++) {

            // Evaluate if the current number is perfectly divisible by 2
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }
}