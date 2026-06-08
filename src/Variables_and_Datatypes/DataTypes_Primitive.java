package Variables_and_Datatypes;

public class DataTypes_Primitive {

    static void main(String[] args) {
        //Range : -128 to 127
        byte num1  = 127;

        //-32768  to 32767  ---> 2 byte
        short num2 = 32767;

        //10 digit numbers -->4 byte
        int num3 = 19999999;

        //billion and billion -->8 byte
        long num4 = 1000000000000L;

        //decimal presion - 6-7 digit
        float data1 = 10.1111197878989f;
        System.out.println(data1);

        //decimal precision -  15 t0 17
        double data2 = 10.1111197878989d;
        System.out.println(data2);

        //character dt - ' '  -- 2 byte
        char expression = '!';
        char Alphabet = 'a';
        char Alphabet_1 = 'A';
        char digit = '1';

        //boolean --? 1bit
        boolean decision_positive = true;
        boolean decision_negative = false;
    }

}
