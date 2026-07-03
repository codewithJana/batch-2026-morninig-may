package OOP.basics.abstraction.withoutAbstraction;

class CreditCardPayment{
    void pay(){
        System.out.println("Credit card payment");
    }
}

class UPIPayment{
    void pay(){
        System.out.println("UPI Payment payment");
    }
}


public class WithoutAbstract {
    static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment();
        cc.pay();

        UPIPayment upi = new UPIPayment();
        upi.pay();
    }
}


/*
Problem:
1. No common standard
2. classes behave differently
3. difficult to manage the system
 */
