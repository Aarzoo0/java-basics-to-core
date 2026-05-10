package oops.inner_classes;

public class StaticNestedClassEx {

    public static void main(String[] args) {

        EcomSystem.Order e1=new EcomSystem.Order(2301,"shirt",1500);
        e1.displayOrder();

        System.out.println();

        //we can also access same as member inner class but in member inner class we cant make
        // EcomSystem.Order e1=new EcomSystem.Order();

//        EcomSystem e=new EcomSystem();
//        EcomSystem.Order e2=new EcomSystem.Order(9017,"jeans",4000);
//        e2.displayOrder();
    }
}
