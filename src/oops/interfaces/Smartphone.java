package oops.interfaces;

public class Smartphone implements Camera,Calls,MusicPlayer{


    @Override
    public void makeCalls() {
        System.out.println("calling...");
    }

    @Override
    public void takePic() {
        System.out.println("Capturing...");

    }

    @Override
    public void music() {
        System.out.println("Playing...");

    }
}
