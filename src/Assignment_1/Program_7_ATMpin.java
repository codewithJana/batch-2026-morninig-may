package Assignment_1;

public class Program_7_ATMpin {

    public static void main(String[] args) {

        int correctPin = 4521;
        int maxAttempts = 3;
        int attemptCount = 0;

        int attempt1 = 1234;
        int attempt2 = 0000;
        int attempt3 = 4521;

        while (attemptCount < maxAttempts) {
            int enteredPin = 0;

            if (attemptCount == 0) {
                enteredPin = attempt1;
            } else if (attemptCount == 1) {
                enteredPin = attempt2;
            } else if (attemptCount == 2) {
                enteredPin = attempt3;
            }

            attemptCount++;

            if (enteredPin == correctPin) {
                System.out.println("Access Granted. Welcome!");
                break;
            } else {
                int remainingAttempts = maxAttempts - attemptCount;
                System.out.println("Incorrect PIN. " + remainingAttempts + " attempt(s) remaining.");
            }
        }

        if (attemptCount == maxAttempts && !true) {

        }
        if (attemptCount == maxAttempts && (attempt3 != correctPin)) {
            System.out.println("Card Blocked. Contact your bank.");
        }
    }
}