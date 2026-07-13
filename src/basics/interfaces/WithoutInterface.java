package basics.interfaces;

class BMW{
    void turnON(){
        System.out.println("BMW started....");
    }
}

class Benz{
    void engineStart(){
        System.out.println("Benz started...");
    }
}

public class WithoutInterface {
    static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.turnON();
        Benz benz = new Benz();
        benz.engineStart();
    }
}
