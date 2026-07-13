package examples;

public class count_num_digit {
    static void main() {
        int n=123233, count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
