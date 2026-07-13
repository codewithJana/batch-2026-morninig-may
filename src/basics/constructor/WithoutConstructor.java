package basics.constructor;

class car{

    String brand;
    String color;
    int maxSpeed;

    void displayDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
        System.out.println("MaxSpeed: "+ maxSpeed);
    }
}

public class WithoutConstructor {
    static void main(String[] args) {
        car bmw = new car();
        bmw.brand = "bmw200x";
        bmw.color = "Black";
        bmw.maxSpeed = 300;
        bmw.displayDetails();

        car benz = new car();
        benz.brand = "benz500x";
        benz.color = "white";
        benz.maxSpeed = 300;
        benz.displayDetails();

    }
}
