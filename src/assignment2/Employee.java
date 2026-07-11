package assignment2;

public class Employee {
    String name;
    int id;

    Employee() {
        this.name = "unknown";
        this.id = 0;
    }

    Employee(String name, int id)
    {
        this.name =name;
        this.id =id;
    }

    Employee(Employee e){
        this.name = e.name;
        this.id = e.id;
    }
     void dispalydetails(){
         System.out.println("name = " + name);
         System.out.println("id = " + id);
     }


    static void main(String[] args) {
    Employee emp_default = new Employee();
    Employee emp_parameterized = new Employee("Deepa",1);
    Employee emp_copy_constructor = new Employee(emp_parameterized);

    System.out.println("Default constructor");
    emp_default.dispalydetails();

    System.out.println("Parameterized constructor");
    emp_parameterized.dispalydetails();

    System.out.println("Copy constructor");
    emp_copy_constructor.dispalydetails();

    }

}

