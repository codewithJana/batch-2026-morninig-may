package Non_Primitive_datatype;

public class StringMethods {
    static void main(String[] args) {
        String name = "java programming!";
        String name1 = "JAVA PROGRAMMING!";

        //length of the string --> string.length() -- //0,1...15(g)...16(!) ../0(17
        System.out.println("Length of the string: " + name.length());

        //charAt() --> returns the character at a specific index
        //capture the index position of "0" and "16 in the string
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Character at index 16: " + name.charAt(16));
        //out of bound exception
        //System.out.println(name.charAt(17));

        //equals() --> compares the content of two strings and returns true if they are equal, false otherwise
        System.out.println("Compare both string (case sensitive): " + name.equals(name1)); //true ; not as same as name==name1 --> true because both name and name1 are string literals and stored in the String Constant Pool, so they reference the same memory location.

        //equalsIgnoreCase() --> compares the content of two strings, ignoring case differences, and returns true if they are equal, false otherwise
        System.out.println("Compare both string (case insensitive): " + name.equalsIgnoreCase(name1)); //true

        //find @gmail in the string
        //contains() --> checks if a string contains a specific sequence of characters and returns true if it does, false otherwise
        String email = "testuser@gmail.com";
        System.out.println("Does the email contain '@gmail': " + email.contains("@gmail")); //true

        //find the https in the string url
        //not using contains() method --scenaario "http://www.myapphttps.com"`
        //startsWith() --> checks if a string starts with a specific prefix and returns true if it does, false otherwise
        String url = "https://www.myapphtts.com";
        System.out.println("Does the url start with 'https': " + url.startsWith("https")); //true
        String url1 = "http://www.myapphtts.com";
        System.out.println("Does the url start with 'https': " + url1.startsWith("https")); //true

        //check the file extension is .pdf or not
        //endsWith() --> checks if a string ends with a specific suffix and returns true if it does, false otherwise
        String fileName = "report.pdf";
        System.out.println("Does the file name end with '.pdf': " + fileName.endsWith(".pdf")); //true
        String fileName1 = "report.doc";
        System.out.println("Does the file name end with '.pdf': " + fileName1.endsWith(".pdf")); //false

        //upperCase() --> converts all characters in a string to uppercase and returns the new string
        //lowerCase() --> converts all characters in a string to lowercase and returns the new string
        System.out.println("original string is " + name + " in Uppercase: " + name.toUpperCase());
        System.out.println("original string is " + name1 + " in Lowercase: " + name1.toLowerCase());

        //trim() --> removes leading and trailing whitespace from a string and returns the new string
        String strWithSpaces = "   Hello World!   ";
        System.out.println("Original string with spaces: '" + strWithSpaces + "'");
        System.out.println("String after trim: '" + strWithSpaces.trim() + "'");

        //replace -- Replace the character or word
        String text = "I like Java";
        System.out.println("original text is "+ text + " after learning selenium my text is "+ text.replace("I","U"));
        System.out.println("original text is "+ text + " after learning selenium my text is "+ text.replace("Java","Selenium"));

        //substring() --> returns a new string that is a substring of the original string, based on specified start and end indices
        String sentence = "Java Programming";
        System.out.println("Original sentence: " + sentence + " Substring from index 0 to 4: " + sentence.substring(0,5)); //Java

        //indexof() --> returns the index of the first occurrence of a specified character or substring in a string, or -1 if it is not found
        String str = "Hello World!";
        System.out.println("Index of 'o' in the string: " + str.indexOf('o'));

        //split() --> splits a string into an array of substrings based on a specified delimiter
        String Languages = "Java,Python,C++,JavaScript";
        System.out.println("before split: " + Languages);
        //Arrays --> collection of similar data types
        String[] Arroflanguages = Languages.split(",");   //["Java","Python","C++","JavaScript"]
        System.out.println("after split: " + Arroflanguages); //reference of the array
        //print the array of languages using for each loop
        //String language = "Java" --> Arroflanguages[0] --> "Java"
        //String language = "Python" --> Arroflanguages[1] --> "Python"
        //String language = "C++" --> Arroflanguages[2] --> "C++"
        //String language = "JavaScript" --> Arroflanguages[3] --> "JavaScript"
        for(String language : Arroflanguages) {
            System.out.println(language);
        }

        //isEmpty() --> checks if a string is empty (i.e., has a length of 0) and returns true if it is, false otherwise
        String emptyString = "";
        System.out.println("Is the string empty: " + emptyString.isEmpty()); //true
        String nonEmptyString = " ";
        System.out.println("Is the string empty: " + nonEmptyString.isEmpty()); //false
        //length of "" --> 0 , length of " " --> 1 ; both cases memory allocates
        //null --> no memory allocation, it is a reference variable that points to nothing
        //String str = null; //str is a reference variable that points to nothing, it does not point to any memory location

        //concat() --> concatenates two strings and returns the new string
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Full name using concat: " + firstName.concat(lastName));//JohnDoe

        String str1 = null;
        String str2 = "Java";
        //System.out.println(str1.concat(str2)); //NullPointerException because str1 is null and we are trying to call the concat() method on a null reference variable, which is not allowed in Java. To avoid this exception, we should check if str1 is null before calling the concat() method. For example:
        System.out.println(str1+str2); //nullJava because when we use the + operator for string concatenation, if one of the operands is null, it is treated as the string "null". So in this case, str1 is null, and when we concatenate it with str2, which is "Java", the result is "nullJava".


        //*********************************************//
        String[] listOfWebsites = {"https://www.google.com","https://www.facebook.com","https://www.amazon.com","https://www.linkedin.com"};
        for (String website : listOfWebsites){
            System.out.println(website);
        }




    }
}
