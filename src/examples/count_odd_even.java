package examples;

public class count_odd_even {
    static void main() {
        int n=123466, r, even=0, odd=0;
    while(n>0) {
        r = n / 10;
        n = n / 10;
        if (r % 2 == 0) {
            even++;
        } else {
            odd++;
        }

    }
        System.out.println(even);
        System.out.println(odd);

    }
}
