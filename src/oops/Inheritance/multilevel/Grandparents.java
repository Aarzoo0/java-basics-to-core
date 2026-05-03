package oops.Inheritance.multilevel;

public class Grandparents {
    private String name;

    private int age;

    void gentics(){
        System.out.println("Tall and dark hairs");
    }

    void eatingHabit(){
        System.out.println("Non-veg");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
