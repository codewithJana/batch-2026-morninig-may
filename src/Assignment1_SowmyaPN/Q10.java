package Assignment1_SowmyaPN;

public class Q10 {
    public static void main(String[] args) {
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };

        for (int row = 0; row < data.length; row++) {

            int sum = 0;

            for (int col = 0; col < data[row].length; col++) {
                sum = sum + data[row][col];
            }

            System.out.println("Row " + row + " Sum: " + sum);
        }
        for (int col = 0; col < data[0].length; col++) {
            int max = data[0][col];

            for (int row = 1; row < data.length; row++) {

                if (data[row][col] > max) {
                    max = data[row][col];
                }
            }

            System.out.println("Column " + col + " Max: " + max);
        }
    }
}