package controlStatements;

public class ifStatements {

    static void main(String[] args) {
        /*
        if(condition){
        --------
        -------
        --------
        }
         */
        int age = 18;
        if(age >= 18){
            System.out.println("Eligible to vote!");
        }

        /*
        if(condition){
        ------
        ------
        } else {
        ------
        ------
        }
         */
        age = 6;
        if(age >= 18){
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("InEligible to vote");
        }

        /*
        ------- Ternary operator---------
        short form of if..else
        condition ? truevalue(29) : falsevalue(31)
         */
        age = 8;
        String result = (age>=18) ? "Adult" : "Minor";
        System.out.println(result);

        /*
        if(condition){
        ----
        ----
        } else if ( condition){
        -----
        -----
        } else if (condition){
        -----
        ----
        }

         */

        int mark = 12;

        if (mark >= 90){
            System.out.println("Grade A");
        } else if(mark >= 75){
            System.out.println("Grade B");
        } else if (mark >=50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        /*
        if(condition){
        -----
            if(condition) {
            -----
            -----
            }
        }
         */
        boolean loginSuccess = true;
        double balance = 5000;

        if(loginSuccess){
            if(balance > 1000){
                System.out.println("withdrawal amount");
            }else {
                System.out.println("Unable to withdrawal");
            }
        } else {
            System.out.println("Invalid Login...");
        }

        System.out.println("program Ended!!!");
    }

}
