package enums;


enum FuelType{
    Petrol,
    Diesel,
    EV,
    Hybrid,
    CNG
}

public class WithEnum {

    FuelType fuelType;

    public WithEnum(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void displayFuelType(){
        System.out.println(fuelType);
    }

    static void main(String[] args) {
        WithEnum bmw = new WithEnum(FuelType.Petrol);
        WithEnum benz = new WithEnum(FuelType.Hybrid);
        WithEnum tesla = new WithEnum(FuelType.EV);
        WithEnum kia = new WithEnum(FuelType.CNG);
        bmw.displayFuelType();
        benz.displayFuelType();
        tesla.displayFuelType();
        kia.displayFuelType();


    }

}
