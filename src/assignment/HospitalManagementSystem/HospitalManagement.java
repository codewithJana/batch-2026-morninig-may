package assignment.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagement {
    private static List<Patient> patients = new ArrayList<>(); //List patients = new ArrayList();  ==> List<String> names = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static List<Bill> bills = new ArrayList<>();

    // Counters for Auto ID Generation
    private static int patientIdCounter = 101;
    private static int doctorIdCounter = 201;
    private static int appointmentIdCounter = 301;
    private static int billIdCounter = 401;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

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
            
            choice = readInt(sc, "Enter Choice: ");
            System.out.println("--------------------------------");

            switch (choice) {
                case 1:
                    addPatient(sc);
                    break;
                case 2:
                    viewPatient(sc);
                    break;
                case 3:
                    addDoctor(sc);
                    break;
                case 4:
                    viewDoctor(sc);
                    break;
                case 5:
                    bookAppointment(sc);
                    break;
                case 6:
                    generateBill(sc);
                    break;
                case 7:
                    consultationStatus(sc);
                    break;
                case 8:
                    pharmacyService(sc);
                    break;
                case 9:
                    labTestService(sc);
                    break;
                case 10:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please enter a number between 1 and 10.");
            }
            System.out.println("--------------------------------");

        } while (choice != 10);

        sc.close();
    }

    // ================= OPERATIONS =================

    private static void addPatient(Scanner sc) {
        String name = readName(sc, "Enter Patient Name: ");
        int pid = patientIdCounter++; //patientIdCounter = patientIdCounter+1
        Patient patient = new Patient(pid, name);
        
        // Auto-create a Bill record for this Patient to track charges
        int bid = billIdCounter++; //billIdCounter = billIdCounter+1
        Bill bill = new Bill(bid, patient);
        patient.setBill(bill);

        //ArrayLists
        patients.add(patient);
        bills.add(bill);

        System.out.println("Patient Added Successfully!");
        System.out.println("Assigned Patient ID: " + pid);
    }

    private static void viewPatient(Scanner sc) {
        if (patients.isEmpty()) {
            System.out.println("No Patients registered yet!");
            return;
        }

        System.out.println("\n--- Registered Patients ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName());
        }

        int pid = readInt(sc, "\nEnter Patient ID to view details (or 0 to cancel): ");
        if (pid == 0) return;

        Patient patient = findPatientById(pid);
        if (patient != null) {
            System.out.println("\n=== PATIENT DETAILS ===");
            patient.displayDetails();
        } else {
            System.out.println("Patient with ID " + pid + " not found!");
        }
    }

    private static void addDoctor(Scanner sc) {
        String name = readName(sc, "Enter Doctor Name: ");
        String specialization = readString(sc, "Enter Specialization: ");
        int did = doctorIdCounter++;
        
        Doctor doctor = new Doctor(did, name, specialization);
        doctors.add(doctor);

        System.out.println("Doctor Added Successfully!");
        System.out.println("Assigned Doctor ID: " + did);
    }

    private static void viewDoctor(Scanner sc) {
        if (doctors.isEmpty()) {
            System.out.println("No Doctors registered yet!");
            return;
        }

        System.out.println("\n--- Registered Doctors ---");
        for (Doctor d : doctors) {
            System.out.println("ID: " + d.getId() + " | Name: " + d.getName() + " (" + d.getSpecialization() + ")");
        }

        int did = readInt(sc, "\nEnter Doctor ID to view details (or 0 to cancel): ");
        if (did == 0) return;

        Doctor doctor = findDoctorById(did);
        if (doctor != null) {
            System.out.println("\n=== DOCTOR DETAILS ===");
            doctor.displayDetails();
        } else {
            System.out.println("Doctor with ID " + did + " not found!");
        }
    }

    private static void bookAppointment(Scanner sc) {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Cannot book appointment. Ensure both Patients and Doctors are registered first!");
            return;
        }

        System.out.println("\n--- Select Patient ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName());
        }
        int pid = readInt(sc, "Enter Patient ID: ");
        Patient patient = findPatientById(pid);
        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        System.out.println("\n--- Select Doctor ---");
        for (Doctor d : doctors) {
            System.out.println("ID: " + d.getId() + " | Name: " + d.getName() + " (" + d.getSpecialization() + ")");
        }
        int did = readInt(sc, "Enter Doctor ID: ");
        Doctor doctor = findDoctorById(did);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        String date = readString(sc, "Enter Appointment Date (e.g., dd/mm/yyyy): ");
        int aid = appointmentIdCounter++;

        Appointment appointment = new Appointment(aid, patient, doctor, date);
        appointments.add(appointment);

        System.out.println("Appointment Booked Successfully!");
        System.out.println("Appointment ID: " + aid);
    }

    private static void generateBill(Scanner sc) {
        if (patients.isEmpty()) {
            System.out.println("No Patient Records Found!");
            return;
        }

        System.out.println("\n--- Registered Patients ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName());
        }
        int pid = readInt(sc, "Enter Patient ID: ");
        Patient patient = findPatientById(pid);
        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        Bill bill = patient.getBill();
        if (bill == null) {
            System.out.println("Error: No billing record active for this patient. Auto-generating one...");
            bill = new Bill(billIdCounter++, patient);
            patient.setBill(bill);
            bills.add(bill);
        }

        // Add Consultation fee if needed
        double consultationFee = readDouble(sc, "Enter Consultation Fee: ");
        bill.addFee(consultationFee, "consultation");

        // Display basic Bill
        bill.generateBill();

        // Optional Discount feature (Overloading demonstration)
        System.out.print("Do you want to apply a discount? (y/n): ");
        String applyDiscount = sc.nextLine().trim().toLowerCase();
        if (applyDiscount.equals("y") || applyDiscount.equals("yes")) {
            System.out.println("Choose Discount Type:");
            System.out.println("1. Percentage Discount (e.g. 10.5%)");
            System.out.println("2. Flat Cash Discount (e.g. Rs. 50)");
            int type = readInt(sc, "Enter choice (1-2): ");
            if (type == 1) {
                double pct = readDouble(sc, "Enter Discount Percentage (0-100): ");
                double discountedTotal = bill.calculateDiscountedTotal(pct);
                System.out.printf("Total Hospital Bill (After %.1f%% Discount): Rs. %.2f\n", pct, discountedTotal);
            } else if (type == 2) {
                int flat = readInt(sc, "Enter Flat Discount Amount: ");
                double discountedTotal = bill.calculateDiscountedTotal(flat);
                System.out.printf("Total Hospital Bill (After Rs. %d Flat Discount): Rs. %.2f\n", flat, discountedTotal);
            } else {
                System.out.println("Invalid choice. No discount applied.");
            }
        }
    }

    private static void consultationStatus(Scanner sc) {
        if (appointments.isEmpty()) {
            System.out.println("No Appointment Found!");
            return;
        }

        System.out.println("\n--- Current Appointments ---");
        for (Appointment a : appointments) {
            System.out.println("ID: " + a.getAppointmentId() + " | Patient: " + a.getPatient().getName() + " | Status: " + a.getStatus());
        }

        int aid = readInt(sc, "Enter Appointment ID to update status: ");
        Appointment appointment = findAppointmentById(aid);
        if (appointment != null) {
            appointment.setStatus("Completed");
            System.out.println("Consultation Completed Successfully!");
            System.out.println("\n=== UPDATED APPOINTMENT DETAILS ===");
            appointment.displayAppointment();
        } else {
            System.out.println("Appointment with ID " + aid + " not found!");
        }
    }

    private static void pharmacyService(Scanner sc) {
        if (patients.isEmpty()) {
            System.out.println("Patient Record Not Found!");
            return;
        }

        System.out.println("\n--- Registered Patients ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName());
        }
        int pid = readInt(sc, "Enter Patient ID: ");
        Patient patient = findPatientById(pid);
        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        double medAmount = readDouble(sc, "Enter Medicine Bill Amount: ");
        
        // Polymorphism/Interface instantiation
        Service pharmacy = new Pharmacy(patient, medAmount);
        pharmacy.serviceDetails();
        
        System.out.println("Medicine Bill Added Successfully!");
    }

    private static void labTestService(Scanner sc) {
        if (patients.isEmpty()) {
            System.out.println("Patient Record Not Found!");
            return;
        }

        System.out.println("\n--- Registered Patients ---");
        for (Patient p : patients) {
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName());
        }
        int pid = readInt(sc, "Enter Patient ID: ");
        Patient patient = findPatientById(pid);
        if (patient == null) {
            System.out.println("Patient not found!");
            return;
        }

        String testName = readString(sc, "Enter Lab Test Name: ");
        double testCost = readDouble(sc, "Enter Lab Test Cost: ");

        // Polymorphism/Interface instantiation
        Service lab = new Lab(patient, testName, testCost);
        lab.serviceDetails();

        System.out.println("Lab Test Booked Successfully!");
    }

    // ================= HELPERS / VALIDATIONS =================

    private static Patient findPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private static Doctor findDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    private static Appointment findAppointmentById(int id) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId() == id) return a;
        }
        return null;
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine(); // consume newline
                return val;
            } else {
                System.out.println("Invalid Input! Please enter an integer.");
                sc.nextLine(); // clear buffer
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double val = sc.nextDouble();
                sc.nextLine(); // consume newline
                if (val >= 0) {
                    return val;
                } else {
                    System.out.println("Value cannot be negative!");
                }
            } else {
                System.out.println("Invalid Input! Please enter a valid decimal number.");
                sc.nextLine(); // clear buffer
            }
        }
    }

    private static String readString(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String val = sc.nextLine().trim();
            if (!val.isEmpty()) {
                return val;
            } else {
                System.out.println("Input cannot be empty!");
            }
        }
    }

    private static String readName(Scanner sc, String prompt) {
        while (true) {
            String name = readString(sc, prompt);
            if (name.matches("^[a-zA-Z\\s]+$")) {
                return name;
            } else {
                System.out.println("Invalid Name! Name must only contain letters and spaces.");
            }
        }
    }
}