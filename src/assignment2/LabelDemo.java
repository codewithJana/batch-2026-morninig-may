package assignment2;

public class LabelDemo{
    public static void main(String[] args) {

        boolean stop = false;

        for (int i = 1; i <= 3 && !stop; i++) {
            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    stop = true;
                    break;
                }
                System.out.print(i + "" + j + " ");
            }

            if (!stop) {
                System.out.println();
            }
        }

        System.out.println("Done");
    }
}