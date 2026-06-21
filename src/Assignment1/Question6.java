package Assignment1;

public class Question6 {
    static void main(String[] args) {
        int count=0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Fizzbuzz \t");
                count++;


            } else if (i % 3 == 0) {
                System.out.print("Fizz \t");
            } else if (i % 5 == 0) {
                System.out.print("Buzz \t");
            } else {
                System.out.print(i+"\t");

            }
        }
        System.out.println("\nFrizzBuzz count: "+count);
    }
}
