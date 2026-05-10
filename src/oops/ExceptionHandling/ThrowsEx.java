package oops.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsEx {

    static void readFile() throws IOException {

        FileReader fr =
                new FileReader("demo.txt");

        System.out.println(
                "File opened successfully"
        );
    }

    public static void main(String[] args) {

        try {

            readFile();

        }
        catch (IOException e) {

            System.out.println(
                    "File not found"
            );
        }
    }
}
