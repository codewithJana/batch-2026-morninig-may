package Assignment2;

import java.util.Scanner;

public class Question5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
        boolean isleap = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
        System.out.println(isleap ? year+ " is a Leap Year" : year+ " is not a leap year");

    }
}



