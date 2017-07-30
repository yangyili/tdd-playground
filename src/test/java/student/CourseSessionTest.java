package student;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by afaren on 4/6/17.
 */
public class CourseSessionTest {
    private CourseSession english;

    @Before
    public void setUp() throws Exception {
        english = new CourseSession("ENGLISH", "101");
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
}

