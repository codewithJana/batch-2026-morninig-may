package OOP.basics.inheritance.withInheritance;

//Father
class Vehicle{
    String brand = "TATA";
        }
//Mother
  class Car {

    Car(){
        System.out.println("Parent constructor");
    }

     String brand = "Toyota";
     int wheels = 4;

     public void start(){
         System.out.println("Car started with Hybrid system");
     }

     public void stop(){
         System.out.println("Car stopped");
     }
}

class Innova extends Car{
    Innova(){
        //super();
        System.out.println("Child constructor");
    }
    int airBags = 6;
    String model = "Innova";
    String brand = "BMW";
    void infotainment(){
        System.out.println("Mu[sical system installed");
    }



    public void display(){
        System.out.println("child Brand "+this.brand);
        System.out.println("Parent Brand "+super.brand);
    }
}

//child
class Corolla extends Car{
    int airBags = 6;
    String model = "Corolla";
    void Bootspace(){
        System.out.println("Huge Boot space");
    }
}


public class WithInherit {
    static void main(String[] args) {
        Innova innova = new Innova();
        System.out.println(innova.model);
        innova.start();
        innova.stop();
        innova.infotainment();
        innova.display();

//        Corolla corolla = new Corolla();
//        System.out.println(corolla.brand);
//        System.out.println(corolla.model);
//        corolla.start();
//        corolla.stop();
//        corolla.Bootspace();
    }
}
