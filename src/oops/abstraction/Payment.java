package oops.abstraction;

public abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // abstract method
    abstract void pay();

    // normal method
    void showAmount() {
        System.out.println("Amount to pay: " + amount);
    }
}
