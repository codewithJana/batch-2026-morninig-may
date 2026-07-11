package hospitalManagement;

import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
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

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Patient Name: ");
                    String Patientname = sc.nextLine();

                    Patient Patient = new Patient(Patientname);

                    System.out.println("Patient Added Successfully");
                    break;

                case 3:
                    System.out.println("Enter Doctor Name: ");
                    String DoctorName = sc.nextLine();

                    Doctor Doctor = new Doctor(DoctorName);

                    System.out.println("Doctor Added Successfully");
                    break;

                case 5:
                    System.out.println("Appointment Booked Successfully");
                    break;

                case 6:
                    System.out.println("Enter Consultation Fee: ");
                    int ConsultationFee = sc.nextInt();

                    ConsultationFee Fee = new ConsultationFee(ConsultationFee)  ;

                    System.out.println("Total Hospital Bill: "+ConsultationFee);
                    break;

                case 7:
                    System.out.println("Consultation Completed Successfully");
                    break;

                case 8:
                    System.out.println("Enter Medicine Bill Amount: ");
                    int MedicineBill = sc.nextInt();

                    MedicineBill Bill = new MedicineBill(MedicineBill) ;

                    System.out.println("Medicine Bill Added Successfully");
                    break;

                case 9:
                    System.out.println("Lab Test Booked Successfully");
                    break;






            }
        }while (choice != 10) ;

        sc.close();
    }
}
