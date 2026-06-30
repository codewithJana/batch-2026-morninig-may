package assignment1;

/**
 * Scans an integer array using a nested quadratic analysis approach.
 * Leverages tracking states to find duplicate elements without using Collections utilities.
 */
public class ArrayDuplicateFinder {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 2, 9, 4, 1, 7, 4};
        boolean[] visited = new boolean[nums.length];

        // Outer pass picks elements sequentially for frequency evaluation
        for (int i = 0; i < nums.length; i++) {

            // Skip processing if the element was caught in a previous cycle
            if (visited[i]) {
                continue;
            }

            int count = 1;
            // Inner pass calculates downstream occurrences matching the active target index
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true; // Mark matched positions to prevent duplicate logs later
                }
            }

            // Print output criteria matched cases exclusively
            if (count > 1) {
                System.out.println(nums[i] + " appears " + count + " times (duplicate)");
            }
        }
    }
}