package assignment2;

public class Car {

    String brand;
    String model;
    int year;

    Car(String brand){
        this(brand,"base");
    }
    Car(String brand,String model){
    this(brand,model,2025);

    }
    Car(String brand, String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void
    displaydetails(){
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("year = " + year);
    }

    static void main(String[] args) {
        Car car1 = new Car("Maruthi");
        Car car2 = new Car("Creta","Highend");
        Car car3 = new Car("honda","city",2026);

        System.out.println("Constructor 1 details: " );
        car1.displaydetails();

        System.out.println("Constructor 2 details: " );
        car2.displaydetails();

        System.out.println("Constructor 3 details: " );
        car3.displaydetails();
    }
}
