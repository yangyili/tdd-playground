package student;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSession {
    private String department;
    private String number;

    private List<Student> students;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        students = new ArrayList<Student>();

    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }
}
