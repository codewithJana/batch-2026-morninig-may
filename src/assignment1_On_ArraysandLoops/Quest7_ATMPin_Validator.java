package assignment1_On_ArraysandLoops;

public class Quest7_ATMPin_Validator {

    static void main() {

        /* Q7. ATM PIN Validator with Retry Logic
        Problem Statement:
            Simulate an ATM PIN entry. Correct PIN: int correctPin = 4521.
            The user gets 3 attempts. Simulate entered PINs using variables per attempt.
        Requirements:
            • Use a while loop controlled by an attempt counter (max 3)
            • Simulate entered values: attempt 1 = 1234, attempt 2 = 0000, attempt 3 = 4521
            • If PIN matches, print "Access Granted. Welcome!" and exit using break
            • If wrong, print "Incorrect PIN. X attempt(s) remaining." and continue
            • If all 3 fail, print "Card Blocked. Contact your bank."
         Expected Output:
            Incorrect PIN. 2 attempt(s) remaining.
            Incorrect PIN. 1 attempt(s) remaining.
            Access Granted. Welcome!
         */
/*
        int correctPin = 4521, attempt1=1234, attempt2 = 0000, attempt3=4521, count=1;
        // while loop
        while(count<=3) {

            if (correctPin!=attempt1) {
                System.out.println("Incorrect PIN. 2 attempt(s) remaining");

            //else if (correctPin != attempt2) {
                    System.out.println("Incorrect PIN. 1 attempt(s) remaining");
                } else if (correctPin == attempt3) {
                    System.out.println("Access Granted. Welcome");
                    break;
                }
            }else
            {
                System.out.println("All failed, card blocked");
            }
            }
           // count++;
        }

}*/


    }}