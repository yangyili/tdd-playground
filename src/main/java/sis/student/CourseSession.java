package sis.student;

import java.util.*;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSession {
    private static int count;
    private Date startDate;
    private String department;
    private String number;
    private List<Student> students;
    private int numberOfCredits;


    private CourseSession(String department, String number, Date startDate) {
        this.students = new ArrayList();
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public static CourseSession create(String department, String number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(department, number, startDate);
    }

    private static void incrementCount() {
        CourseSession.count++;
    }

    public static int getCount() {
        return CourseSession.count;
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
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public static void resetCount() {
        CourseSession.count = 0;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
