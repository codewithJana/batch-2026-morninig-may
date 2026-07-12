package Assignment3;

import java.util.Scanner;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Patient extends Person {
    Patient(String name) {
        super(name);
    }

    public void ViewPatient() {
        System.out.println("Enter Patient name:" + name);
    }
}

class Doctor extends Person {
    Doctor(String name) {
        super(name);
    }

    public void ViewDoctor() {
        System.out.println("Enter Doctor name:" + name);
    }
}

interface Status {
    void AppointmentDetails();

    void consultationstatus();

}

class Appointmentandconsult implements Status {


    @Override
    public void AppointmentDetails() {
        System.out.println("Appointment Booked Successfully");
    }

    @Override
    public void consultationstatus() {
        System.out.println("Consultation Completed Successfully");

    }
}

abstract class bill {
    abstract void Billingdetails();

    abstract void Medicinebills();

    int billamount;
    int pharmacyamount;
}

class Billingmodule extends bill {
    void Billingdetails() {
        System.out.println("Billing Details");

        System.out.println("1.Checkup-300");
        System.out.println("2.Injection-100");

    }

    void GenerateBilling(int amount) {
        billamount = amount;
    }

    int getdisplaybill() {
        return billamount;
    }

    @Override
    void Medicinebills() {
        System.out.println("Pharmacy Details");

        System.out.println("1.Dolo Tablet-5");
        System.out.println("2.Crocin Tablet-10");
        System.out.println("3.Vitamin Tablet-20");
    }

    void pharmacybill(int amount, int quantity) {
        pharmacyamount = amount * quantity;
    }

    int displaypharmacybill() {
        return pharmacyamount;
    }
}

class labtest {
    public void generatelabtest() {
        System.out.println("Lab Test Booked Successfully");

    }
}

public class Hospital_Management_System {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient pat = null;
        Doctor doc = null;
        int choice;
        Billingmodule bill = new Billingmodule();

        do {
            System.out.println("===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1.Add Patient");
            System.out.println("2.View Patient");
            System.out.println("3.Add Doctor");
            System.out.println("4.View Doctor");
            System.out.println("5.Book Appointment");
            System.out.println("6.Generate Bill");
            System.out.println("7.Consultation Status");
            System.out.println("8.Pharmacy Service");
            System.out.println("9.Lab Test Service");
            System.out.println("10.Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Patient Name:");
                    String patientname = sc.nextLine();

                    pat = new Patient(patientname);

                    System.out.println("Patient Added Successfully");
                    break;
                case 2:
                    if (pat != null) {
                        pat.ViewPatient();
                    } else {
                        System.out.println("No Patient found");

                    }
                    break;
                case 3:
                    System.out.println("Enter Doctor Name:");
                    String Doctorname = sc.nextLine();
                    doc = new Doctor(Doctorname);

                    System.out.println("Doctor Added Successfully");
                    break;
                case 4:
                    if (doc != null) {
                        doc.ViewDoctor();
                    } else {
                        System.out.println("No doctor Available");

                    }
                    break;
                case 5:
                    Appointmentandconsult Appoint = new Appointmentandconsult();
                    Appoint.AppointmentDetails();
                    break;
                case 6:
                    System.out.println("Enter Consultation Fee:");
                    //String Problem=sc.next();
                    int amount = sc.nextInt();
                    bill.GenerateBilling(amount);

                    System.out.println("Total Hospital Bill: " + bill.getdisplaybill());
                    break;
                case 7:
                    Appointmentandconsult Consult = new Appointmentandconsult();
                    Consult.consultationstatus();
                    break;
                case 8:
                    System.out.println("Enter Medicine Amount:");
                    int medamount = sc.nextInt();
                    System.out.println("Enter quantity");
                    int medquantity = sc.nextInt();
                    bill.pharmacybill(medamount, medquantity);

                    System.out.println("Total Medicine Bill: " + bill.displaypharmacybill());
                    break;
                case 9:
                    labtest result = new labtest();
                    result.generatelabtest();
                    break;

                default:
                    System.out.println("\"Invalid Choice.. Please select between 1-9\"");
            }
        }
        while (choice != 10);
        sc.close();
    }
}
