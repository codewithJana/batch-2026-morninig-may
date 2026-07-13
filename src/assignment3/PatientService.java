package assignment3;



import java.util.Scanner;

public class PatientService implements HospitalOperations {

    Patient patient;

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {

        System.out.print("Enter Patient ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Disease : ");
        String disease = sc.nextLine();

        patient = new Patient(id, name, disease);

        System.out.println("Patient Added Successfully");
    }

    @Override
    public void view() {

        if (patient != null)
            patient.displayDetails();
        else
            System.out.println("No Patient Found");
    }

}
