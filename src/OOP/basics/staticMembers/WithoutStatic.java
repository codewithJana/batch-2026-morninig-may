package OOP.basics.staticMembers;

class Car{
    String companyName = "Toyota";
    String model;

    Car(String model){
        this.model = model;
    }
}

public class WithoutStatic {
    static void main(String[] args) {
        Car car1 = new Car("corolla");
        Car car2 = new Car("Innova");

        System.out.println(car1.companyName);
        System.out.println(car2.companyName);
    }
}
