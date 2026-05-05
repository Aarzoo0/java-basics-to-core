package oops.abstraction;

public class UPIpayment extends Payment{


    UPIpayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Paying "+amount+" using UPI");
    }
}
