package examples;

public class sumofdigit {
    static void main() {
        int n=12345, sum=0, r;
        while(n>0){
            r= n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
