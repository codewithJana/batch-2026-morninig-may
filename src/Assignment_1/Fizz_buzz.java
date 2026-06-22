package Assignment_1;

public class Fizz_buzz
{
  public static void main(String[] args)
  {
      int Fizzbuzz_count = 0;
      for ( int i = 1; i<=50; i++)
      {
          if(i%3==0 && i%5==0)
          {
              System.out.println("FizzBuzz");
              Fizzbuzz_count++;
          }
          else if(i%3==0)
          {
              System.out.println("Fizz");
          }
          else if(i%5==0)
          {
              System.out.println("Buzz");
          }
          else
          {
              System.out.println(i);
          }

      }
      System.out.println("Fizzbuzz_count "+Fizzbuzz_count);

  }
}
