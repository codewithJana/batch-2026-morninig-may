package Assignment1_SowmyaPN;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 38, 47, 56, 62, 71};
        System.out.println();
        System.out.print("Original:");
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        for (int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println();
        System.out.print("Reversed:");
        for (int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
