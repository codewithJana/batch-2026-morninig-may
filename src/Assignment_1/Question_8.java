package Assignment_1;

public class Question_8 {
    static void main() {
        int[] arr={10,25,38,47,56,62,71};
        System.out.print("Original: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i< arr.length/2;i++)
        {
            int temp=arr[i]; // temp=arr[0] , temp=10
            arr[i]=arr[arr.length-1-i]; //arr[0] =arr[6-1-0=5], arr[0]=arr[5], arr[0]=71
            arr[arr.length-1-i]=temp;//arr[5]=temp, arr[5]=10
        }
        System.out.println();
        System.out.print("Reversed: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
