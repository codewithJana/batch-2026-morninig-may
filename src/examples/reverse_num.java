package examples;

public class reverse_num {
    static void main() {
        int n=1234, sum=0,r;
        while(n>0){
            r=n%10;
            sum= (sum*10)+r;
            n = n/10;
        }
        System.out.println(sum);

    }
}
