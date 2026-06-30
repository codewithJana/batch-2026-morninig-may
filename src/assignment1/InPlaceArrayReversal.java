package assignment1;

/**
 * Reverses structural array elements in-place to ensure memory efficiency.
 * Processes spatial variable updates strictly across a central cutoff index.
 */
public class InPlaceArrayReversal {
    public static void main(String[] args) {
        int[] arr = {10, 25, 38, 47, 56, 62, 71};

        // Render original array elements cleanly using a distinct loop block
        System.out.print("Original: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Perform spatial swap transformations up to the midpoint index boundary
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Render updated data alignment cleanly
        System.out.print("Reversed: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}