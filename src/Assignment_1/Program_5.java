package Assignment_1;

import java.sql.SQLOutput;

public class Program_5 {
    public static void main(String[] args) {
        int i=1;

        for(i=1; i<=10 ; i++) {
            if (i == 5)
                continue;
            System.out.print(i + " ");
        }
    }
}
