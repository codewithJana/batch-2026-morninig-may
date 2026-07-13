package basics.inheritance;

//Parent
interface PetrolCar_1{
    void start();
}
//Parent
interface ElectricCar_1{
    void start();
}

//Hybrid car class
public class FixDiamondProblem implements PetrolCar_1,ElectricCar_1{
    static void main(String[] args) {
        FixDiamondProblem hybridCar = new FixDiamondProblem();
        hybridCar.start();
    }

    @Override
    public void start() {
        System.out.println("Start using either Petrol or from Battery");
    }
}
