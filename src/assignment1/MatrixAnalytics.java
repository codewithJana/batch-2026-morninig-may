package assignment1;

/**
 * Processes dimensional matrix spaces using distinct data tracking streams.
 * Computes horizontal data sums alongside vertical absolute maxima.
 */
public class MatrixAnalytics {
    public static void main(String[] args) {
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };

        // Part A: Row-Sum Calculation Loop Block Structure
        for (int row = 0; row < data.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < data[row].length; col++) {
                rowSum += data[row][col];
            }
            System.out.println("Row " + row + " Sum: " + rowSum);
        }

        // Part B: Column-Maximum Selection Loop Block Structure
        int totalColumns = data[0].length;
        for (int col = 0; col < totalColumns; col++) {

            // Core standard habit: initialize search bounds using index zero references
            int maxVal = data[0][col];
            for (int row = 1; row < data.length; row++) {
                if (data[row][col] > maxVal) {
                    maxVal = data[row][col];
                }
            }
            System.out.println("Column " + col + " Max: " + maxVal);
        }
    }
}