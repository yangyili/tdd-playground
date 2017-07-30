package student;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 7/30/17.
 */
public class RosterReportTest {
    private Date createDate(int year, int month, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

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
