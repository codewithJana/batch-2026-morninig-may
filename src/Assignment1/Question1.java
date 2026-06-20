package Assignment1;

public class Question1 {
    static void main(String[] args) {

        for (int num = 1; num <= 10; num++)
        {
            if (num % 2 == 0)
            {
                System.out.println(num + "-> Even");
            } else {
                System.out.println(num + "-> Odd");
            }
        }
    }
}
