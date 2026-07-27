package exceptionHandling;

public class UncheckedException {

    static void main(String[] args) {

        try{
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[3]);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Print my final information");
        }

        try{
            int Sum = 100/0;
            System.out.println(Sum);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try{
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //open database, query some request, get student details from the student table, close database

        try{
            String address = "address";
            System.out.println(address.length());
            System.out.println(100/0);
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[10]);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch (NullPointerException e){
            System.out.println("Null error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of boundry Error");
        }

        try{
            String address = "address";
            System.out.println(address.length());
            System.out.println(100/0);
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[10]);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

}
