package assignment2;

public class MaxMinArray {
    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 23, 67, 89, 34};

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum Element = " + max + " at index " +maxIndex);


        System.out.println("Minimum Element = " + min + " at index " +minIndex);
    }
}
