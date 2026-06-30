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
        CarDesign_1 car1 = new CarDesign_1();
        car1.brand = "BMW";
        car1.setSpeed(700);
        System.out.println("Brand is "+car1.brand+" and the speed is "+ car1.getSpeed());
    }
}
