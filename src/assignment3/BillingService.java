package assignment3;


public class BillingService {

    double total;

    public void addBill(double consultation) {

        total = consultation;

    }

    public void addBill(double consultation, double medicine) {

        total = consultation + medicine;

    }

    public double getTotal() {

        return total;

    }

}
