package nagamani.Assignments;

public class ATMPinvalidator {
    static void main(String[] args) {
        int correct_pin=4521;
        int attempt=1;
        boolean access_granted=true;
        while (attempt<=3){
            int entered_pin;
            if (attempt==1){

               entered_pin=1234;
            } else if (attempt==2) {
                entered_pin=0000;
            }
            else{
                entered_pin=4521;
            }
            if (correct_pin==entered_pin){
                System.out.println("Access Granted. Welcome!");
                access_granted=true;
                break;

                }
            int remainingAttempts = 3 - attempt;
            System.out.println("Incorrect PIN. " + remainingAttempts + " attempt(s) remaining.");

            attempt++;
        }
        if (!access_granted) {
            System.out.println("Card Blocked. Contact your bank.");
        }



    }
}


