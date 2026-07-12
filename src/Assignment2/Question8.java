package Assignment2;

public class Question8 {
    static void main(String[] args) {
        int arr[]={4, 5, 1, 2, 1, 4, 3, 5};
        int count=0;
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<i;j++){
               if(arr[i]==arr[j]){
                   count++;
               }

           }

       }
        System.out.println(count);
    }
}
