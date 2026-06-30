package OOP.basics.staticMembers;

public class CarCounterWithinClass {
    String model ;
    static int carCount = 0;  //3

    CarCounterWithinClass(String model){
        this.model = model;
        carCount++; //carCount = carCount+1
    }

    public static void main(String[] args) {
        new CarCounterWithinClass("corolla");
        new CarCounterWithinClass("innova");
        new CarCounterWithinClass("fortuner");

        System.out.println("Total car manufactured "+ carCount);
    }
}
