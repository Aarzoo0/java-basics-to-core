package oops.ExceptionHandling;

public class MultipleCatchEx {

        public static void main(String[] args) {

            try {

                int[] marks = {90, 80, 70};

                System.out.println(marks[5]);
//                System.out.println(marks[2]);

                int result = 10 / 0;

            }
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Invalid array index"
                );
            }
            catch (ArithmeticException e) {

                System.out.println(
                        "Arithmetic error"
                );
            }


            System.out.println("Program completed");
        }
    }

