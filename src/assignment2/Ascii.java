package assignment2;

public class Ascii {

    static void main(String[] args) {
          char ch = 'A';
        System.out.println("char: " + ch  + " , code: " + (int) ch);

        char addchar = (char) (ch + 5);
        System.out.println((char)+ch +  " + 5 = " +addchar);

        char subchar = (char) (addchar - 3);
        System.out.println((char)+addchar +  " - 3 = " +subchar);

        char digit = '7';
        int number = digit - '0';

        System.out.println("Digit '" + digit + "' as int = " + number);


        
    }
}
