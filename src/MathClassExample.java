public class MathClassExample {

    public static void main(String[] args) {

        System.out.println("---- max() ----");

        int max = Math.max(50, 90);

        System.out.println("Maximum value: " + max);

        System.out.println();

        System.out.println("---- min() ----");

        int min = Math.min(10, 3);

        System.out.println("Minimum value: " + min);

        System.out.println();

        System.out.println("---- sqrt() ----");

        double squareRoot = Math.sqrt(64);

        System.out.println("Square Root: " + squareRoot);

        System.out.println();

        System.out.println("---- pow() ----");

        double power = Math.pow(2, 5);

        System.out.println("2^5 = " + power);

        System.out.println();

        System.out.println("---- abs() ----");

        int absValue = Math.abs(-100);

        System.out.println("Absolute Value: " + absValue);

        System.out.println();

        System.out.println("---- random() ----");

        double random = Math.random();

        System.out.println("Random Number: " + random);

        System.out.println();

        System.out.println("---- Random OTP ----");

        int otp = (int)(Math.random() * 9000)
                        + 1000;

        System.out.println("Generated OTP: " + otp);

        System.out.println();

        System.out.println("---- ceil() ----");

        System.out.println(Math.ceil(5.2));

        System.out.println();

        System.out.println("---- floor() ----");

        System.out.println(Math.floor(5.9));

        System.out.println();

        System.out.println("---- round() ----");

        System.out.println(Math.round(5.6));

        System.out.println();

        System.out.println("---- Math Constants ----");

        System.out.println("PI = " + Math.PI);

        System.out.println("E = " + Math.E);

    }
}