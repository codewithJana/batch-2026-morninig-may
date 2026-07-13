package basics;

class Car{
    //attributes --> variables
    String brand;
    String color;
    int maxspeed;

    //behavior
    void discBrakingSystem(){
        System.out.println("Disc braking system");
    }

    void ABSBrakingSystem(){
        System.out.println("ABS braking system");
    }

    void manualTransmission(){
        System.out.println("Manual gear model");
    }

    void automaticTransmission(){
        System.out.println("Automatic gear model");
    }
}

public class CarDemo {
    static void main(String[] args) {
        //bmw
        Car bmw = new Car();
        bmw.brand = "bm200";
        bmw.color = "black";
        bmw.maxspeed = 250;
        bmw.automaticTransmission();
        bmw.ABSBrakingSystem();
        System.out.println(bmw.brand);
        //volvo
        Car volvo = new Car();
        volvo.brand = "VX100";
        volvo.color = "white";
        volvo.maxspeed = 300;
        volvo.manualTransmission();
        volvo.ABSBrakingSystem();
        System.out.println(volvo.maxspeed);
        //benz
        Car benz = new Car();
        benz.brand = "bz500";
        benz.color = "grey";
        benz.maxspeed = 350;
        benz.automaticTransmission();
        benz.discBrakingSystem();
        System.out.println(benz.color);
    }
}
