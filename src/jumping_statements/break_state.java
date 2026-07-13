package jumping_statements;

public class break_state {
    static void main() {
        for(int i=0; i<=10; i++){
            if(i==5){ break;} // it will print 1-4
            System.out.println(i);
        }
    }
}
