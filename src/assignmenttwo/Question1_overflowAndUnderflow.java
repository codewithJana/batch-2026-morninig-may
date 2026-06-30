package assignmenttwo;

public class Question1_overflowAndUnderflow {

	public static void main(String[] args) {
		int a = 2_000_000_000;
        int b = 1_000_000_000;

        long result = a + b;

        if (result > Integer.MAX_VALUE) {
            System.out.println("Overflow detected");
        }
        else if (result < Integer.MIN_VALUE) {
            System.out.println("Underflow detected");
        }
        else {
            System.out.println("Within safe range");
        }

	}

}
