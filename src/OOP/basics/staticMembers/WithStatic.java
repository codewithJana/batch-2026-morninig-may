package OOP.basics.staticMembers;

class CarDesign{
    static String companyName = "Toyota";
    String model;

    CarDesign(String model){
        this.model = model;
    }

    static void displayCompany(){
        System.out.println(companyName);
    }
}

public class WithStatic {
    static void main(String[] args) {
        CarDesign car1 = new CarDesign("corolla");
        CarDesign car2 = new CarDesign("Innova");

        //static belongs to class, not object
        System.out.println(CarDesign.companyName);
        System.out.println(CarDesign.companyName);

      CarDesign.displayCompany();

    }
}
