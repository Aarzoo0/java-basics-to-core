package oops.polymorphism;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}
