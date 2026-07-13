package basics.constructor;
class CarDesign{

    String brand;
    String color;
    int maxSpeed;


    CarDesign(){
        brand = "bmw";
        color = "black";
        maxSpeed = 200;
    }

    CarDesign(String brand, String color, int maxSpeed){
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails(){
        System.out.println("*Display all car Details for your Brand*");
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
        System.out.println("MaxSpeed: "+ maxSpeed);
    }
}

public class WithConstructor {
    static void main(String[] args) {
        CarDesign bmw = new CarDesign();
        bmw.displayDetails();

        CarDesign benz = new CarDesign("Benz","Grey",400);
        benz.displayDetails();

        CarDesign volvo = new CarDesign("vx200","White",450);
        volvo.displayDetails();
    }
}
