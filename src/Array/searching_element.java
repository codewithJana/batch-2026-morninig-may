package Array;

import java.util.Scanner;

public class searching_element {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int a[]={10,20,30,40,22,6};
        int key;
        System.out.println("Enter key value: ");
        key = sc.nextInt();
        for(int i=0;i<=a.length-1;i++){
            if(key== a[i]){
                System.out.println("value is present at " + i+" location");
                System.exit(0);
            }
        }
        System.out.println("value not present");
    }
}
