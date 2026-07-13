package assignment3;


public class Patient extends Person {

    private String disease;


    public Patient(int id, String name, String disease) {
        super(id, name);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID : " + id);
        System.out.println("Patient Name : " + name);
        System.out.println("Disease : " + disease);
    }
}