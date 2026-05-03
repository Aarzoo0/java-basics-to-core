package oops.constructors;

public class Car extends Vehicle{
    private String model;

    private  int year;

    // Constructor chaining using this()
    Car() {
        this("Default Model", 0);
        System.out.println("Car default constructor");
    }

    // Parameterized constructor
    Car(String model, int year) {
        super("BMW"); // calling parent constructor
        this.model = model;
        this.year = year;
        System.out.println("Car parameterized constructor: " + model + ", " + year);
    }

    void display() {
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Speed: " + getYear());
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
