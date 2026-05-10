package oops.inner_classes;

public class MemberInnerClassEx {

    public static void main(String[] args) {
        Car c =new Car("BMW","X5");

        Car.Engine e = c.new Engine();

        e.setCapacity(4000);
        e.startEngine();
        e.stopEngine();
    }

}
