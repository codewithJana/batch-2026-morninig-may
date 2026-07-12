/* Problem Statement: Simulate an ATM PIN entry. Correct PIN: int correctPin = 4521.
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

package Assignment1;

public class Question7 {
    static void main() {

        int correctPin = 4521;
        int[] enteredpin = {1234,0000,4521};
        int AttemptCounter = 0;
        while(AttemptCounter <= 4)
        {
            if (enteredpin[AttemptCounter]==correctPin)
            {
                System.out.println("Access Granted. Welcome!");
            break;
            }
            else {
                System.out.println("Incorrect PIN. " +(2-AttemptCounter)+ " attempt(s) remaining.");

            }
            AttemptCounter++;
            if(AttemptCounter ==3)
            {
                System.out.println("Card Blocked. Contact your bank.");
            }
        }

    }
}
