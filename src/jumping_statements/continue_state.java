package jumping_statements;

public class continue_state {
    static void main() {
        for(int i=0; i<=10; i++){
            if(i==5){ continue;} // it will skip 5 and print the 1-10 series
            System.out.println(i);
        }
    }

    }
