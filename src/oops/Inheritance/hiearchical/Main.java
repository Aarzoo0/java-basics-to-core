package oops.Inheritance.hiearchical;


public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Kitty");
        c.eat();      // inherited
        c.meow();     // own method

        System.out.println();

        System.out.println("---- Runtime Polymorphism ----");

        Animal a = new Dog("Rocky"); // parent reference, child object
        a.sound(); // calls Dog's overridden method
    }
}
