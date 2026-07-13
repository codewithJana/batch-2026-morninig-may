package controlStatements;

public class SwitchStatement {
    static void main(String[] args) {

        /*
        switch(option){
            case 1:
               ......
               ......
            case 2:
                .....
                .....
         */

        int userInput = 4;

        switch (userInput){

            case 1:
                System.out.println("Add Employee!");
                break;
            case 2:
                System.out.println("Update Employee!");
                break;
            case 3:
                System.out.println("Delete Employee");
                break;
            default:
                System.out.println("Invalid option!!!");
        }

        System.out.println("Program Ended!!");

    }
}
