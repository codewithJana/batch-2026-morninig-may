package Variables_and_Datatypes;

public class Variables {

    int num1 = 10;                // Instance variable
    static String name = "Kavya";  // Static variable

    public static void main(String[] args) {

        // Creating objects
        Variables var = new Variables();
        Variables var2 = new Variables();

        // Changing instance variable values
        var.num1 = 100;
        var2.num1 = 200;

        // Accessing static variable
        System.out.println(name);

        // Accessing instance variables
        System.out.println(var.num1);
        System.out.println(var2.num1);

        // Calling non-static method using object
        var.intrestRateCalculation();
    }

    void intrestRateCalculation() {
        double intrestRate = 7.7;   // Local variable
        System.out.println(intrestRate);
    }
}