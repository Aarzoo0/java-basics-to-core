package oops.inner_classes;

public class Car {

    private String brand;

    private String model;

    public String getModel() {
        return model;
    }


    public String getBrand() {
        return brand;
    }


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //  Member Inner Class
    class Engine {

        private int capacity;

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void startEngine() {
            System.out.println(brand +" "+ model+ " engine started with cc "+ capacity);
        }

        void stopEngine(){
            System.out.println("Engine has stopped..");
        }


    }

}
