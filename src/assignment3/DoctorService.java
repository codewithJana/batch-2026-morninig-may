package assignment3;



import java.util.Scanner;


public class DoctorService implements HospitalOperations {

    Doctor doctor;

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {

        System.out.print("Enter Doctor ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Doctor Name : ");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.print("Enter Specialization : ");
        String sp = sc.nextLine();

        doctor = new Doctor(id, name, sp);

        System.out.println("Doctor Added Successfully");

    }

    @Override
    public void view() {

        if (doctor != null)
            doctor.displayDetails();
        else
            System.out.println("No Doctor Found");
    }

}
