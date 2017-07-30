package sis.report;

import org.junit.Test;
import sis.student.CourseSession;
import sis.student.Student;

import static org.junit.Assert.assertEquals;
import static sis.util.DateUtil.createDate;

/**
 * Created by afaren on 7/30/17.
 */
public class RosterReportTest {


    @Test
    public void test_roster_report() throws Exception {
        CourseSession english = new CourseSession("English", "111", createDate(2003, 1, 6));
        english.enroll(new Student("A"));
        english.enroll(new Student("B"));
        String rosterReport = new RosterReporter(english).getReport();

        assertEquals(RosterReporter.ROSTER_REPORT_HEADER
                        + "A" + RosterReporter.NEWLINE
                        + "B" + RosterReporter.NEWLINE
                        + RosterReporter.ROSTER_REPORT_FOOTER
                        + "2" + RosterReporter.NEWLINE,
                rosterReport);
    }
}
