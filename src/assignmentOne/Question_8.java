package assignmentOne;

public class Question_8 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}