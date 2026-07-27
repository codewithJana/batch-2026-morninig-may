package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Throws_Keyword {
    static void main(String[] args) throws FileNotFoundException {

        /* without THROW
               int age = 17;

                if(age >= 18){
                    System.out.println("Eligible to access the application...");
                }else {
                    System.out.println("Not Eligible to access the application...");
                }
         */
        //with throw
        System.out.println("//--------------------------------------------throw--------------------------------------------");
        int age = 18;
        if(age < 18){
            throw new ArithmeticException("Age must be 18 or above..");
        }
        System.out.println("Eligible to access the application...");

        double balance = 1000;
        double withdraw = 3000;

        if(withdraw > balance){
            try {
                throw new Exception("Insufficient balance..");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        balance -= withdraw;
        System.out.println(balance);

        System.out.println("//--------------------------------------------throws--------------------------------------------");

        readFile();

    }

    public static void readFile() throws FileNotFoundException,NullPointerException {
        FileReader file = new FileReader("testdata.txt");
        String name = null;
    }

}






















