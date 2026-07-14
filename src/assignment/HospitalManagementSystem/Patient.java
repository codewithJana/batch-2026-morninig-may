package assignment.HospitalManagementSystem;

public class Patient extends Person {
    private Bill bill;

    public Patient(int id, String name) {
        super(id, name);
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID   : " + getId());
        System.out.println("Patient Name : " + getName());
        if (bill != null) {
            System.out.printf("Current Bill Total: Rs. %.2f\n", bill.getTotalAmount());
        } else {
            System.out.println("No active bill.");
        }
    }
}
