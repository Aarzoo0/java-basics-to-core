package oops;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model_name = "BMW";

        c1.accelerate();                    // calls method 1
        c1.accelerate(20);            // calls method 2
        c1.accelerate(10, 3);         // calls method 3

        System.out.println();

        //  Method Overriding
        Car c2 = new SportsCar();  // parent reference, child object
        c2.model_name = "Ferrari";

        c2.accelerate();  // calls overridden method

        System.out.println();


        //Encapsulation
        BankingSystem bankingSystem=new BankingSystem();
        bankingSystem.setAcc_number(12345);
        bankingSystem.setName("newUser");
        bankingSystem.withdraw(100);
        bankingSystem.deposit(500);
        bankingSystem.withdraw(200);


    }


}
