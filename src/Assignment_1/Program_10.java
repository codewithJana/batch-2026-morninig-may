package Assignment_1;

public class Program_10 {

    public static void main(String[] args) {

        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };

        for (int i = 0; i < data.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < data[i].length; j++) {
                rowSum = rowSum + data[i][j];
            }

            System.out.println("Row " + i + " Sum: " + rowSum);
        }

        for (int col = 0; col < data[0].length; col++) {

            int maxVal = data[0][col];

            for (int row = 0; row < data.length; row++) {
                if (data[row][col] > maxVal) {
                    maxVal = data[row][col];
                }
            }

            System.out.println("Column " + col + " Max: " + maxVal);
        }
    }
}
