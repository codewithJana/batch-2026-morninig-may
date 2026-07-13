package Array;

public class finding_sum {
    static void main() {
        int a[]={10,20,30,40};
        int sum=0;
       /* for(int i=0; i<=a.length-1; i++){
           sum =sum +a[i];
        } */
        for(int x:a){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
