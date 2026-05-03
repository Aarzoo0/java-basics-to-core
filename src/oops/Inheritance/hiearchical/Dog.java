package oops.Inheritance.hiearchical;

import oops.Inheritance.hiearchical.Animal;

public class Dog extends Animal {

    Dog(String name) {

        super(name); // calling parent constructor
    }

    @Override
    void eat() {
       //super.eat();
        System.out.println("Bone");
    }

    @Override
    void sound( ) {
        System.out.println(getName()+ " barks");
    }

    void bark(){
         System.out.println("woof!!");
     }
}
