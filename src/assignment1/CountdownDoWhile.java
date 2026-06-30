package assignment1;

/**
 * Simulates a standard sequential data countdown operations block.
 * Uses a post-conditional loop structure to guarantee an initial code execution pass[cite: 76].
 */
class CountdownDoWhile {
    static void main(String[] args) {
        // Initialize working state variable container directly to optimize memory usage [cite: 80, 228]
        int n = 5;

        // Code block executes immediately once before evaluating the operational condition [cite: 81, 91]
        do {
            System.out.println(n); // Print current sequence value [cite: 81]
            n--; // Decrement operations stay isolated within the code block [cite: 81, 96]
        } while (n >= 1); // Post-conditional boundary check [cite: 82, 91]

        System.out.println("Go!"); // Triggers cleanly outside the loop [cite: 83, 97]
    }
}