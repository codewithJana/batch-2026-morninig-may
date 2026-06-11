package Non_Primitive_datatype;

/*
 primitives data types: byte, short, int, long, float, double, char, boolean
 Non-primitive dt: Strings, Arrays, Classes, Interfaces, etc.
 Strings: A sequence of characters, used to represent text. In Java, strings are objects and are created using the String class.
          They are immutable, meaning that once a string is created, it cannot be changed.
          String Constant Pool:
                    - Avoid duplicate string literals in memory.
                    - Save Memory
                    - Improve Performance

  - Strings are immutable: Once a string is created, it cannot be changed. Any operation that seems to modify a string actually creates a new string object.

 */

public class Strings_In_Java {
    public static void main(String[] args) {
        String str1 = "Testing"; // String literal, stored in String Constant Pool
        String str2 = "testing"; // Reuses the same string literal from the pool
        String str5 = new String("Automation"); // Creates a new String object in the heap
        String str6 = new String("testing"); // Creates another new String object in the heap
        String str7 = str1+str5; // Concatenation of str1 and str5, creates a new String object in the heap


        str7 = "Automation";
        str7 = "selenium"; // Reassigning str7 to a new string literal, "Selenium", stored in the String Constant Pool

        // Comparing string references (memory addresses) --> "=="
        System.out.println(str1==str2);
        System.out.println(str1==str5);
        System.out.println(str5==str6);

        // Comparing string content --> "equals()" --> value comparison
        System.out.println("value comparison of str1 and str2: " + str1.equals(str2));
        System.out.println("value comparison of str1 and str5: " + str1.equals(str5));

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        System.out.println(str1+str7);
        System.out.println(str1);

    }
}

