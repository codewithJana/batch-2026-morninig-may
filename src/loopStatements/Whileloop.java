package loopStatements;

public class Whileloop {

    static void main(String[] args) {
        /*
        while (condition){
        ....
        ....
        }
         */
        int countdown= 10;
        while (countdown > 0){
            System.out.println(countdown);
            countdown--; // countdown = countdown-1;
        }
        System.out.println("program Ended!!");
    }

}
