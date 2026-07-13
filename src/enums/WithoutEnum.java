package enums;

public class WithoutEnum {

    String fuelType;

    public WithoutEnum(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayFuelType(){
        System.out.println(fuelType);
    }

    static void main(String[] args) {
        WithoutEnum bmw = new WithoutEnum("petrol");
        WithoutEnum benz = new WithoutEnum("Petrol");
        WithoutEnum tesla = new WithoutEnum("PETROL");
        WithoutEnum kia = new WithoutEnum("pETROL");
        bmw.displayFuelType();
        benz.displayFuelType();
        tesla.displayFuelType();
        kia.displayFuelType();


    }

}
