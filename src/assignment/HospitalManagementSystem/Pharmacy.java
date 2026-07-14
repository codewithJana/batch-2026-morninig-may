package assignment.HospitalManagementSystem;

public class Pharmacy implements Service {
    private Patient patient;
    private double medicineAmount;

    public Pharmacy(Patient patient, double medicineAmount) {
        this.patient = patient;
        this.medicineAmount = medicineAmount;
        // Automatically associate this charge with the patient's bill
        if (patient.getBill() != null) {
            patient.getBill().addFee(medicineAmount, "medicine");
        }
    }

    @Override
    public void serviceDetails() {
        System.out.println("\n--- Pharmacy Service ---");
        System.out.println("Patient Name    : " + patient.getName());
        System.out.printf("Medicine Amount : Rs. %.2f\n", medicineAmount);
        System.out.println("Status          : Medicines Provided Successfully");
    }
}
