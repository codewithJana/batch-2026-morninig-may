package assignment2;

public class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount){
        balance = balance + amount;

    }
    void withdraw(double amount){

        if(amount <= balance){
            balance = balance - amount;
        }
            else {
            System.out.println("No sufficient balance");
        }
    }
    void displayBalance(){
        System.out.println("balance = " +balance);
    }

    static void main(String[] args) {
        BankAccount operation = new BankAccount();
        operation.deposit(3000);
        operation.displayBalance();

        operation.deposit(10000);
        operation.displayBalance();

        operation.deposit(20000);
        operation.displayBalance();

        operation.withdraw(5000);
        operation.displayBalance();

        operation.withdraw(10000);
        operation.displayBalance();

        operation.withdraw(20000);
        operation.displayBalance();


    }

}
