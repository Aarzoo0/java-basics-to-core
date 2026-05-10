package oops.enums;


public enum Days {

    SUNDAY(false, "Weekend"),
    MONDAY(true, "Working Day"),
    TUESDAY(true, "Working Day"),
    WEDNESDAY(true, "Working Day"),
    THURSDAY(true, "Working Day"),
    FRIDAY(true, "Working Day"),
    SATURDAY(false, "Weekend");

    //  fields
    private boolean isWorkingDay;

    private String type;

    //  constructor
    Days(boolean isWorkingDay, String type) {

        this.isWorkingDay = isWorkingDay;
        this.type = type;
    }

    //  method
    public void displayInfo() {

        System.out.println(this.name() + " -> " + type);
    }

    //  getter
    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public String getType() {
        return type;
    }
}