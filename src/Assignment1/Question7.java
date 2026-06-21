package Assignment1;

public class Question7 {
    static void main(String[] args) {
        int correctPin = 4521;
        int max = 1;
        int attempt1 = 0;
        while (max <= 3) {
            if (max == 1) {
                attempt1 = 1234;
            } else if (max == 2) {
                attempt1 = 0000;
            } else if (max == 3) {
                attempt1 = 4521;
            }
            if (attempt1 == correctPin) {
                System.out.println("Access Granted. Welcome!");
                break;
            } else {
                int remainingattempts = 3 - max;
                System.out.println("Incorrect Pin. " + remainingattempts + " attempt(s) remaining.");
            }
            max++;
        }
        if(max>3){
                    System.out.println("Card Blocked. Contact your bank.");
                }
            }

        }


