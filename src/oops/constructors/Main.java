package oops.constructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Default Constructor ----");
        Car c1 = new Car();
        c1.display();

        System.out.println();

        System.out.println("---- Parameterized Constructor ----");
        Car c2 = new Car("X5", 2019);
        c2.display();
    }
}
