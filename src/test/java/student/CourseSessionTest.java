package student;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSessionTest {
    @Test
    public void test_create() throws Exception {
        CourseSession english = new CourseSession("ENGLISH", "101");
        assertEquals("ENGLISH", english.getDepartment());
        assertEquals("101", english.getNumber());

        assertEquals(0, english.getNumberOfStudents());
    }


    @Test
    public void test_enroll_students() throws Exception {
        CourseSession english = new CourseSession("ENGLISH","101" );

        assertEquals(0, english.getNumberOfStudents());

        english.enroll(new Student("student_1"));
        assertEquals(1, english.getNumberOfStudents());

        english.enroll(new Student("student_2"));
        assertEquals(2, english.getNumberOfStudents());

    }
}

