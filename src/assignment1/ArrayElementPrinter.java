package assignment1;

/**
 * Performs dynamic sequential traversal over a linear data structure.
 * Prints data segments bound strictly to their zero-indexed locations.
 */
public class ArrayElementPrinter {
    public static void main(String[] args) {
        int[] marks = {85, 92, 67, 78, 55, 90};

        // Standard 0-indexed linear array boundary traversal
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + ": " + marks[i]);
        }

        // Print structural scale dynamically without hardcoding values
        System.out.println("Total elements: " + marks.length);
    }
}
