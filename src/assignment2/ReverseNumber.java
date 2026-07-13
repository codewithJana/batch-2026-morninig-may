package assignment2;

import java.util.Scanner;

    public class ReverseNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            boolean isNegative = num < 0;

            if (isNegative) {
                num = -num;
            }

            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (isNegative) {
                reverse = -reverse;
            }

            System.out.println("Reversed Number: " + reverse);

            sc.close();
        }
}
