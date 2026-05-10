package oops.inner_classes;

public class LocalnnerClassEx {
    public static void main(String[] args) {

        Hotel h=new Hotel("TAJ",25);
        h.reserveRoom("Aarzoo",5);

        System.out.println();

        h.reserveRoom("Bansal's",10);

        System.out.println();
        h.reserveRoom("Kapoor's",15);

    }
}
