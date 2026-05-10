package oops.ExceptionHandling;

// custom exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful"
        );

        System.out.println(
                "Remaining balance: ₹" + balance
        );
    }
}

public class CustomExceptionEx {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {

            acc.withdraw(7000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}