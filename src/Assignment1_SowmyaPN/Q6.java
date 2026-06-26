package Assignment1_SowmyaPN;

public class Q6 {
    public static void main(String[] args) {
        int FizzBuzzCount = 0;
        for (int i=1; i<=50; i++){
            if (i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
                FizzBuzzCount++;
            } else if (i%3==0) {
                System.out.print("Fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }

        }
        System.out.println(); // This is just to move or point the cursor to the next line so that the FizzBuzz Count will be printed ib next line
        System.out.println("FizzBuzz Count:" + FizzBuzzCount);
    }
}
