package Variables_and_Datatypes;

public class Variables {

    int num1 = 10;  //instance variable
    static String name ="Jana"; //static varible

    static void main(String[] args) {
        //datatype variableName <assignment Operator> value;
       /*
        int num1 = 10;
        name = "Jana";
        Expression = '!';
        intrestRate = 7.7;
        decision = true;

        */
        //className reference variable = new keyword constructor
        Variables var = new Variables();
        Variables var2 = new Variables();
        var.num1 = 100;
        var2.num1 = 200;
        System.out.println(name);
        System.out.println(var.num1);
        System.out.println(var2.num1);
        var.intrestRateCalculation();
    }

    void intrestRateCalculation(){
        double intrestRate = 7.7;  //local variable
        System.out.println(intrestRate);
    }

}
