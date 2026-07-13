package assignment3;



public class PharmacyService {

    private double medicineBill;

    public void addMedicineBill(double amount) {

        medicineBill = amount;

        System.out.println("Medicine Bill Added Successfully");

    }

    public double getMedicineBill() {

        return medicineBill;

    }

}
