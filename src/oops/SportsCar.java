package oops;

public class SportsCar extends Car{


    public void accelerate() {
        speed += 80;
        System.out.println(model_name + " Sports Car accelerated fast to " + speed);
    }

}
