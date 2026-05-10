package oops.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("---- Enum Methods ----");

        System.out.println(Days.MONDAY.ordinal());

        System.out.println(Days.SUNDAY.name());

        System.out.println(Arrays.toString(Days.values()));

        Days today = Days.MONDAY;

        // calling enum method
        today.displayInfo();

        System.out.println();

        System.out.println("---- Accessing Fields ----");

        System.out.println("Working Day: " + today.isWorkingDay());

        System.out.println("Type: " + today.getType());

        System.out.println();

        System.out.println("---- switch-case ----");

        switch (today) {

            case MONDAY:
                System.out.println("Start working hard");
                break;

            case FRIDAY:
                System.out.println("Weekend is near");
                break;

            case SUNDAY:
                System.out.println("Relax and enjoy");
                break;

            default:
                System.out.println("Normal working day");
        }

        System.out.println();

        System.out.println("---- values() ----");

        for (Days d : Days.values()) {

            System.out.println(d.name() + " -> ordinal: " + d.ordinal());
        }

        System.out.println();

        System.out.println("---- valueOf() ----");

        Days day = Days.valueOf("FRIDAY");

        System.out.println(day);
    }


    }

