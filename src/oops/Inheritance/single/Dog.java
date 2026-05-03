package oops.Inheritance.single;

public class Dog extends Animal{

    Dog(String name) {
        super(name); // calling parent constructor
    }

    @Override
    void eat() {
       //super.eat();
        System.out.println("Bone");
    }

    void sound(){
         System.out.println("woof!!");
     }
}
