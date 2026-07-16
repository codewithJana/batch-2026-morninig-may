package assignment.HospitalManagementSystem;

public class Lab implements Service {
    private Patient patient;
    private String testName;
    private double testCost;

    public Lab(Patient patient, String testName, double testCost) {
        this.patient = patient;
        this.testName = testName;
        this.testCost = testCost;
        // Automatically associate this charge with the patient's bill
        if (patient.getBill() != null) {
            patient.getBill().addFee(testCost, "lab");
        }
    }

    @Override
    public void serviceDetails() {
        System.out.println("\n--- Lab Test Service ---");
        System.out.println("Patient Name : " + patient.getName());
        System.out.println("Test Name    : " + testName);
        System.out.printf("Test Cost    : Rs. %.2f\n", testCost);
        System.out.println("Status       : Lab Test Booked Successfully");
    }
}
