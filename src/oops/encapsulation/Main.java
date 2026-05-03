package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        //Encapsulation
        BankingSystem bankingSystem=new BankingSystem();
        bankingSystem.setAcc_number(12345);
        bankingSystem.setName("newUser");
        bankingSystem.withdraw(100);
        bankingSystem.deposit(500);
        bankingSystem.withdraw(200);
    }
}
