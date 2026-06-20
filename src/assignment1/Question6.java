package assignment1;

public class Question6 {
    public static void main(String[] args) {
        int FizzBuzzcount = 0;
        for (int i = 1; i <= 50; i++)
        {
            if (i % 3 == 0 & i % 5 == 0)
            {
                System.out.print("FizzBuzz" + " ");
                FizzBuzzcount++;
            }
            else if (i % 3 == 0)
            {
                System.out.print("Fizz" + " ");
            }
            else if (i % 5 == 0)
            {
                System.out.print("Buzz" + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(" FizzBuzz count " + FizzBuzzcount);
    }
}
