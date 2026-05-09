package oops.interfaces;

public interface Calls {

    void makeCalls();

    default void receiveCalls() {
        System.out.println("Receiving call...");
    }
}
