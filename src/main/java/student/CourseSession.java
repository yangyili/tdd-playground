package student;

import java.util.*;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSession {
    public static final String ROSTER_REPORT_HEADER = "header";
    public static final String ROSTER_REPORT_FOOTER = "footer";
    private Date startDate;
    private String department;
    private String number;
    private List<Student> students;


    public CourseSession(String department, String number, Date startDate) {
        this.students = new ArrayList();
        this.department = department;
        this.number = number;
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
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public String getRosterReport() {
        StringBuilder builder = new StringBuilder();
        builder.append(ROSTER_REPORT_HEADER);
        students.stream().forEach(student -> builder.append(student.getName() + "\n"));
        builder.append(ROSTER_REPORT_FOOTER + students.size() + "\n");
        return builder.toString();
    }
}
