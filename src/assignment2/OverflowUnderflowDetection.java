package assignment2;

public class OverflowUnderflowDetection {

    static void main(String[] args) {
        int a = 2000000000;
        int b = 1000000000;
        long c = a + b;

        if (c < Integer.MAX_VALUE)
        {
            System.out.println("Overflow detected");
        }
        else if (c > Integer.MIN_VALUE)
        {
            System.out.println("Underflow detected");
        }
        else
        {
            System.out.println("Safe");
        }
    }
}
