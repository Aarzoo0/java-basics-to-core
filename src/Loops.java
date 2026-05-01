public class Loops {
    public static void main(String[] args) {

        //  1. while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("while loop: " + i);
            i++;
        }

        //  2. do-while loop
        int j = 1;
        do {
            System.out.println("do-while loop: " + j);
            j++;
        } while (j <= 5);

        //  3. for loop (basic)
        for (int k = 1; k <= 5; k++) {
            System.out.println("for loop: " + k);
        }

        //  4. reverse for loop
        for (int k = 5; k >= 1; k--) {
            System.out.println("reverse loop: " + k);
        }

        //  5. break statement
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("break example: " + k);
        }

        //  6. continue statement
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println("continue example: " + k);
        }

        //  7. infinite loop (stopped using break)
        int x = 1;
        while (true) {
            if (x > 3) {
                break;
            }
            System.out.println("infinite loop controlled: " + x);
            x++;
        }

        // 8. nested loop (pattern example)
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
