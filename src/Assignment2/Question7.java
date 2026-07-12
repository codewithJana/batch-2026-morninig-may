package Assignment2;

public class Question7 {
    static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {//1<=5
            for (int j = 1; j <= n - i; j++) {//1<=4
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


