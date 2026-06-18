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

        int num = 1;
        while(true){
            System.out.println(num);
            if(num == 70){
                break;
            }
            num++;
        }

    }

}
