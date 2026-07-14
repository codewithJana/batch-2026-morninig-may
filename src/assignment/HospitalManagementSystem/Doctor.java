package assignment.HospitalManagementSystem;

public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID      : " + getId());
        System.out.println("Doctor Name    : " + getName());
        System.out.println("Specialization : " + specialization);
    }
}
