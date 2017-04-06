package student;

import java.util.SimpleTimeZone;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSession {
    private String department;
    private String number;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;

    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return 0;
    }
}
