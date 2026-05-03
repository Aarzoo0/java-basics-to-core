package oops.Inheritance.single;

public class Animal {
    private String name;

    private int age;

    private String breed;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void sound(){
        System.out.println("...");
    }

    void eat(){
        System.out.println(" This animal eats ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
