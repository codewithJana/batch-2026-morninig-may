package assignment2;

public class Reverse_A_String {

    static void main(String[] args) {

    String original = "Hello";
    String reverse = " ";

    for(int i = original.length()-1; i>=0; i--)
    {
        reverse = reverse + original.charAt(i);
    }
        System.out.println("original = " + original);
        System.out.println("reverse = " + reverse);
    }

}
