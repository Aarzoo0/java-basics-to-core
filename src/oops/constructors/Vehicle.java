package oops.constructors;

public class Vehicle {

    private String brand;

    //default
    Vehicle(){
        System.out.println("Vehicle default constructor");
    }

    //parameterized constrictor
    Vehicle(String brand){
        System.out.println(" parameterized constructor");
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
