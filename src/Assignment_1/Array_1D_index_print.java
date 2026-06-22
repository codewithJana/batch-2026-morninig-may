package Assignment_1;

import java.util.Scanner;

public class Array_1D_index_print
{
    public static void main(String args[])
    {
        int marks[]={85,92,67,78,55,90};

        for(int index=0;index< marks.length;index++)
            {
            System.out.println("index " + index + ":" +marks[index]);
            }
        System.out.println("Total Elements = "+marks.length);
    }
}
