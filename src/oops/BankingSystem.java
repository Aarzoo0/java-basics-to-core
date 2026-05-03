package oops;

// Encapsulation
public class BankingSystem {

    private long acc_number;

    private String name;

    private double balance_amount;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance_amount += amount;
        System.out.println("Money deposited = " + balance_amount);
    }



    public long getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount > balance_amount) {
            System.out.println("Insufficient balance");
            return;
        }

        balance_amount -= amount;
        System.out.println("Money withdrawn = " + amount + " | Balance = " + balance_amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public void getBalance_amount() {
    }


}
