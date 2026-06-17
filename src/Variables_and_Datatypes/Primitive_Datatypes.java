package Variables_and_Datatypes;

public class Primitive_Datatypes {

    public static void main(String[] args) {

        // byte: Range -128 to 127 (1 byte)
        byte num1 = 127;

        // short: Range -32768 to 32767 (2 bytes)
        short num2 = 32767;

        // int: Whole numbers (4 bytes)
        int num3 = 19999999;

        // long: Large whole numbers (8 bytes)
        long num4 = 1000000000000L;

        // float: Decimal values, precision 6-7 digits (4 bytes)
        float data1 = 10.1111197878989f;
        System.out.println(data1);

        // double: Decimal values, precision 15-17 digits (8 bytes)
        double data2 = 10.1111197878989d;
        System.out.println(data2);

        // char: Single character (2 bytes)
        char expression = '!';
        char alphabet = 'a';
        char alphabet1 = 'A';
        char digit = '1';

        // boolean: true or false
        boolean decisionPositive = true;
        boolean decisionNegative = false;

        // Printing values
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(expression);
        System.out.println(alphabet);
        System.out.println(alphabet1);
        System.out.println(digit);
        System.out.println(decisionPositive);
        System.out.println(decisionNegative);
    }
}