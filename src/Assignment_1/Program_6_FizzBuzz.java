package Assignment_1;

public class Program_6_FizzBuzz {
    public static void main(String[] args) {

        int Count = 0;
        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("FizzBuzz ");

                Count++;
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }

            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }

            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("FizzBuzz count: " + Count);
    }
}
