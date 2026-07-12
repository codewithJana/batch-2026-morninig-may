package Assignment2;

public class Question1 {
    static void main(String[] args) {
        int a = 2000000000;
        int b = 1000000000;
        long sum =(long)a+b;
        if (sum >Integer.MAX_VALUE) {
            System.out.println("Overflow detected");
        } else if (sum < Integer.MIN_VALUE) {
            System.out.println("Underflow detected");
        }else{
            System.out.println("Safe within int range");
        }
    }
}
