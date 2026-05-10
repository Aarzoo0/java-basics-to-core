package oops.inner_classes;

public class EcomSystem {

    static  String platform="amazon";

    //static nested class
    static class Order{
        int orderId;
        String prodName;
        double amount;

        public Order(int orderId, String prodName, double amount) {
            this.orderId = orderId;
            this.prodName = prodName;
            this.amount = amount;
        }

        void displayOrder(){
            // directly accessing static member of outer class
            System.out.println("Platform: " + platform);

            System.out.println("Order ID: " + orderId);
            System.out.println("Product: " + prodName);
            System.out.println("Price: ₹" + amount);

        }
    }

}
