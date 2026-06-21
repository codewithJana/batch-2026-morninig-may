package Assignment1;

public class Question8 {
    static void main(String[] args) {
        int[] arr={10, 25, 38, 47, 56, 62, 71};
        int temp;
        //Print original Array
        System.out.print("Original: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        //Reverse the array
            for(int i=0;i< arr.length/2;i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
               arr[arr.length-1-i]= temp;
            }
            //Print reverse array
        System.out.println();
            System.out.print("Reversed: ");
          for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+ " ");
          }

            }
        }


