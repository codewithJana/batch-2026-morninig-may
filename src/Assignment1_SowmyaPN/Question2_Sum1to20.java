package Assignment1_SowmyaPN;

public class Question2_Sum1to20 {
    public static void main(String[] args) {
        System.out.println("Program to do the Sum of the numbers from 1 to 20");
        // create the variable for the counter
        int i=1;
        // create the variable to store the sum value
        int sum = 0;
        // while loop for the sum operation with the condition
        while (i<=20){
            sum = sum+i; // no formula used
            // System.out.println(sum);
            i++; // incrementing the counter
        }
        System.out.println("Sum of the numbers from 1 to 20 is " + sum);
    }
}
