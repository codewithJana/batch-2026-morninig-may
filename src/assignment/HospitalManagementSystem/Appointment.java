package assignment.HospitalManagementSystem;

public class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String status; // "Pending", "Completed"

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = "Pending";
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayAppointment() {
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient ID     : " + patient.getId() + " (" + patient.getName() + ")");
        System.out.println("Doctor ID      : " + doctor.getId() + " (" + doctor.getName() + " - " + doctor.getSpecialization() + ")");
        System.out.println("Date           : " + date);
        System.out.println("Status         : " + status);
    }
}
