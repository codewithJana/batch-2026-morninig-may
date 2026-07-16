package assignment.HospitalManagementSystem;

public class Bill {
    private int billId;
    private Patient patient;
    private double consultationFee;
    private double medicineFee;
    private double labFee;

    public Bill(int billId, Patient patient) {
        this.billId = billId;
        this.patient = patient;
    }

    public int getBillId() {
        return billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public double getMedicineFee() {
        return medicineFee;
    }

    public double getLabFee() {
        return labFee;
    }

    // Method Overloading: addFee(double amount, String feeType)
    public void addFee(double amount, String feeType) {
        if (amount < 0) {
            System.out.println("Error: Fee cannot be negative.");
            return;
        }
        switch (feeType.toLowerCase()) {
            case "consultation":
                this.consultationFee += amount; // consultationFee = consultationFee+amount
                break;
            case "medicine":
                this.medicineFee += amount;
                break;
            case "lab":
                this.labFee += amount;
                break;
            default:
                System.out.println("Unknown fee type: " + feeType);
        }
    }

    // Overloaded method: addFee(double amount) - defaults to consultation
    public void addFee(double amount) {
        addFee(amount, "consultation");
    }

    public double getTotalAmount() {
        return consultationFee + medicineFee + labFee;
    }

    // Method Overloading for Discount calculations (Bonus feature)
    // 1. Percentage discount: e.g. 10.0 for 10%
    public double calculateDiscountedTotal(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. No discount applied.");
            return getTotalAmount();
        }
        return getTotalAmount() * (1.0 - (discountPercentage / 100.0));
    }

    // 2. Flat rate discount: e.g. 50 for Rs. 50 off
    public double calculateDiscountedTotal(int flatDiscountAmount) {
        if (flatDiscountAmount < 0 || flatDiscountAmount > getTotalAmount()) {
            System.out.println("Invalid flat discount amount. No discount applied.");
            return getTotalAmount();
        }
        return getTotalAmount() - flatDiscountAmount;
    }

    public void generateBill() {
        System.out.println("\n===== BILL =====");
        System.out.println("Bill ID : " + billId);
        System.out.println("Patient Name : " + patient.getName());
        System.out.printf("Consultation Fee : Rs. %.2f\n", consultationFee);
        System.out.printf("Medicine Fee : Rs. %.2f\n", medicineFee);
        System.out.printf("Lab Fee : Rs. %.2f\n", labFee);
        System.out.printf("Total Hospital Bill: Rs. %.2f\n", getTotalAmount());
    }
}
