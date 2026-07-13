package basics;

class Calculator{

   int add(int num1 ,int num2){
        return num1+num2;
    }

   String printName_with_prefix(String FirstName){
       return "Mr. "+FirstName;
   }

}

public class DummyClass {

    static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(2,3);
        System.out.println(sum+100);
        System.out.println(calc.printName_with_prefix("Peter"));
    }

}
