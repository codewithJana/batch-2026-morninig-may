package nagamani.Assignments;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {10, 25, 38, 47, 56, 62, 71};
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reverse array in-place
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("\nReversed : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
