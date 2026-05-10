package oops.wrapper_classes;

import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) {

        System.out.println("---- Boxing ----");

        int num = 100;

        Integer obj1 = Integer.valueOf(num);

        System.out.println("Primitive: " + num);

        System.out.println("Wrapper Object: " + obj1);

        System.out.println();

        System.out.println("---- Unboxing ----");

        Integer obj2 = Integer.valueOf(500);

        int value = obj2.intValue();

        System.out.println("Wrapper Object: " + obj2);

        System.out.println("Primitive Value: " + value);

        System.out.println();

        System.out.println("---- Autoboxing ----");

        Integer autoBox = 300;

        System.out.println(autoBox);

        System.out.println();

        System.out.println("---- Auto-Unboxing ----");

        Integer autoUnbox = 700;

        int x = autoUnbox;

        System.out.println(x);

        System.out.println();

        System.out.println("---- parseInt() ----");

        String marks = "95";

        int score = Integer.parseInt(marks);

        System.out.println("Parsed Integer: " + score);

        System.out.println();

        System.out.println("---- Collections Example ----");

        ArrayList<Integer> list = new ArrayList<>();

        // autoboxing
        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer n : list) {

            // auto-unboxing
            System.out.println(n);
        }

        System.out.println();

        System.out.println("---- Null Support ----");

        Integer amount = null;

        System.out.println(amount);
    }
}