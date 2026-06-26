package Assignment1_SowmyaPN;

public class Q7 {
    public static void main(String[] args) {
        int correctPin = 4521;
        int attempt = 1;
        int enteredPin;
        // While loop allows a maximum of 3 attempts
        while (attempt <= 3) {
            if (attempt == 1) {
                enteredPin = 1234;
            } else if (attempt == 2) {
                enteredPin = 0000;
            } else {
                enteredPin = 4521;
            }
            if (enteredPin == correctPin) {
                System.out.println("Access Granted. Welcome!");
                break;
            }
            else {
                int remainingAttempts = 3 - attempt;
                System.out.println("Incorrect PIN. " + remainingAttempts + " attempt(s) remaining.");
                attempt++;
            }
        }

        if (attempt > 3) {
            System.out.println("Card Blocked. Contact your bank.");
        }
    }
}