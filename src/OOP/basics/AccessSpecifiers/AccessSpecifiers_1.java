package OOP.basics.AccessSpecifiers;

class Car_Access{

     protected int gear = 5;

     void displayGear(){
         System.out.println(gear);
     }

}

public class AccessSpecifiers_1 {
    static void main(String[] args) {
        Car_Access ca = new Car_Access();
        //ca.gear = 7;
        //System.out.println(ca.gear);
        ca.displayGear();
    }
}
