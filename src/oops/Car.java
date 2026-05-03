package oops;

public  class Car {
    String model_name;

    int speed;

    int price ;

    public void accelerate(){
        speed+=1;
        System.out.println("speed is "+ speed);
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println(model_name+ " accelerated by " + increment + " to " + speed);
    }

    public void accelerate(int increment, int times) {
        speed += increment * times;
        System.out.println(model_name + " accelerated multiple times to " + speed);
    }


}


