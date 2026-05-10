package oops.ExceptionHandling;


public class FinallyEx {

    public static void main(String[] args) {

        try {

            System.out.println(
                    "Connecting to database..."
            );

            int result = 10 / 0;

        }
        catch (ArithmeticException e) {

            System.out.println(
                    "Exception occurred"
            );
        }
        finally {

            System.out.println(
                    "Database connection closed"
            );
        }
    }
}