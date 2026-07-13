package basics.polymorphism.runtime;

class Car{
    void start(){
        System.out.println("Car is starting...");
    }

}

class BMW extends Car{
    @Override
    void start(){
        System.out.println("BMW starts using push button...");
    }

    void autoParking(){
        System.out.println("BMW will do auto parking");
    }
}

class Tesla extends Car{
    @Override
    void start(){
        System.out.println("Tesla starts using mobile app...");
    }

    void selfDriver(){
        System.out.println("Tesla will dive car without driver");
    }
}

class Benz extends Car{
    @Override
    void start(){
        System.out.println("Benz starts using Key...");
    }
}



public class withRuntimePoly {
    static void main(String[] args) {

        //Car car = new BMW(); --> converting a child object into Parent reference -->Upcasting
        /*
        Child Object-->new BMW() <-- Parent Reference Car
         */
        Car car ;

        //car--> Reference Type
        //new BMW() --> Actual object
        car = new BMW();
        car.start();
        /*
        Downcasting --> converting parent refernce back to child reference
         */
       ((BMW) car).autoParking();

        car = new Tesla();
        car.start();
        ((Tesla) car).selfDriver();

        car = new Benz();
        car.start();

        /*
        Car car = new BMW();
        car.start()-->JVM check the object ---> object is BMW --> BMW.start()
         */


    }
}
