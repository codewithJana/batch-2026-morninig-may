package basics.Encaptulation;

class CarDesign{
    public String brand;
    public int speed;
}

public class Car_withoutEncaptulation {
    static void main(String[] args) {
        CarDesign car = new CarDesign();
        car.brand = "BMW";
        car.speed = -300;
        System.out.println("Brand is "+car.brand+" and the speed is "+car.speed);
    }
}
