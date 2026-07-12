package Assignment2;

public class Question11 {
    static void main(String[] args) {

        Boolean outer=false;
        for (int i = 1; i <= 3 && !outer; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    outer=true;
                    break;
                }
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        System.out.println("Done");
    }
}