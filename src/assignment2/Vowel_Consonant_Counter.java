package assignment2;

public class Vowel_Consonant_Counter {

    static void main(String[] args) {
        String input = "Hello World 123!";
        int vowels = 0;
        int consonats = 0;

        input = input.toLowerCase();

        for (int i = 0; i< input.length(); i++) {
            char ch = input.charAt(i);
             if (ch >='a' && ch <= 'z') {
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                     vowels++;
                 } else {
                     consonats++;
                 }
             }
        }
        System.out.println("consonats = " + consonats);
        System.out.println("vowels = " + vowels);
    }
}
