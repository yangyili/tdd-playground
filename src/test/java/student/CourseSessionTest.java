package student;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSessionTest {
    private CourseSession english;

    @Before
    public void setUp() throws Exception {
        int year = 103;
        int month = 1;
        int day = 6;
        Date startDate = createDate(year, month, day);

        english = new CourseSession("ENGLISH", "101", startDate);
    }

    @Test
    public void test_create() throws Exception {
        assertEquals("ENGLISH", english.getDepartment());
        assertEquals("101", english.getNumber());

        assertEquals(0, english.getNumberOfStudents());
    }


    @Test
    public void test_enroll_students() throws Exception {
        assertEquals(0, english.getNumberOfStudents());

        Student student_1 = new Student("student_1");
        english.enroll(student_1);
        assertEquals(1, english.getNumberOfStudents());
        assertEquals(student_1, english.get(0));

        Student student_2 = new Student("student_2");
        english.enroll(student_2);
        assertEquals(2, english.getNumberOfStudents());
        assertEquals(student_2, english.get(1));
    }

    @Test
    public void test_course_dates() throws Exception {
        int year = 103;
        int month = 4;
        int day = 25;
        Date sixteenWeeksOut = createDate(year, month, day);
        assertEquals(sixteenWeeksOut, english.getEndDate());
    }

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
        english.enroll(new Student("A"));
        english.enroll(new Student("B"));
        String rosterReport = english.getRosterReport();
        assertEquals(CourseSession.ROSTER_REPORT_HEADER + "A\nB\n" + CourseSession.ROSTER_REPORT_FOOTER + "2\n", rosterReport);
    }
}

