package Assignment_1;

public class Program_1 {
    static void main(String[] args) {

        int i = 1;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " --> Even");
            } else {
                System.out.println(i + "--> Odd");
            }
        }
    }
}