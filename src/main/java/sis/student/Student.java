package sis.student;

/**
 * Created by afaren on 3/24/17.
 */
public class Student {


    private String name;
    private int credits;

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }


    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= 12;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }
}
