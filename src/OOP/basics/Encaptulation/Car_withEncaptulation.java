package OOP.basics.Encaptulation;

class CarDesign_1{
    public String brand;
    private int speed = 60;

    public void setSpeed(int speed){
        if(speed >=0 && speed <= 500){
            this.speed = speed;
        }
        else {
            System.out.println("Invalid speed!!");
        }
    }

    public int getSpeed(){
        return speed;
    }
}

public class Car_withEncaptulation {
    static void main(String[] args) {
        CarDesign_1 car = new CarDesign_1();
        car.brand = "BMW";
        car.setSpeed(700);
        System.out.println("Brand is "+car.brand+" and the speed is "+ car.getSpeed());
    }
}
