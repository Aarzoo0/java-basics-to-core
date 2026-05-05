package oops.abstraction;

public class Main {
    public static void main(String[] args) {
        // Abstract class usage
                Payment p1 = new CreditCardPayment(5000);
                Payment p2 = new UPIpayment(1500);

                p1.showAmount();
                p1.pay();

                System.out.println();

        p2.showAmount();
        p2.pay();
    }
}
