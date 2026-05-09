package oops.interfaces;

public interface Camera {

    // constant (public static final by default)
    int CAMERA_MP = 48;

    void takePic();

    // default method
    default void recordVideo() {
        System.out.println("Recording video in HD...");
    }

    // static method
    static void cameraInfo() {
        System.out.println("Camera interface static method");
    }
}
