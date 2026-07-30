package CollectionsSimpleComplex;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(2);
        list.add(41);
        list.add(45);
        list.add(7);

        System.out.println("Input = " + list);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}