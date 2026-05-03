package oops.Inheritance.hiearchical;

public class Cat extends Animal{

    @Override
    void eat() {
        //super.eat();
        System.out.println("fish");
    }


    void meow(){
        System.out.println("meow!!");
    }

    Cat(String name) {

        super(name); // calling parent constructor
    }
}
