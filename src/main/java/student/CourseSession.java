package student;

import java.util.*;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSession {
    private Date startDate;
    private String department;
    private String number;

    private List<Student> students;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        students = new ArrayList<Student>();

    }

    public CourseSession(String department, String number, Date startDate) {
        this(department, number);
        this.startDate = startDate;
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

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
}
