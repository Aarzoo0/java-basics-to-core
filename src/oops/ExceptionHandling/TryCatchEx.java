package oops.ExceptionHandling;

public class TryCatchEx {

    public static void main(String[] args) {

        try {

            int balance = 5000;
            int withdrawAmount = 0;

            int remainingBalance = balance / withdrawAmount;

            System.out.println(remainingBalance);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Invalid transaction: Cannot divide by zero"
            );
        }

        System.out.println("Program continues...");
    }

}