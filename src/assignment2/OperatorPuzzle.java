package assignment2;

public class OperatorPuzzle {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            int c = 15;

            int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
            System.out.println("Max: " + result);

            a += b * 2 - c / 3;
            System.out.println("a = " + a);
        }
}
