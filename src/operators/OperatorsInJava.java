package operators;

public class OperatorsInJava {

    static void main(String[] args) {

        //Arithmetic Operator
        //[+,-,*,/,%]
        int a = 18;
        int b = 5;

        //Addition
        int add = a+b; //20
        //Subtraction
        int sub = a-b; //5
        //Multiplication
        int mul = a*b;
        //Division
        int div = a/b;
        //Modulus
        int mod = a%b;

        //Print values
        System.out.println("Addition of 2 numbers is :"+ add );
        System.out.println("Subtraction of 2 numbers is :"+ sub);
        System.out.println("Multiplication of 2 numbers is :"+ mul);
        System.out.println("Division of 2 numbers is :"+ div);
        System.out.println("Modulus of 2 numbers is :"+ mod);

        //******************************************************************************************

        //Logical Operator - [AND, OR , NOT]
        //AND -- retrun true only all conditions are true --&&
        /*
        true true -->true
        false true -->false
        true false -->false
        false false -->false
         */

        String uname = "admin";
        String pword = "welcome123";
        //true AND true
        if (uname.equals("admin") &&  pword.equals("welcome123")){
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        //OR -- retrun true if anyone conditions is true -- ||
        /*
        true true -->true
        false true -->true
        true false -->true
        false false -->false
         */

        String role = "Manager";
        if(role.equals("Manager") || role.equals("admin")){
            System.out.println("Acces Granted");
        } else {
            System.out.println("Access Denied");
        }

        //NOT -- Reverse the result
        /*
        true --> false
        false -->true
         */

        boolean isBlocked = false;

        if(!isBlocked){
            System.out.println("User can Login");
        }else {
            System.out.println("Account Blocked - User cannot login");
        }

        //******************************************************************************************

        //Assignment Operator
        //[=,+=,-=,*=,/=,%=]

        //=
        int num = 100;
        //+=
        int totalamount =100;

        totalamount += 100; //product 1  ----> totalamount = totalamount +100; --> 200
        totalamount += 100; //procuct 2  ----> totalamount = totalamount +100; --> 300

        System.out.println(totalamount);

        //-=
        int balance = 1000;
        balance -= 1000; // balance = balance - 1000; --> 1000-1000 =0;
        System.out.println(balance);

        //Relational Operator
        //[==,!=,>,<,>=,<=]

        //==
        int generatedOTP = 123456;
        int enteredOTP = 123456;

        if (generatedOTP == enteredOTP){

        }

        //!=
        String oldPassword = "Hello12345";
        String newPassword = "Test12345";

        int oldPin = 1234;
        int newPin = 3456;

        if (!oldPassword.equals(newPassword)){

        }

        if (oldPin != newPin){
            System.out.println("pin changed successfully");
        }


        int age =18; // (age > 18) || (age ==18)
        if (age >= 18){
            System.out.println("Eligible to vote");
        }

        if(age <= 5){
            System.out.println("Child is eligible for train tk concession");
        }






    }

}
