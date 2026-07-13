package assignment2;

public class FirstNonRepeatingDigit {
    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 1, 4, 3, 5};

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                result = arr[i];
                break;
            }
        }

        System.out.print("Input: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        System.out.println(" Output: " + result);
    }
}
