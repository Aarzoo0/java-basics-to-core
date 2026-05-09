package oops.interfaces;

public class Main {

    public static void main(String[] args) {
        Smartphone sm=new Smartphone();
        sm.makeCalls();
        sm.music();
        sm.takePic();

        System.out.println();

        // Runtime polymorphism
        Camera c = new Smartphone();

        c.takePic();

        // default method
        c.recordVideo();

        System.out.println("Camera MP: " + Camera.CAMERA_MP);

        System.out.println();

        Calls call = new Smartphone();
        call.makeCalls();
        call.receiveCalls();

        System.out.println();

        MusicPlayer m = new Smartphone();
        m.music();


        // static method call
        Camera.cameraInfo();

    }
}
