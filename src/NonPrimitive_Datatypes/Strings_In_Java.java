package NonPrimitive_Datatypes;

/*
 Non-Primitive Data Type: String

 - String is a sequence of characters used to store text.
 - Strings are objects in Java.
 - Strings are immutable (cannot be changed after creation).
 - String literals are stored in the String Constant Pool to save memory.
 */

public class Strings_In_Java {

    public static void main(String[] args) {

        // String literals are stored in the String Constant Pool
        String str1 = "Testing";
        String str2 = "testing";

        // Creates new String objects in Heap memory
        String str5 = new String("Automation");
        String str6 = new String("testing");

        // Concatenation creates a new String object
        String str7 = str1 + str5;

        // Reassigning str7 to new strings
        str7 = "Automation";
        str7 = "selenium";

        // ================= Reference Comparison (==) =================
        // Checks whether both references point to the same memory location

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str5); // false
        System.out.println(str5 == str6); // false

        // ========= Value Comparison (equals()) ==========
        // Checks whether the contents are equal

        System.out.println("Value comparison of str1 and str2: " + str1.equals(str2)); // false
        System.out.println("Value comparison of str1 and str5: " + str1.equals(str5)); // false

        // ================= String Methods =================

        // Convert to lowercase
        System.out.println(str1.toLowerCase()); // testing

        // Convert to uppercase
        System.out.println(str1.toUpperCase()); // TESTING

        // Original string remains unchanged (Strings are immutable)
        System.out.println(str1); // Testing

        // Concatenation
        System.out.println(str1 + str7); // Testingselenium

        // str1 is still unchanged
        System.out.println(str1); // Testing
    }
}