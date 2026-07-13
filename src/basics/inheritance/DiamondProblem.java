package basics.inheritance;

/*
Problem:
1. 2 Parent classes --> extending to one child
 */

//parent class 1
class PetrolCar{
    void start(){
        System.out.println("Petrol Engine started...");
    }
}

//parent class 2
class ElectricCar{
    void start(){
        System.out.println("Battery Started...");
    }
}

//Hybrid car -->child
//Java cannot decide which start() method should invoke from both the above parent
//Multiple inheritance is not allowed in JAVA adn this the reason we call this as Diamond problem
public class DiamondProblem {
    static void main(String[] args) {
//        HybridCar car = new HybridCar();
//        car.start();
    }
}
