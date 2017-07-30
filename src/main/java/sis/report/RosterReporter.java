package sis.report;

import sis.student.CourseSession;

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
        writeHeader(report);
        writeBody(report);
        writeFooter(report);
        return report.toString();

    }

    private void writeHeader(StringBuilder report) {
        report.append(ROSTER_REPORT_HEADER);
    }

    private void writeBody(StringBuilder report) {
        session.getAllStudents()
               .forEach(student -> report.append(student.getName()).append(NEWLINE));
    }

    private void writeFooter(StringBuilder report) {
        report.append(ROSTER_REPORT_FOOTER)
              .append(session.getAllStudents().size())
              .append(NEWLINE);
    }
}
