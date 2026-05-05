package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum : " + calc.add(10, 20));
        System.out.println("Sum: " + calc.add(10, 20, 30));
        System.out.println("Sum: "+calc.add(1,3));

        System.out.println();

        // Runtime polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog
        a2.sound(); // Cat

        System.out.println();

        // Upcasting example
        Animal a3 = new Dog();
        a3.sound();  //  calls Dog's method (runtime polymorphism)

        // a.bark();  NOT allowed (parent reference)

        //downcasting
        Dog d = (Dog) a3;

        d.sound(); // inherited
        d.bark();  // child-specific method


    }
}
