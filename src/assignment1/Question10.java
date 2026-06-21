package assignment1;

public class Question10 {
    public static void main(String[] args) {

        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };

        // Sum of each row
        System.out.println("Row Sums:");
        for (int i = 0; i < data.length; i++) {
            int sum = 0;

            for (int j = 0; j < data[i].length; j++) {
                sum = data[i][j] + sum;
            }

            System.out.println("Row " + (i) + " Sum = " + sum);
        }

        //  Maximum value in each column
        System.out.println("\nColumn Maximums:");
        for (int j = 0; j < data[0].length; j++) {
            int max = data[0][j];

            for (int i = 0; i < data.length; i++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }

            System.out.println("Column " + (j) + " Max = " + max);
        }
    }
}
