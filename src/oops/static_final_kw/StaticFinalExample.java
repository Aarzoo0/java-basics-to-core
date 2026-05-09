package oops.static_final_kw;

class Student {

    String name;

    // static variable (shared)
    static String college = "ABC College";

    //  final variable (constant)
    final int id;

    // constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //  static method
    static void showCollege() {
        System.out.println("College: " + college);
    }

    // normal method
    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", College: " + college);
    }

    //  static block
    static {
        System.out.println("Static block executed");
    }
}

// final class
final class Constants {
    static final double PI = 3.14;
}

public class StaticFinalExample {

    public static void main(String[] args) {

        // static method call
        Student.showCollege();

        System.out.println();

        Student s1 = new Student("Aarzoo", 1);
        Student s2 = new Student("John", 2);

        s1.display();
        s2.display();

        System.out.println();

        // using final constant
        System.out.println("PI value: " + Constants.PI);
    }
}