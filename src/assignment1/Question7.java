package assignment1;

public class Question7 {
    public static void main(String[] args)
    {
       int correctPin = 4521;
       int enteredPin;
       int attempt = 1;

       while(attempt<=3) {
           if (attempt == 1) {
               enteredPin = 1234;
           } else if (attempt == 2) {
               enteredPin = 0;
           } else {
               enteredPin = 4521;
           }
           if (enteredPin == correctPin) {
               System.out.println("Access Granted. Welcome!");
               break;
           } else {
               System.out.println("Incorrect PIN. " + (3 - attempt) + " attempt(s) remaining.");
           }
           attempt++;
       }
           if (attempt > 3)
           {
               System.out.println("Card Blocked. Contact your bank.");
           }
    }
}
