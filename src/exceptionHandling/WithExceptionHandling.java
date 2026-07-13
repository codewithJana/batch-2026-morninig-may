package exceptionHandling;

public class WithExceptionHandling {

    static void main(String[] args) {
        System.out.println("program starts");
        int userInput = 0;
        try{
            int results = 10/userInput;
            System.out.println(results);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            System.out.println(e.getMessage());
        }

        try{
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //[0-8] index position
            System.out.println(numbers[9]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("program ends");

    }


}
