package OOP.basics.interfaces;

interface Car {

    int Max_Speed = 400;
    String CountryCode = "IN";

    void start();
    void stop();
    void acceleration();

}


class Tesla implements Car{

    final void displayCarCompanyName(){
        System.out.println("Car company is tesla");
    }

    void automaticDoorOpen(){
        System.out.println("automatic door open..");
    }

    @Override
    public void start() {
        System.out.println("Tesla Started...");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stopped...");
    }

    @Override
    public void acceleration() {
        System.out.println("Teslas Accelerating..");
    }

}

class ModelY extends Tesla{
    public void stop(){
        System.out.println("Automatic stop..");
    }
}

class Kia implements Car{
    @Override
    public void start() {
        System.out.println("Kia Started...");
    }

    @Override
    public void stop() {
        System.out.println("Kia stopped...");
    }

    @Override
    public void acceleration() {
        System.out.println("Kia Accelerating..");
    }
}

public class WithInterface {
    static void main(String[] args) {
        Car car1 = new Tesla();
        Car car2 = new Kia();

        car1.start();
        System.out.println(car1.Max_Speed);
        System.out.println(car1.CountryCode);
        car1.acceleration();

        car2.start();
        car2.acceleration();
        System.out.println(car2.Max_Speed);
        System.out.println(car2.CountryCode);
        car2.stop();




    }
}
