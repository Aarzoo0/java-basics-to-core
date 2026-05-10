package oops.ExceptionHandling;

public class ThrowEx {

    static void checkAge(int age) {

        if (age < 18) {

            throw new ArithmeticException(
                    "You are not eligible to vote"
            );
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        checkAge(12);
    }
}