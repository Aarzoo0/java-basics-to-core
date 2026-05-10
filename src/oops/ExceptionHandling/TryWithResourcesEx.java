package oops.ExceptionHandling;


class DatabaseConnection implements AutoCloseable {

    void connect() {
        System.out.println("Database connected");
    }

    void executeQuery() {
        System.out.println("Executing query...");
    }

    @Override
    public void close() {

        System.out.println("Database connection closed");
    }
}

public class TryWithResourcesEx {

    public static void main(String[] args) {

        // automatically closes connection
        try (DatabaseConnection db = new DatabaseConnection()) {

            db.connect();
            db.executeQuery();

        }
        catch (Exception e) {
            System.out.println("Database exception occurred");
        }
    }
}
