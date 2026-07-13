package assignment3;


import java.util.Scanner;



public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientService patient = new PatientService();
        DoctorService doctor = new DoctorService();
        AppointmentService appointment = new AppointmentService();
        BillingService bill = new BillingService();
        PharmacyService pharmacy = new PharmacyService();
        LabTestService lab = new LabTestService();

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctor");
            System.out.println("5. Book Appointment");
            System.out.println("6. Generate Bill");
            System.out.println("7. Consultation Status");
            System.out.println("8. Pharmacy Service");
            System.out.println("9. Lab Test Service");
            System.out.println("10. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                patient.add();
                break;

            case 2:
                patient.view();
                break;

            case 3:
                doctor.add();
                break;

            case 4:
                doctor.view();
                break;

            case 5:
                appointment.bookAppointment();
                break;

            case 6:

                System.out.print("Enter Consultation Fee : ");
                double fee = sc.nextDouble();

                bill.addBill(fee);

                System.out.println("Total Bill : " + bill.getTotal());

                break;

            case 7:
                appointment.consultationStatus();
                break;

            case 8:

                System.out.print("Enter Medicine Bill : ");

                pharmacy.addMedicineBill(sc.nextDouble());

                break;

            case 9:
                lab.bookLabTest();
                break;

            case 10:
                System.exit(0);

            default:
                System.out.println("Invalid Choice");

            }

        }

    }

}
