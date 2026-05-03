package oops.Inheritance.multilevel;

public class Main {

    public static void main(String[] args) {
        Child child=new Child();
        child.gentics();       // overriding
        child.eatingHabit();   // from grandparents
        child.education();      //from parents
        child.career();        //own method


    }
}
