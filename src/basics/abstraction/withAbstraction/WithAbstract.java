package basics.abstraction.withAbstraction;

//abstract class
abstract class Payment {
    //abstract method --> ONLY Declaration, NO Implementation
    abstract void pay();

    //concrete method --> Declaration + Implemenattion
    void receipt() {
        System.out.println("Receipt Generated...");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Credit card payment");
    }
    void storeCreditCard(){
        System.out.println("store the credit card details");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("UPI Payment payment");
    }

    void display_UPIID(){
        System.out.println("Display UPI ID");
    }
}

class NetBanking extends Payment {
    void pay() {
        System.out.println("Netbanking payment");
    }
}


public class WithAbstract {
    static void main(String[] args) {
        Payment cc;
        cc = new CreditCardPayment();
        cc.pay();
        cc.receipt();

        Payment upi;
        upi = new UPIPayment();
        upi.pay();

        Payment dc = new NetBanking();
        dc.pay();

    }
}
