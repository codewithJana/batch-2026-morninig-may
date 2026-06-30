package OOP.basics.staticMembers;

//count how many cars created

class CarDesignPlan{

    String model ;
    static int carCount = 0;  //3

    CarDesignPlan(String model){
        this.model = model;
        carCount++; //carCount = carCount+1
    }

}

public class CarCounter {
    static void main(String[] args) {
        new CarDesignPlan("corolla");
        new CarDesignPlan("innova");
        new CarDesignPlan("fortuner");

        System.out.println("Total car manufactured "+ CarDesignPlan.carCount);
    }
}
