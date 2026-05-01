public class ControlFlow {


    public static void main(String[] args) {

        //1. if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        //2. if-else
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //3. if-else-if ladder
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        //4. Nested if
        int userAge = 22;
        boolean hasID = true;

        if (userAge >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Underage");
        }

        //5. switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //6. switch fall-through example
        int value = 2;

        switch (value) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }
}
