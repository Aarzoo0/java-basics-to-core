package oops.ExceptionHandling;


public class ExceptionPropagationEx {

    static void payment() throws ArithmeticException {
        int result = 10 / 0;
    }

    static void checkout() {
        payment();
    }

    public static void main(String[] args) {

        try {

            checkout();

        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Exception handled in main"
            );
        }
    }
}