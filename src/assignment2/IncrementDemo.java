package assignment2;

public class IncrementDemo {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 0;
        z = x++ + ++y;
        x = x + y;
        y = y - z;
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
    }
}
