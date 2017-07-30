package student;

import java.util.List;

/**
 * Created by afaren on 7/30/17.
 */
public class RosterReporter {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "----" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# Students = ";
    private final CourseSession session;


    public RosterReporter(CourseSession session) {
        this.session = session;
    }

    public String getReport() {
        StringBuilder report = new StringBuilder();
        report.append(ROSTER_REPORT_HEADER);
        List<Student> students = session.getAllStudents();
        students.forEach(student -> report.append(student.getName()).append(NEWLINE));
        report.append(ROSTER_REPORT_FOOTER).append(students.size()).append(NEWLINE);
        return report.toString();

    }
}
