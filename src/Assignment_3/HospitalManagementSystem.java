package Assignment_3;

import java.util.Scanner;

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void displayRole() {
        System.out.println("Person");
    }
}

//-------------------- Patient --------------------

class Patient extends Person {

    Patient(String name) {
        super(name);
    }

    void displayPatient() {
        System.out.println("Patient Name is " + name);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Patient");
    }
}

//-------------------- Doctor --------------------

class Doctor extends Person {

    Doctor(String name) {
        super(name);
    }

    void displayDoctor() {
        System.out.println("Doctor Name is " + name);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Doctor");
    }
}

//-------------------- Interface --------------------

interface Consultation {

    void consultationStatus();
}

//-------------------- Appointment --------------------

class Appointment extends Person implements Consultation {

    Appointment(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Appointment");
    }

    @Override
    public void consultationStatus() {
        System.out.println("Consultation Completed Successfully");
    }
}

//-------------------- Abstract Class --------------------

abstract class HospitalService {

    abstract void showServices();

    void hospitalMessage() {
        System.out.println("Welcome to Hospital Management System");
    }
}

//-------------------- Billing --------------------

class Billing extends HospitalService {

    private int billAmount;

    @Override
    void showServices() {
        System.out.println("\nHospital Billing Service");
    }

    // Method Overloading
    void generateBill(int amount) {
        billAmount = amount;
    }

    void generateBill(int amount, int medicineBill) {
        billAmount = amount + medicineBill;
    }

    int getBillAmount() {
        return billAmount;
    }
}

//-------------------- Pharmacy --------------------

class Pharmacy {

    private int medicineBill;

    void addMedicineBill(int amount) {
        medicineBill = amount;
    }

    int getMedicineBill() {
        return medicineBill;
    }
}

//-------------------- Lab Test --------------------

class LabTest {

    void bookLabTest() {
        System.out.println("Lab Test Booked Successfully");
    }

    void testStatus() {
        System.out.println("Lab Test Completed");
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient patient = null;
        Doctor doctor = null;

        Billing bill = new Billing();
        Pharmacy pharmacy = new Pharmacy();
        LabTest lab = new LabTest();
        Appointment appointment = new Appointment("Hospital");

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

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    patient = new Patient(pname);

                    System.out.println("Patient Added Successfully");
                    break;

                case 2:

                    if (patient != null) {
                        patient.displayPatient();

                        Person p = patient;
                        p.displayRole();
                    } else {
                        System.out.println("No Patient Found");
                    }

                    break;

                case 3:

                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();

                    doctor = new Doctor(dname);

                    System.out.println("Doctor Added Successfully");
                    break;

                case 4:

                    if (doctor != null) {
                        doctor.displayDoctor();

                        Person d = doctor;
                        d.displayRole();
                    } else {
                        System.out.println("No Doctor Found");
                    }

                    break;

                case 5:

                    System.out.println("Appointment Booked Successfully");
                    break;

                case 6:

                    System.out.print("Enter Consultation Fee: ");
                    int fee = sc.nextInt();

                    bill.generateBill(fee, pharmacy.getMedicineBill());

                    System.out.println("Total Hospital Bill: " + bill.getBillAmount());

                    break;

                case 7:

                    appointment.consultationStatus();

                    Person a = appointment;
                    a.displayRole();

                    break;

                case 8:

                    System.out.print("Enter Medicine Bill Amount: ");
                    int medicine = sc.nextInt();

                    pharmacy.addMedicineBill(medicine);

                    System.out.println("Medicine Bill Added Successfully");
                    System.out.println("Medicine Bill: " + pharmacy.getMedicineBill());

                    break;

                case 9:

                    lab.bookLabTest();
                    lab.testStatus();

                    break;

                case 10:

                    System.out.println("Thank You... Visit Again!!");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 10);

        sc.close();
    }
}
