package sis.student;

/**
 * Created by afaren on 3/24/17.
 */
public class Student {


    public static String IN_STATE = "CO";
    private String name;
    private int credits;
    public static final int CREDITS_REQUEST_FOR_FULL_TIME = 12;
    private String state;

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }


    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUEST_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isInState() {
        return state != null && state.equalsIgnoreCase(Student.IN_STATE);
    }

    public void setState(String state) {
        this.state = state;
    }
}
