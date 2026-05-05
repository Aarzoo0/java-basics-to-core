package oops.abstraction;

public class CreditCardPayment extends Payment{

    CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    void pay() {
        System.out.println("Paying " + amount +" with credit card");
    }
}
