public class Array {

    public static void main(String[] args) {

       int[][] marks = {
                {1, 2},
                {3, 4}
        };

        System.out.println("Matrix 2*2:");
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {

                System.out.print(marks[row][col] +" ");
            }
            System.out.println();
        }

        int [][] data = new int[3][3];
        data[0][0] = 90;
        data[0][1] = 80;
        data[0][2] = 70;

        data[1][0] = 90;
        data[1][1] = 80;
        data[1][2] = 70;

        data[2][0] = 90;
        data[2][1] = 80;
        data[2][2] = 70;
        System.out.println("Matrix 3*3:");
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c] + "\t");
            }
            System.out.println();
        }
    }
 };
