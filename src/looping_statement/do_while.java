package looping_statement;

public class do_while {
    static void main() {
        int j = 0;
        do {
            j++; //1
            System.out.println(j);
            //j++; //0
        } while (j <= 2);
    }
}
