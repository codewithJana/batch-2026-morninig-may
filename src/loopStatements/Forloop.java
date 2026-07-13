package loopStatements;

public class Forloop {

    /*
     execute a block of code repeatedly until a specified condition becomes false
     - For
     - While
     - Do While
     - Enhanced For..each loop (see in arrays class)
     */
    static void main(String[] args) {

        /*
        for(initialization;condition;increment/decrement){
            .......
            .......
        }
         */
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
        }

        //print only odd numbers
        for(int i = 1;i <= 10;i++){

            if (i%2 == 0){
                continue; //skip even numbers
            }

            System.out.println(i);
        }

        //print number until 5 is found
        for(int i = 1;i <= 10;i++){
            System.out.println(i);
            if(i==5){
                break; //terminate the flow
            }
        }

    }

}
