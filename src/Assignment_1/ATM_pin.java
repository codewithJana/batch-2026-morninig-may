package Assignment_1;

import java.util.Scanner;

public class ATM_pin
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int correct_Pin=1234;
         int attempt=1;
         while(attempt<=3)
         {
             System.out.println("attempt no"+attempt);
             int pin=sc.nextInt();
             if(pin==correct_Pin)
             {
                 System.out.println("access granted : welcome ");
                 break;
             }
             if(attempt==3)
             {
                 System.out.println("contact to bank-generate new pin ");
                 break;
             }
             else
             {
                 System.out.println("access denied :TRY AGAIN ");
             }
             attempt++;
         }



     }
 }
